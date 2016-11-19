package com.smart.windows.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Mainfacility entity. @author MyEclipse Persistence Tools
 */

public class Mainfacility implements java.io.Serializable {

	// Fields

	private Integer mainFaclityId;
	private Familyadmin familyadmin;
	private Integer physicalId;
	private String name;
	private String status;
	private Set affiliatedfacilitywindowses = new HashSet(0);
	private Set affiliatedfacilitykeies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Mainfacility() {
	}

	/** minimal constructor */
	public Mainfacility(Integer physicalId, String name, String status) {
		this.physicalId = physicalId;
		this.name = name;
		this.status = status;
	}

	/** full constructor */
	public Mainfacility(Familyadmin familyadmin, Integer physicalId,
			String name, String status, Set affiliatedfacilitywindowses,
			Set affiliatedfacilitykeies) {
		this.familyadmin = familyadmin;
		this.physicalId = physicalId;
		this.name = name;
		this.status = status;
		this.affiliatedfacilitywindowses = affiliatedfacilitywindowses;
		this.affiliatedfacilitykeies = affiliatedfacilitykeies;
	}

	// Property accessors

	public Integer getMainFaclityId() {
		return this.mainFaclityId;
	}

	public void setMainFaclityId(Integer mainFaclityId) {
		this.mainFaclityId = mainFaclityId;
	}

	public Familyadmin getFamilyadmin() {
		return this.familyadmin;
	}

	public void setFamilyadmin(Familyadmin familyadmin) {
		this.familyadmin = familyadmin;
	}

	public Integer getPhysicalId() {
		return this.physicalId;
	}

	public void setPhysicalId(Integer physicalId) {
		this.physicalId = physicalId;
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

	public Set getAffiliatedfacilitywindowses() {
		return this.affiliatedfacilitywindowses;
	}

	public void setAffiliatedfacilitywindowses(Set affiliatedfacilitywindowses) {
		this.affiliatedfacilitywindowses = affiliatedfacilitywindowses;
	}

	public Set getAffiliatedfacilitykeies() {
		return this.affiliatedfacilitykeies;
	}

	public void setAffiliatedfacilitykeies(Set affiliatedfacilitykeies) {
		this.affiliatedfacilitykeies = affiliatedfacilitykeies;
	}

}