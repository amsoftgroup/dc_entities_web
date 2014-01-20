package com.amsoftgroup.geospatial.dc.business;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EntityType {
	
	private int EntityId;
	private String EntityDescription;
	private double distance;
	
	public void setEntityId(int entityId) {
		EntityId = entityId;
	}
	public int getEntityId() {
		return EntityId;
	}
	public void setEntityDescription(String entityDescription) {
		EntityDescription = entityDescription;
	}
	public String getEntityDescription() {
		return EntityDescription;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
}
