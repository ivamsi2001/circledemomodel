package com.dorel.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "RemoveCameraModel", description = "Removing camera from this user.")
public class RemoveCameraModel {
	@ApiModelProperty(value = "DJG userid", required = true, example="061f64d0-b5a2-46a2-b7e6-4ffef2af5724")
	private String djguserid;
	@ApiModelProperty(value = "Product code", required = true, example="ParentUnit")
	private String productcode;
	@ApiModelProperty(value = "Product serialno", required = true, example="AS156C5sx9n")
	private String productserialno;
	@ApiModelProperty(value = "Teknique access token", required = true, example="434de0a-7a3d-68cc-bb40-473285ee2cew")
	private String tekaccesstoken;
	@ApiModelProperty(value = "DeviceToken", required = true, example="859EBB6DC3BEE85B2D25215D06E3143F437CAC465039E1B85314565B0301A5EE")
	private String devicetoken;

	public String getDevicetoken() {
		return devicetoken;
	}
	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}
	
	
	public String getTekaccesstoken() {
		return tekaccesstoken;
	}
	public void setTekaccesstoken(String tekaccesstoken) {
		this.tekaccesstoken = tekaccesstoken;
	}
	public String getDjguserid() {
		return djguserid;
	}
	public void setDjguserid(String djguserid) {
		this.djguserid = djguserid;
	}
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getProductserialno() {
		return productserialno;
	}
	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}
	@Override
	public String toString() {
		return "RemoveCameraModel [djguserid=" + djguserid + ", productcode=" + productcode + ", productserialno="
				+ productserialno + ", tekaccesstoken=" + tekaccesstoken + ", devicetoken=" + devicetoken + "]";
	}

	
}
