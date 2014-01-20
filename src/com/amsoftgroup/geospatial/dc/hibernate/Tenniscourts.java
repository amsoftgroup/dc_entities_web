package com.amsoftgroup.geospatial.dc.hibernate;

// Generated Jan 8, 2012 5:37:14 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Tenniscourts generated by hbm2java
 */
@XmlRootElement
public class Tenniscourts implements java.io.Serializable {

	private int gid;
	private Long id;
	private BigDecimal ward;
	private String name;
	private String address;
	private BigDecimal courts;
	private String condition;
	private String lights;
	private String surface;
	//private Serializable theGeom;

	public Tenniscourts() {
	}

	public Tenniscourts(int gid) {
		this.gid = gid;
	}

	public Tenniscourts(int gid, Long id, BigDecimal ward, String name,
			String address, BigDecimal courts, String condition, String lights,
			String surface, Serializable theGeom) {
		this.gid = gid;
		this.id = id;
		this.ward = ward;
		this.name = name;
		this.address = address;
		this.courts = courts;
		this.condition = condition;
		this.lights = lights;
		this.surface = surface;
		//this.theGeom = theGeom;
	}

	public int getGid() {
		return this.gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getWard() {
		return this.ward;
	}

	public void setWard(BigDecimal ward) {
		this.ward = ward;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getCourts() {
		return this.courts;
	}

	public void setCourts(BigDecimal courts) {
		this.courts = courts;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getLights() {
		return this.lights;
	}

	public void setLights(String lights) {
		this.lights = lights;
	}

	public String getSurface() {
		return this.surface;
	}

	public void setSurface(String surface) {
		this.surface = surface;
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
