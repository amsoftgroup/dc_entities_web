package com.amsoftgroup.geospatial.dc.hibernate;

// Generated Jan 8, 2012 5:37:14 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Policestations generated by hbm2java
 */
@XmlRootElement
public class Policestations implements java.io.Serializable {

	private int gid;
	private Long objectid;
	private String contact;
	private String room;
	private BigDecimal zip;
	private String phone;
	private String fax;
	private String name;
	private String address;
	private String webUrl;
	private String gisId;
	private String type;
	private Long addressId;
	//private Serializable theGeom;

	public Policestations() {
	}

	public Policestations(int gid) {
		this.gid = gid;
	}

	public Policestations(int gid, Long objectid, String contact, String room,
			BigDecimal zip, String phone, String fax, String name,
			String address, String webUrl, String gisId, String type,
			Long addressId, Serializable theGeom) {
		this.gid = gid;
		this.objectid = objectid;
		this.contact = contact;
		this.room = room;
		this.zip = zip;
		this.phone = phone;
		this.fax = fax;
		this.name = name;
		this.address = address;
		this.webUrl = webUrl;
		this.gisId = gisId;
		this.type = type;
		this.addressId = addressId;
		//this.theGeom = theGeom;
	}

	public int getGid() {
		return this.gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public Long getObjectid() {
		return this.objectid;
	}

	public void setObjectid(Long objectid) {
		this.objectid = objectid;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getRoom() {
		return this.room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public BigDecimal getZip() {
		return this.zip;
	}

	public void setZip(BigDecimal zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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

	public String getWebUrl() {
		return this.webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public String getGisId() {
		return this.gisId;
	}

	public void setGisId(String gisId) {
		this.gisId = gisId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
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
