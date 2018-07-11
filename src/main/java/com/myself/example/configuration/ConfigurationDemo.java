package com.myself.example.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationDemo {
	

	public ConfigurationDemo() {
		
		System.out.println("ConfigurationDemo被spring加载成组件");
	}
}
