package com.amsoftgroup.geospatial.dc.hibernate;

// Generated Jan 8, 2012 5:37:14 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Barsandliquor generated by hbm2java
 */
@XmlRootElement
public class Barsandliquor implements java.io.Serializable {

	private int gid;
	private String license;
	private String applicant;
	private String tradeName;
	private String descriptio;
	private String address;
	private BigDecimal x;
	private BigDecimal y;
	private Long addrid;
	//private Serializable theGeom;

	public Barsandliquor() {
	}

	public Barsandliquor(int gid) {
		this.gid = gid;
	}

	public Barsandliquor(int gid, String license, String applicant,
			String tradeName, String descriptio, String address, BigDecimal x,
			BigDecimal y, Long addrid, Serializable theGeom) {
		this.gid = gid;
		this.license = license;
		this.applicant = applicant;
		this.tradeName = tradeName;
		this.descriptio = descriptio;
		this.address = address;
		this.x = x;
		this.y = y;
		this.addrid = addrid;
		//this.theGeom = theGeom;
	}

	public int getGid() {
		return this.gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getLicense() {
		return this.license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getApplicant() {
		return this.applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getTradeName() {
		return this.tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getDescriptio() {
		return this.descriptio;
	}

	public void setDescriptio(String descriptio) {
		this.descriptio = descriptio;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getX() {
		return this.x;
	}

	public void setX(BigDecimal x) {
		this.x = x;
	}

	public BigDecimal getY() {
		return this.y;
	}

	public void setY(BigDecimal y) {
		this.y = y;
	}

	public Long getAddrid() {
		return this.addrid;
	}

	public void setAddrid(Long addrid) {
		this.addrid = addrid;
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
