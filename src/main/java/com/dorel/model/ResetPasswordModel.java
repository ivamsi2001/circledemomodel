package com.dorel.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ResetPasswordModel", description = "This contains userinfo.")
public class ResetPasswordModel {
	
	private String verificationcodetype;
	private String verificationcode;
	


	@ApiModelProperty(value = "email", required = true, example="david.flynn@dorel.com")
	private String email;
	
	@ApiModelProperty(value = "password", required = true, example="d0reL@!23")
	private String password;

	@ApiModelProperty(value = "Devicetoken", required = false, example="185A646516F95F3E312C...")
    private String devicetoken;

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

	public String getDevicetoken() {
		return devicetoken;
	}

	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}

	@Override
	public String toString() {
		return "ResetPasswordModel [email=" + email + ", password=" + password + ", devicetoken=" + devicetoken + "]";
	}
    
	
}
