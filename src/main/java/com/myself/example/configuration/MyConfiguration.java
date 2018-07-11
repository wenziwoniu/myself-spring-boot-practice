package com.myself.example.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.myself.example.service.StudentManageService;

@Configuration
public class MyConfiguration {
	
	
	/**
	 * 项目启动时，被spring自动扫描和初始化该类
	 */
	public MyConfiguration() {
		
		System.out.println("MyConfiguration初始化==================" + getName());
	}
	
	/**
	 * StudentManageService类未加Component注解，不会被扫描成为spring组件，此处把它单独定义为一个spring bean
	 * 类似于 xml文件中的<bean id="studentManageService" />
	 * 功能：
	 * 时间：2018年6月2日 下午9:07:01
	 */
	@Bean
	public StudentManageService studentManageService() {
		
		return new StudentManageService();
	}
	
//	@Bean
//	public MyErrorViewResolver myErrorViewResolver() {
//		
//		return new MyErrorViewResolver();
//	}
//	
	/**
	 * 获取name属性值，其优先级大致如下（数字越小优先级越高）
	 * 1、Command line arguments. 例如 --name=wang
	 * 2、Java System properties  例如 -Dname=li
	 * 3、application.properties  例如 name=chen
	 */
	@Value("${province}")
	private String name;
	
	@Autowired
	private Environment environment;
	
	public String getName() {
		
		System.out.println("获取姓名:" + name);
//		System.out.println(servers.size());
//		System.out.println(environment.getProperty("profile"));
		
		return name;
	}

}
