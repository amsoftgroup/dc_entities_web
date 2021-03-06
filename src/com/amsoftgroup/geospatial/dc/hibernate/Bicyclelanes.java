package com.amsoftgroup.geospatial.dc.hibernate;

// Generated Jan 8, 2012 5:37:14 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Bicyclelanes generated by hbm2java
 */
@XmlRootElement
public class Bicyclelanes implements java.io.Serializable {

	private int gid;
	private String facilityid;
	private Long streetsegi;
	private String sourceid;
	private BigDecimal bikelanele;
	private String facility;
	private String proposedcy;
	private BigDecimal len;
	private BigDecimal shapeLen;
	//private Serializable theGeom;

	public Bicyclelanes() {
	}

	public Bicyclelanes(int gid) {
		this.gid = gid;
	}

	public Bicyclelanes(int gid, String facilityid, Long streetsegi,
			String sourceid, BigDecimal bikelanele, String facility,
			String proposedcy, BigDecimal len, BigDecimal shapeLen,
			Serializable theGeom) {
		this.gid = gid;
		this.facilityid = facilityid;
		this.streetsegi = streetsegi;
		this.sourceid = sourceid;
		this.bikelanele = bikelanele;
		this.facility = facility;
		this.proposedcy = proposedcy;
		this.len = len;
		this.shapeLen = shapeLen;
		//this.theGeom = theGeom;
	}

	public int getGid() {
		return this.gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getFacilityid() {
		return this.facilityid;
	}

	public void setFacilityid(String facilityid) {
		this.facilityid = facilityid;
	}

	public Long getStreetsegi() {
		return this.streetsegi;
	}

	public void setStreetsegi(Long streetsegi) {
		this.streetsegi = streetsegi;
	}

	public String getSourceid() {
		return this.sourceid;
	}

	public void setSourceid(String sourceid) {
		this.sourceid = sourceid;
	}

	public BigDecimal getBikelanele() {
		return this.bikelanele;
	}

	public void setBikelanele(BigDecimal bikelanele) {
		this.bikelanele = bikelanele;
	}

	public String getFacility() {
		return this.facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public String getProposedcy() {
		return this.proposedcy;
	}

	public void setProposedcy(String proposedcy) {
		this.proposedcy = proposedcy;
	}

	public BigDecimal getLen() {
		return this.len;
	}

	public void setLen(BigDecimal len) {
		this.len = len;
	}

	public BigDecimal getShapeLen() {
		return this.shapeLen;
	}

	public void setShapeLen(BigDecimal shapeLen) {
		this.shapeLen = shapeLen;
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
