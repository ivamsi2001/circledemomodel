package com.dorel.model;


public class UpdateCameraSettingModel {

	private String djguserid;
	private String productserialno;
	private String pairedproductid;
	private CameraSettingsModel productusersetting;
	private String devicetoken;
	private String tekaccesstoken;
	private PropertiesObject properties;
	
	
	public PropertiesObject getProperties() {
		return properties;
	}
	public void setProperties(PropertiesObject properties) {
		this.properties = properties;
	}
	public String getTekaccesstoken() {
		return tekaccesstoken;
	}
	public void setTekaccesstoken(String tekaccesstoken) {
		this.tekaccesstoken = tekaccesstoken;
	}	
	
	public String getDevicetoken() {
		return devicetoken;
	}
	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}
	public CameraSettingsModel getProductusersetting() {
		return productusersetting;
	}
	public void setProductusersetting(CameraSettingsModel productusersetting) {
		this.productusersetting = productusersetting;
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
	@Override
	public String toString() {
		return "UpdateCameraSettingModel [djguserid=" + djguserid + ", productserialno=" + productserialno
				+ ", pairedproductid=" + pairedproductid + ", productusersetting=" + productusersetting
				+ ", devicetoken=" + devicetoken + ", tekaccesstoken=" + tekaccesstoken + ", properties=" + properties
				+ "]";
	}




}
