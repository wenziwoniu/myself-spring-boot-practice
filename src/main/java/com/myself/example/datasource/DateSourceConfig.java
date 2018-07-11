package com.myself.example.datasource;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 配置数据源
 * 如果不自己制定数据源，spring boot会根据策略字段配置一个数据源
 * @author zwwang
 *
 */
@Configuration
@EnableConfigurationProperties(DataSourceProperties.class)
public class DateSourceConfig {

	/**
	 * 注册一个id="dataSource"的DatSource供数据库交互使用，
	 * 使用配置文件中前缀为${prefix}的配置属性
	 * 此处必须使用@ConfigurationProperties来获取属性配置，否则不会默认读取application.properties文件中的任何配置
	 * 
	 * 本例中使用的是DruidDataSource 其加载jdbcurl配置的属性名称是url,所以配置文件必须是该种格式，例如：spring.datasource.url
	 */
	@Bean
	//读取application.properties中spring.datasource.*的配置去给dataSource赋值
//	@ConfigurationProperties(prefix = "spring.datasource")
	//读取application.properties中druid.datasource.*的配置去给dataSource赋值
	@ConfigurationProperties(prefix = "druid.datasource")
	public DataSource dataSource() {
		
		System.out.println("==============DataSource init===================");
		
		
		return new DruidDataSource();
	}
	
	/**
	 * 该种方法基于classpath下的类，来自己决定实例化哪种类型的dataSource
	 * 因为只有运行时才知道具体是哪种dataSource，而dataSource的属性名并不一定相同，所以必须使用和类型无关的配置，已url为例
	 * app.datasource.jdbc-url=jdbc:mysql://localhost/test 通用配置
	 * druid.datasource.url=jdbc:mysql://192.168.72.1/mavenpractice 可能不会生效
	 */
//	@Bean
//	@ConfigurationProperties("app.datasource")
//	public DataSource dataSource() {
//		return DataSourceBuilder.create().build();
		//明确指定所使用的dataSource类型
//		return DataSourceBuilder.create().type(HikariDataSource.class).build();
//	}
	
	
	
/*	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			EntityManagerFactoryBuilder builder) {
		
		return builder
				.dataSource(dataSource())
				.packages(SystemUserInfo.class)
				.persistenceUnit(null)
				.build();
	}*/
}
