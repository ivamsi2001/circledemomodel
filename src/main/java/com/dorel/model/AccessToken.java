package com.dorel.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@SuppressWarnings("serial")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@ApiModel(
        value = "AccessToken", 
        description = "This contains a data related about user.")
public class AccessToken implements  Serializable{

	@ApiModelProperty(value = "Access token", required = true, example="290db4b7-bd60-437a-83d8-93d6ef7983b9")
	private String access_token;
 
	@ApiModelProperty(value = "Token type", required = true, example="bearer")
	private String token_type;
	
	@ApiModelProperty(value = "Refresh token", required = true, example="d8ca2a00-a621-4fd5-878a-9c8e675328bc")
	private String refresh_token;

	@ApiModelProperty(value = "Expires in seconds", required = true, example="86399")
	private String expires_in;

	@ApiModelProperty(value = "Scope", required = true, example="read write")
	private String scope;
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getRefresh_token() {
		return refresh_token;
	}
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	@Override
	public String toString() {
		return "AccessToken [access_token=" + access_token + ", token_type=" + token_type + ", refresh_token="
				+ refresh_token + ", expires_in=" + expires_in + ", scope=" + scope + "]";
	}
	
}
