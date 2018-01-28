package com.dorel.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ResendOTPModel", description = "This contains userinfo.")
public class ResendOTPModel {

	@ApiModelProperty(value = "email", required = true, example="david.flynn@dorel.com")
	private String email;
	
	@ApiModelProperty(value = "Productcode", required = true, example="ParentUnit")
    private String productcode;
	
	@ApiModelProperty(value = "Verification Type", required = true, example="VEREMAIL/...")
	private String verificationcodetype;

	@ApiModelProperty(hidden = true)
	private String verificationcode;
	

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResendOTPModel [email=");
		builder.append(email);
		builder.append(", productcode=");
		builder.append(productcode);
		builder.append(", verificationcodetype=");
		builder.append(verificationcodetype);
		builder.append(", verificationcode=");
		builder.append(verificationcode);
		builder.append(", newemail=");
		builder.append("]");
		return builder.toString();
	}

	
}
