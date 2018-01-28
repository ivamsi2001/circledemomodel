package com.dorel.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(
        value = "UpdateFullNameModel", 
        description = "Updating the user deatils.")
public class UpdateFullNameModel {

	@ApiModelProperty(value = "DJG userid", required = true, example="0850be0a-7a5d-48cc-bb40-415285ee21db")
	private String djguserid;
	
	@ApiModelProperty(value = "Fullname", required = true, example="David Flyn")
	private String fullname;
	
	@ApiModelProperty(value = "Device token", required = true, example="A9DE0F159C06A71313646307BC9165A9ED5F04E93C3AC64CC48981ACB728DE54")
	private String devicetoken;
	
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
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	
	
}
