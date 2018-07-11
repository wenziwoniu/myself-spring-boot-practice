package com.myself.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.myself.example.configuration.MyConfiguration;
import com.myself.example.dao.StudentDao;

/**
 * 该类在MyConfiguration类中被定义为一个spring bean
 * @author zwwang
 *
 */
public class StudentManageService {
	
	@Autowired
	private MyConfiguration configuration;
	
	@Autowired
	private StudentDao studentDao;
	
	public String getNameByNo(String studentNo) {
		
		return studentNo + "安徽理工123";
	}
	
	public String getName() {
		
		return configuration.getName();
	}
	
	public int getCountOfStudent() {
		
		return studentDao.getCountOfStudent();
	}
	
	public void saveContactInfo() {
		
		studentDao.saveContactInfo();
	}
}
