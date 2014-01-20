package com.amsoftgroup.geospatial.dc.hibernate;

// Generated Jan 8, 2012 5:37:14 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Metrostations generated by hbm2java
 */
@XmlRootElement
public class Metrostations implements java.io.Serializable {

	private int gid;
	private Long objectid1;
	private BigDecimal objectid2;
	private BigDecimal objectid;
	private String gisId;
	private String name;
	private String webUrl;
	private String address;
	private String line;
	//private Serializable theGeom;

	public Metrostations() {
	}

	public Metrostations(int gid) {
		this.gid = gid;
	}

	public Metrostations(int gid, Long objectid1, BigDecimal objectid2,
			BigDecimal objectid, String gisId, String name, String webUrl,
			String address, String line, Serializable theGeom) {
		this.gid = gid;
		this.objectid1 = objectid1;
		this.objectid2 = objectid2;
		this.objectid = objectid;
		this.gisId = gisId;
		this.name = name;
		this.webUrl = webUrl;
		this.address = address;
		this.line = line;
		//this.theGeom = theGeom;
	}

	public int getGid() {
		return this.gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public Long getObjectid1() {
		return this.objectid1;
	}

	public void setObjectid1(Long objectid1) {
		this.objectid1 = objectid1;
	}

	public BigDecimal getObjectid2() {
		return this.objectid2;
	}

	public void setObjectid2(BigDecimal objectid2) {
		this.objectid2 = objectid2;
	}

	public BigDecimal getObjectid() {
		return this.objectid;
	}

	public void setObjectid(BigDecimal objectid) {
		this.objectid = objectid;
	}

	public String getGisId() {
		return this.gisId;
	}

	public void setGisId(String gisId) {
		this.gisId = gisId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebUrl() {
		return this.webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLine() {
		return this.line;
	}

	public void setLine(String line) {
		this.line = line;
	}
/*
	public Serializable getTheGeom() {
		return this.theGeom;
	}

	public void setTheGeom(Serializable theGeom) {
		this.theGeom = theGeom;
	}
*/
}
