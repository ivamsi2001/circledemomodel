package com.dorel.model;

public class UpdateWifiModel {

	private String wifiname;
	private String pairedproductid;
	private String djguserid;
	private String devicetoken;
	
	public String getDevicetoken() {
		return devicetoken;
	}
	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}
	public String getWifiname() {
		return wifiname;
	}
	public void setWifiname(String wifiname) {
		this.wifiname = wifiname;
	}
	public String getPairedproductid() {
		return pairedproductid;
	}
	public void setPairedproductid(String pairedproductid) {
		this.pairedproductid = pairedproductid;
	}
	public String getDjguserid() {
		return djguserid;
	}
	public void setDjguserid(String djguserid) {
		this.djguserid = djguserid;
	}
	@Override
	public String toString() {
		return "UpdateWifiModel [wifiname=" + wifiname + ", pairedproductid=" + pairedproductid + ", djguserid="
				+ djguserid + ", devicetoken=" + devicetoken + "]";
	}

}
