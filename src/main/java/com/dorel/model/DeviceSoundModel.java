package com.dorel.model;

import io.swagger.annotations.ApiModelProperty;

public class DeviceSoundModel {
	
	@ApiModelProperty(value = "Device Switch", required = true, example="On")
	private String deviceswitch;
	
	@ApiModelProperty(value = "Device Sensitive level", required = true, example="100")
	private String devicesensitivelevel;
	
	public String getDeviceswitch() {
		return deviceswitch;
	}
	public void setDeviceswitch(String deviceswitch) {
		this.deviceswitch = deviceswitch;
	}
	public String getDevicesensitivelevel() {
		return devicesensitivelevel;
	}
	public void setDevicesensitivelevel(String devicesensitivelevel) {
		this.devicesensitivelevel = devicesensitivelevel;
	}
	@Override
	public String toString() {
		return "DeviceSoundModel [deviceswitch=" + deviceswitch + ", devicesensitivelevel=" + devicesensitivelevel
				+ "]";
	}
	
	
}
