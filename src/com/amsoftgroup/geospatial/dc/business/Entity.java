package com.amsoftgroup.geospatial.dc.business;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Entity {

	double lat;
	double lon;
	double distance;
	String description; 
	private int gid;
	private int entityTypeId;
	private HashMap attributes;
	

	public int getEntityTypeId() {
		return entityTypeId;
	}
	public void setEntityTypeId(int entityTypeId) {
		this.entityTypeId = entityTypeId;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public HashMap getAttributes() {
		return attributes;
	}
	public void setAttributes(HashMap attributes) {
		this.attributes = attributes;
	}	
}
