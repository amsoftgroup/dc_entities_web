package com.amsoftgroup.geospatial.dc.business;

import java.util.ArrayList;

public class AbstractEntity {
	
	private int entityType;
	private Object o;
	
	public void setEntityType(int entityType) {
		this.entityType = entityType;
	}
	public int getEntityType() {
		return entityType;
	}
	public void setO(Object o) {
		this.o = o;
	}
	public Object getO() {
		return o;
	}

}
