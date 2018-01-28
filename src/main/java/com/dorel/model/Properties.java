package com.dorel.model;

import java.io.Serializable;

public class Properties implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String propertyname;
	private String value;
	
	public String getPropertyname() {
		return propertyname;
	}
	public void setPropertyname(String propertyname) {
		this.propertyname = propertyname;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Properties [propertyname=" + propertyname + ", value=" + value + "]";
	}
	
}
