package com.dorel.model;

public class UpdatePasswordModel {

	private String djguserid;
	private String currentpassword;
	private String newpassword;
	private String devicetoken;
	private String verificationcodetype;
	private String verificationcode;
	
	public String getVerificationcodetype() {
		return verificationcodetype;
	}
	public void setVerificationcodetype(String verificationcodetype) {
		this.verificationcodetype = verificationcodetype;
	}
	public String getVerificationcode() {
		return verificationcode;
	}
	public void setVerificationcode(String verificationcode) {
		this.verificationcode = verificationcode;
	}
	public String getDevicetoken() {
		return devicetoken;
	}
	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}
	
	
	public String getDjguserid() {
		return djguserid;
	}
	public void setDjguserid(String djguserid) {
		this.djguserid = djguserid;
	}
	public String getCurrentpassword() {
		return currentpassword;
	}
	public void setCurrentpassword(String currentpassword) {
		this.currentpassword = currentpassword;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	@Override
	public String toString() {
		return "UpdatePasswordModel [djguserid=" + djguserid + ", currentpassword=" + currentpassword + ", newpassword="
				+ newpassword + ", devicetoken=" + devicetoken + "]";
	}
	
}
