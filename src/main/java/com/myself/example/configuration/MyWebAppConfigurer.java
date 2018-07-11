package com.myself.example.configuration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@Configuration
@SuppressWarnings("deprecation")
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {

	/**
	 *  http://localhost:8081/test/index.html  则访问文件src/main/resources/other/index.html
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry.addResourceHandler("/**").addResourceLocations("classpath:/other/");
		super.addResourceHandlers(registry);
	}
}
