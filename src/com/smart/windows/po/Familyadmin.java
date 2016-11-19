package com.smart.windows.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Familyadmin entity. @author MyEclipse Persistence Tools
 */

public class Familyadmin implements java.io.Serializable {

	// Fields

	private Integer familyAdminId;
	private String name;
	private String pwd;
	private String status;
	private String sex;
	private String emil;
	private Integer tel;
	private String familyAddress;
	private Set mainfacilities = new HashSet(0);
	private Set familyusers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Familyadmin() {
	}

	/** minimal constructor */
	public Familyadmin(String name, String pwd, String status,
			String familyAddress) {
		this.name = name;
		this.pwd = pwd;
		this.status = status;
		this.familyAddress = familyAddress;
	}

	/** full constructor */
	public Familyadmin(String name, String pwd, String status, String sex,
			String emil, Integer tel, String familyAddress, Set mainfacilities,
			Set familyusers) {
		this.name = name;
		this.pwd = pwd;
		this.status = status;
		this.sex = sex;
		this.emil = emil;
		this.tel = tel;
		this.familyAddress = familyAddress;
		this.mainfacilities = mainfacilities;
		this.familyusers = familyusers;
	}

	// Property accessors

	public Integer getFamilyAdminId() {
		return this.familyAdminId;
	}

	public void setFamilyAdminId(Integer familyAdminId) {
		this.familyAdminId = familyAdminId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmil() {
		return this.emil;
	}

	public void setEmil(String emil) {
		this.emil = emil;
	}

	public Integer getTel() {
		return this.tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public String getFamilyAddress() {
		return this.familyAddress;
	}

	public void setFamilyAddress(String familyAddress) {
		this.familyAddress = familyAddress;
	}

	public Set getMainfacilities() {
		return this.mainfacilities;
	}

	public void setMainfacilities(Set mainfacilities) {
		this.mainfacilities = mainfacilities;
	}

	public Set getFamilyusers() {
		return this.familyusers;
	}

	public void setFamilyusers(Set familyusers) {
		this.familyusers = familyusers;
	}

}