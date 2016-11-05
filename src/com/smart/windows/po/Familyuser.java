package com.smart.windows.po;

/**
 * Familyuser entity. @author MyEclipse Persistence Tools
 */

public class Familyuser implements java.io.Serializable {

	// Fields

	private Integer familyUserId;
	private Familyadmin familyadmin;
	private String name;
	private String status;
	private String pwd;

	// Constructors

	/** default constructor */
	public Familyuser() {
	}

	/** minimal constructor */
	public Familyuser(String name, String status, String pwd) {
		this.name = name;
		this.status = status;
		this.pwd = pwd;
	}

	/** full constructor */
	public Familyuser(Familyadmin familyadmin, String name, String status,
			String pwd) {
		this.familyadmin = familyadmin;
		this.name = name;
		this.status = status;
		this.pwd = pwd;
	}

	// Property accessors

	public Integer getFamilyUserId() {
		return this.familyUserId;
	}

	public void setFamilyUserId(Integer familyUserId) {
		this.familyUserId = familyUserId;
	}

	public Familyadmin getFamilyadmin() {
		return this.familyadmin;
	}

	public void setFamilyadmin(Familyadmin familyadmin) {
		this.familyadmin = familyadmin;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}