package com.myself.example.controller.school;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.myself.example.datasource.DataSourceProperties;
import com.myself.example.service.StudentManageService;

@Controller
public class StudentController {
	
	private static final Log log = LogFactory.getLog(StudentController.class);

	@Autowired
	private StudentManageService studentManageService;
	
	@Autowired
	private DataSourceProperties dataSourceProperties;
	
	@RequestMapping(value="/getNameByNo")
	@ResponseBody
	public String getNameByNo() {
		
		System.out.println("abcde");
		
		System.out.println(dataSourceProperties.getUrl());
		
		return studentManageService.getName();
	}
	
	@RequestMapping(value="/getName")
	@ResponseBody
	public ModelAndView getName() {
		
		return new ModelAndView("index.html");
	}
	
	@RequestMapping(value="/getCount")
	@ResponseBody
	public int getCountOfStudent() {
		
		Integer.parseInt("a");
		
		log.info("------------调用getCountOfStudent开始-----------------");
		
		return studentManageService.getCountOfStudent();
	}
	
	@RequestMapping(value="/saveContactInfo")
	@ResponseBody
	public int saveContactInfo() {
		
		studentManageService.saveContactInfo();
		
		return 2232;
	}
}
