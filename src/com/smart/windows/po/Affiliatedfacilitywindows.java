package com.smart.windows.po;

/**
 * Affiliatedfacilitywindows entity. @author MyEclipse Persistence Tools
 */

public class Affiliatedfacilitywindows implements java.io.Serializable {

	// Fields

	private Integer windowsId;
	private Mainfacility mainfacility;
	private String status;
	private String value;
	private Integer user0id;
	private Integer user1id;
	private Integer user2id;
	private Integer user3id;
	private Integer user4id;
	private Integer user5id;
	private Integer user6id;
	private Integer user7id;
	private Integer user8id;
	private Integer user9id;

	// Constructors

	/** default constructor */
	public Affiliatedfacilitywindows() {
	}

	/** full constructor */
	public Affiliatedfacilitywindows(Mainfacility mainfacility, String status,
			String value, Integer user0id, Integer user1id, Integer user2id,
			Integer user3id, Integer user4id, Integer user5id, Integer user6id,
			Integer user7id, Integer user8id, Integer user9id) {
		this.mainfacility = mainfacility;
		this.status = status;
		this.value = value;
		this.user0id = user0id;
		this.user1id = user1id;
		this.user2id = user2id;
		this.user3id = user3id;
		this.user4id = user4id;
		this.user5id = user5id;
		this.user6id = user6id;
		this.user7id = user7id;
		this.user8id = user8id;
		this.user9id = user9id;
	}

	// Property accessors

	public Integer getWindowsId() {
		return this.windowsId;
	}

	public void setWindowsId(Integer windowsId) {
		this.windowsId = windowsId;
	}

	public Mainfacility getMainfacility() {
		return this.mainfacility;
	}

	public void setMainfacility(Mainfacility mainfacility) {
		this.mainfacility = mainfacility;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getUser0id() {
		return this.user0id;
	}

	public void setUser0id(Integer user0id) {
		this.user0id = user0id;
	}

	public Integer getUser1id() {
		return this.user1id;
	}

	public void setUser1id(Integer user1id) {
		this.user1id = user1id;
	}

	public Integer getUser2id() {
		return this.user2id;
	}

	public void setUser2id(Integer user2id) {
		this.user2id = user2id;
	}

	public Integer getUser3id() {
		return this.user3id;
	}

	public void setUser3id(Integer user3id) {
		this.user3id = user3id;
	}

	public Integer getUser4id() {
		return this.user4id;
	}

	public void setUser4id(Integer user4id) {
		this.user4id = user4id;
	}

	public Integer getUser5id() {
		return this.user5id;
	}

	public void setUser5id(Integer user5id) {
		this.user5id = user5id;
	}

	public Integer getUser6id() {
		return this.user6id;
	}

	public void setUser6id(Integer user6id) {
		this.user6id = user6id;
	}

	public Integer getUser7id() {
		return this.user7id;
	}

	public void setUser7id(Integer user7id) {
		this.user7id = user7id;
	}

	public Integer getUser8id() {
		return this.user8id;
	}

	public void setUser8id(Integer user8id) {
		this.user8id = user8id;
	}

	public Integer getUser9id() {
		return this.user9id;
	}

	public void setUser9id(Integer user9id) {
		this.user9id = user9id;
	}

}