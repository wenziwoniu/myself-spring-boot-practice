package com.myself.example.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 通过@ConfigurationProperties注解，可将相关属性注入到实体对应字段上，但该类并不被spring管理
 * 通过@Component注解，该类被Spring管理，可被其它bean注入使用
 * @author zwwang
 *
 */
@ConfigurationProperties(prefix = "druid.datasource")
public class DataSourceProperties {
	
	private String url;
	
	private String username;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
