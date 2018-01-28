package com.dorel.model;

import java.io.Serializable;
import java.util.UUID;

public class FirmwareModel implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID djguserid;
	private String newversion;
	private String productserialno;
	private long updatedate;
	private String devicetoken;
	
	
	public String getDevicetoken() {
		return devicetoken;
	}
	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}
	public UUID getDjguserid() {
		return djguserid;
	}
	public void setDjguserid(UUID djguserid) {
		this.djguserid = djguserid;
	}
	public String getNewversion() {
		return newversion;
	}
	public void setNewversion(String newversion) {
		this.newversion = newversion;
	}
	public String getProductserialno() {
		return productserialno;
	}
	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}
	public long getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(long updatedate) {
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "FirmwareModel [djguserid=" + djguserid + ", newversion=" + newversion + ", productserialno="
				+ productserialno + ", updatedate=" + updatedate + "]";
	}
	
}
