package com.dorel.model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(
        value = "CameraModel", 
        description = "This contains a data related Camera.")
public class AddCameraModel {
	@ApiModelProperty(value = "DJG userid", required = true, example="0850be0a-7a5d-48cc-bb40-415285ee21db")
	private String djguserid;
	@ApiModelProperty(value = "Product code", required = true, example="ParentUnit")
	private String productcode;
	@ApiModelProperty(value = "Product serialno", required = true, example="AS156C5sx9n")
	private String productserialno;
	@ApiModelProperty(value = "Display Name", required = true, example="babybedroom_camera")
	private String displayname;
	@ApiModelProperty(value = "Display Image", required = true, example="Default")
	private String displayimage;
	@ApiModelProperty(value = "Wifi Name", required = true, example="dorel-wifi")
	private String wifiname;
	private String devicetoken;
	
	@ApiModelProperty(value = "Teknique access token", required = true, example="434de0a-7a3d-68cc-bb40-473285ee2cew")
	private String tekaccesstoken;
	@ApiModelProperty(value = "Camera Authentication key", required = true, example="9494f9bd-b483-47ff-87aa-69d156d8833c")
	private String tekauthkey;

	private PropertiesObject properties;
	
	private CameraSettingsModel productusersetting;
	
	public PropertiesObject getProperties() {
		return properties;
	}
	public void setProperties(PropertiesObject properties) {
		this.properties = properties;
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


	public String getTekaccesstoken() {
		return tekaccesstoken;
	}
	public void setTekaccesstoken(String tekaccesstoken) {
		this.tekaccesstoken = tekaccesstoken;
	}
	public String getTekauthkey() {
		return tekauthkey;
	}
	public void setTekauthkey(String tekauthkey) {
		this.tekauthkey = tekauthkey;
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
	public String getDisplayname() {
		return displayname;
	}
	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}
	public String getDisplayimage() {
		return displayimage;
	}
	public void setDisplayimage(String displayimage) {
		this.displayimage = displayimage;
	}
	public String getWifiname() {
		return wifiname;
	}
	public void setWifiname(String wifiname) {
		this.wifiname = wifiname;
	}
	
	@Override
	public String toString() {
		return "AddCameraModel [djguserid=" + djguserid + ", productcode=" + productcode + ", productserialno="
				+ productserialno + ", displayname=" + displayname + ", displayimage=" + displayimage + ", wifiname="
				+ wifiname + ", devicetoken=" + devicetoken
				+ ", tekaccesstoken=" + tekaccesstoken + ", tekauthkey=" + tekauthkey + ", productusersetting="
				+ productusersetting + "]";
	}

}
