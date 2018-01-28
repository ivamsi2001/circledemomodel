package com.dorel.model;

import java.io.Serializable;

public class TekEventDataObject implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String curVersion;
	String newVersion;
	String reason;
	
	public String getCurVersion() {
		return curVersion;
	}
	public void setCurVersion(String curVersion) {
		this.curVersion = curVersion;
	}
	public String getNewVersion() {
		return newVersion;
	}
	public void setNewVersion(String newVersion) {
		this.newVersion = newVersion;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "TekEventDataObject [curVersion=" + curVersion + ", newVersion=" + newVersion + ", reason=" + reason
				+ "]";
	}
	
}
