package com.dorel.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "VerificationModel", description = "This contains user verification.")
public class VerificationModel {
	
	@ApiModelProperty(value = "Email", required = true, example="david.flynn@dorel.com")
	private String email;
	
	@ApiModelProperty(value = "Productcode", required = true, example="ParentUnit")
    private String productcode;
	
	@ApiModelProperty(value = "Verification Type", required = true, example="VEREMAIL/...")
	private String verificationcodetype;

	@ApiModelProperty(value = "Verification Code", required = true, example="645084")
	private String verificationcode;
	
	@ApiModelProperty(value = "Devicetoken", required = false, example="185A646516F95F3E312C...")
    private String devicetoken;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

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

	@Override
	public String toString() {
		return "VerificationModel [email=" + email + ", productcode=" + productcode + ", verificationcodetype="
				+ verificationcodetype + ", verificationcode=" + verificationcode + ", devicetoken=" + devicetoken
				+ "]";
	}
	
	
}
