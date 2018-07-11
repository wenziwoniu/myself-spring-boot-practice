package com.myself.example.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * SysUserInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "system_user_info")
public class SystemUserInfo {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = -8015292471875197576L;
	private Long id;
	private String loginName;
	private String userName;
	private String password;
	private Integer jpaVersion;
	private String createOperator;
	private Date createTime;
	private String lastModifyOperator;
	private Date lastModifyTime;

	// Constructors

	/** default constructor */
	public SystemUserInfo() {
	}

	/** minimal constructor */
	public SystemUserInfo(String loginName, String userName, String password,
			Integer jpaVersion) {
		this.loginName = loginName;
		this.userName = userName;
		this.password = password;
		this.jpaVersion = jpaVersion;
	}

	/** full constructor */
	public SystemUserInfo(String loginName, String userName, String password,
			Integer jpaVersion, String createOperator, Date createTime,
			String lastModifyOperator, Date lastModifyTime) {
		this.loginName = loginName;
		this.userName = userName;
		this.password = password;
		this.jpaVersion = jpaVersion;
		this.createOperator = createOperator;
		this.createTime = createTime;
		this.lastModifyOperator = lastModifyOperator;
		this.lastModifyTime = lastModifyTime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "LOGIN_NAME", unique = true, nullable = false, length = 64)
	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Column(name = "USER_NAME", nullable = false, length = 64)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "PASSWORD", nullable = false, length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Version
	@Column(name = "JPA_VERSION", nullable = false)
	public Integer getJpaVersion() {
		return this.jpaVersion;
	}

	public void setJpaVersion(Integer jpaVersion) {
		this.jpaVersion = jpaVersion;
	}

	@Column(name = "CREATE_OPERATOR", length = 64)
	public String getCreateOperator() {
		return this.createOperator;
	}

	public void setCreateOperator(String createOperator) {
		this.createOperator = createOperator;
	}

	@Column(name = "CREATE_TIME", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "LAST_MODIFY_OPERATOR", length = 64)
	public String getLastModifyOperator() {
		return this.lastModifyOperator;
	}

	public void setLastModifyOperator(String lastModifyOperator) {
		this.lastModifyOperator = lastModifyOperator;
	}

	@Column(name = "LAST_MODIFY_TIME", length = 19)
	public Date getLastModifyTime() {
		return this.lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

}