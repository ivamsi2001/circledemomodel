package com.dorel.model;

public class UpdateCameraModel {
	
	private String djguserid;
	private String productserialno;
	private String pairedproductid;
	private String displayName;
	private String displayimage;
	private String devicetoken;
	
	public String getDevicetoken() {
		return devicetoken;
	}
	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}
	
	public String getDisplayimage() {
		return displayimage;
	}
	public void setDisplayimage(String displayimage) {
		this.displayimage = displayimage;
	}
	
	public String getDjguserid() {
		return djguserid;
	}
	public void setDjguserid(String djguserid) {
		this.djguserid = djguserid;
	}
	

	public String getProductserialno() {
		return productserialno;
	}
	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}
	public String getPairedproductid() {
		return pairedproductid;
	}
	public void setPairedproductid(String pairedproductid) {
		this.pairedproductid = pairedproductid;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}
