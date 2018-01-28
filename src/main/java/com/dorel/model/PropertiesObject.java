package com.dorel.model;

import java.util.List;

public class PropertiesObject {
	private List<Properties> properties;
	public List<Properties> getProperties() {
		return properties;
	}
	public void setProperties(List<Properties> properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "PropertiesObject [properties=" + properties + "]";
	}
	
}
