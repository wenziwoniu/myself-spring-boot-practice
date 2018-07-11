package com.myself.example.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myself.example.entity.UserContactInfo;


@Repository
public class StudentDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	private final JdbcTemplate jdbcTemplate;
	
	public StudentDao(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 * 可以使用jdbcTemplate或者jpa
	 * 功能：
	 * 时间：2018年6月4日 下午4:08:08
	 */
	public int getCountOfStudent() {
		
		
		StringBuffer sqlBuffer = new StringBuffer("select count(*) from student");
//		StringBuffer sqlBuffer = new StringBuffer("delete from student");
		int count1 = jdbcTemplate.queryForObject(sqlBuffer.toString(), Integer.class);
		System.out.println(count1);
//		int count = jdbcTemplate.update(sql);
		
//		System.out.println("总数：" + count);
		
		Query query = entityManager.createNativeQuery(sqlBuffer.toString());
		String count = query.getSingleResult().toString();
		
		return Integer.valueOf(count);
	}
	
	@Transactional
	public void saveContactInfo() {
		
		com.myself.example.entity.UserContactInfo contactInfo = new UserContactInfo();
//		contactInfo.setUserId("6");
		contactInfo.setUserId("f");
		
		entityManager.persist(contactInfo);
		
	}
}
