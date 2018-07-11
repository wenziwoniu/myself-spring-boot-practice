package com.myself.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//对于该类package父目录的类，不予扫描，需要显式引入 或其它未被默认扫描的类，此处可以指定为spring组件
//通过import引入的类会被注册为spring bean组件，即使该类没有加@Component注解
//@Import(value={Test.class})
//@ComponentScan(value={"com.myself.example.controller","com.myself.example.test"})
//通过@ComponentScan注解，spring默认扫描该类所在包及其子包下有@Component注解(包括@Configuration)的类,并把
//这些类注册成spring bean组件
@ComponentScan

//扫描指定包下的有@Entity的实体，若不定义改注解，则默认扫描ApplicationContextBuild类所在的包及其子包下有@Entity的类
//@EntityScan(basePackages = "com.myself.entity")

//Spring Boot tries to guess the location of your @Repository definitions, based on the @EnableAutoConfiguration it finds. 
//To get more control, use the @EnableJpaRepositories annotation (from Spring Data JPA)
//默认会扫描该包所有资包下的继承了Repository的接口，通过@EnableJpaRepositories可以进行跟细化的配置
@EnableJpaRepositories

//使用@EnableAutoConfiguration注解，spring会根据你项目中引入的jar，判断你的项目类型并自动进行相关配置，例如项目中引入tomcat和spring mvc相关
//的jar,则通过该注解，会把项目自动构建为一个web项目
@EnableAutoConfiguration

//tags the class as a source of bean definitions for the application context
//该注解下的类也必须被显示的声明为spring组件才会生效，通过@ComponentScan扫描或@Import(value={ConfigurationDemo.class})进行引入

//该类可以当做主配置类，可以建立其它配置类，然后通过@Import引入即可
@Configuration

//使用该注解相当于同时使用 @EnableAutoConfiguration @ComponentScan @Configuration 三个注解
//@SpringBootApplication 

//该注解的值所指定的配置类会被注册为Spring Bean
//@EnableConfigurationProperties(DataSourceProperties.class)
public class ApplicationContextBuild {
	
	public static void main(String[] args) {
		
		//ApplicationContextBuild在这里会自动成为spring的组件
		SpringApplication.run(ApplicationContextBuild.class, args);
//		SpringApplication app = new SpringApplication(ApplicationContextBuild.class);
//		app.addListeners(new ApplicationStartingListener());
//		
//		app.setAdditionalProfiles("production");
//		app.run(args);
//		app.setBannerMode(Banner.Mode.OFF);
//		System.out.println(SpringApplication.exit(app.run(args), exitCodeGeneratorCustomer));
	}
	
}
