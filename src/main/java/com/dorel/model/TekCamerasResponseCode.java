package com.dorel.model;

import java.io.Serializable;

public class TekCamerasResponseCode implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int  code;
	private String description;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "TekCamerasResponseCode [code=" + code + ", description=" + description + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
