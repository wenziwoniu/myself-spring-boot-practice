package com.myself.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserContactInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user_contact_info")
public class UserContactInfo {

	// Fields

	private Long id;
	private String userId;
	private String contactInfoType;
	private String contactInfoContent;
	private String createOperator;
	private Date createTime;
	private String lastModifyOperator;
	private Date lastModifyTime;

	// Constructors

	/** default constructor */
	public UserContactInfo() {
	}

	/** minimal constructor */
	public UserContactInfo(String userId) {
		this.userId = userId;
	}

	/** full constructor */
	public UserContactInfo(String userId, String contactInfoType,
			String contactInfoContent, String createOperator,
			Date createTime, String lastModifyOperator,
			Date lastModifyTime) {
		this.userId = userId;
		this.contactInfoType = contactInfoType;
		this.contactInfoContent = contactInfoContent;
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

	@Column(name = "USER_ID", nullable = false, length = 64)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "CONTACT_INFO_TYPE", length = 64)
	public String getContactInfoType() {
		return this.contactInfoType;
	}

	public void setContactInfoType(String contactInfoType) {
		this.contactInfoType = contactInfoType;
	}

	@Column(name = "CONTACT_INFO_CONTENT")
	public String getContactInfoContent() {
		return this.contactInfoContent;
	}

	public void setContactInfoContent(String contactInfoContent) {
		this.contactInfoContent = contactInfoContent;
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