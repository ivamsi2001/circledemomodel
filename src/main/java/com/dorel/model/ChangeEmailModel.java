package com.dorel.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(
        value = "ChangeEmailModel", 
        description = "This contains a user related data.")
public class ChangeEmailModel {
	
	@ApiModelProperty(value = "email", required = true, example="david.flynn@dorel.com")
	private String email;
	
	@ApiModelProperty(value = "password", required = true, example="d0reL@!23")
	private String password;
	
	@ApiModelProperty(value = "email", required = true, example="flynn.david@dorel.com")
	private String newemail;
	
	@ApiModelProperty(value = "Devicetoken", required = false, example="185A646516F95F3E312C...")
	private String devicetoken;

	@ApiModelProperty(value = "Product code", required = true, example="ParentUnit")
	private String productcode;
	
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

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewemail() {
		return newemail;
	}

	public void setNewemail(String newemail) {
		this.newemail = newemail;
	}

	public String getDevicetoken() {
		return devicetoken;
	}

	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}

	@Override
	public String toString() {
		return "ChangeEmailModel [email=" + email + ", password=" + password + ", newemail=" + newemail
				+ ", devicetoken=" + devicetoken + ", productcode=" + productcode + "]";
	}
	
	
}
