package com.myself.example.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyConnection {
	
	//JdbcTemplate已经被spring管理，所以可以直接注入
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MyConnection(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void test() {
		
		jdbcTemplate.afterPropertiesSet();
	}
}
