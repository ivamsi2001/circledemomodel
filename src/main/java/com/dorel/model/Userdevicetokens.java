package com.dorel.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name = "userdevicetokens")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Userdevicetokens implements  Serializable{

	@Id
	 @Type(type="pg-uuid")
	 private UUID  devicetokenid;
     
	 @Type(type="pg-uuid")
	 private UUID  djguserid;
 
	 @Column(name = "productcode")
	 private String productcode;
	 
	 @Column(name = "devicetoken")
	 private String devicetoken;
	
	 @Column(name = "deviceos")
	 private String deviceos;
	
	 @Column(name = "deviceosversion")
	 private String deviceosversion;
	
	 @Column(name = "devicetype")
	 private String devicetype;
	 
	 @Column(name = "devicename")
	 private String devicename;
	 
	 @Column(name = "isactive")
	 private Boolean isactive;
	 
	 @Column(name = "datecreated")
	 private Date datecreated;
	 
	 @Column(name = "authkey")
	 private String authkey;

	 @Column(name = "endpointarn")
	 private String endpointarn;

	 @Column(name ="platform")
	 private String platform;

	 @Column(name ="appversion")
	 private String appversion;
	 
	  @Transient
	  private String snsmode;
	 
	 public String getAppversion() {
		return appversion;
	}

	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}

	/**
	 * @return the platform
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}


	    
	/**
	 * @return the snsmode
	 */
	public String getSnsmode() {
		return snsmode;
	}

	/**
	 * @param snsmode the snsmode to set
	 */
	public void setSnsmode(String snsmode) {
		this.snsmode = snsmode;
	}

	public String getEndpointarn() {
		return endpointarn;
	}

	public void setEndpointarn(String endpointarn) {
		this.endpointarn = endpointarn;
	}

	public UUID getDevicetokenid() {
		return devicetokenid;
	}

	public void setDevicetokenid(UUID devicetokenid) {
		this.devicetokenid = devicetokenid;
	}

	public UUID getDjguserid() {
		return djguserid;
	}

	public void setDjguserid(UUID djguserid) {
		this.djguserid = djguserid;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getDevicetoken() {
		return devicetoken;
	}

	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}

	public String getDeviceos() {
		return deviceos;
	}

	public void setDeviceos(String deviceos) {
		this.deviceos = deviceos;
	}

	public String getDeviceosversion() {
		return deviceosversion;
	}

	public void setDeviceosversion(String deviceosversion) {
		this.deviceosversion = deviceosversion;
	}

	public String getDevicetype() {
		return devicetype;
	}

	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}

	public String getDevicename() {
		return devicename;
	}

	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public String getAuthkey() {
		return authkey;
	}

	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}
	 
    @Override
	public String toString() {
		return "Userdevicetokens [devicetokenid=" + devicetokenid + ", djguserid=" + djguserid + ", productcode="
				+ productcode + ", devicetoken=" + devicetoken + ", deviceos=" + deviceos + ", deviceosversion="
				+ deviceosversion + ", devicetype=" + devicetype + ", devicename=" + devicename + ", isactive="
				+ isactive + ", datecreated=" + datecreated + ", authkey=" + authkey + ", endpointarn=" + endpointarn
				+ "]";
	}
	 
}
