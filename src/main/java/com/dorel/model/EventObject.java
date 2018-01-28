package com.dorel.model;

import java.io.Serializable;

public class EventObject implements  Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private long utcTime;
	private String deviceId;
	private String type;
	private String subType;
	private int sensitivity;
	private TekEventDataObject data;
	
	public TekEventDataObject getData() {
		return data;
	}
	public void setData(TekEventDataObject data) {
		this.data = data;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public long getUtcTime() {
		return utcTime;
	}
	public void setUtcTime(long utcTime) {
		this.utcTime = utcTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public int getSensitivity() {
		return sensitivity;
	}
	public void setSensitivity(int sensitivity) {
		this.sensitivity = sensitivity;
	}
	@Override
	public String toString() {
		return "EventObject [utcTime=" + utcTime + ", deviceId=" + deviceId + ", type=" + type + ", subType=" + subType
				+ ", sensitivity=" + sensitivity + ", data=" + data + "]";
	}
	
	
	
}
