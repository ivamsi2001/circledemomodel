package com.dorel.model;

import java.io.Serializable;
import java.util.UUID;

public class FirmwareApproval implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UUID  djguserid;
	
	private String fwversion;
	
	private String productserialno;
	
	private String appplatform;
	
	private String appversion;
	
	private String action;
	
	private String status;
	
	private String devicetoken;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDevicetoken() {
		return devicetoken;
	}

	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAppplatform() {
		return appplatform;
	}

	public void setAppplatform(String appplatform) {
		this.appplatform = appplatform;
	}
	

	public UUID getDjguserid() {
		return djguserid;
	}

	public void setDjguserid(UUID djguserid) {
		this.djguserid = djguserid;
	}

	public String getFwversion() {
		return fwversion;
	}

	public void setFwversion(String fwversion) {
		this.fwversion = fwversion;
	}

	public String getProductserialno() {
		return productserialno;
	}

	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}

	public String getAppversion() {
		return appversion;
	}

	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}
	@Override
	public String toString() {
		return "FirmwareApproval [djguserid=" + djguserid + ", fwversion=" + fwversion + ", productserialno="
				+ productserialno + ", appplatform=" + appplatform + ", appversion=" + appversion + "]";
	}
	
}
