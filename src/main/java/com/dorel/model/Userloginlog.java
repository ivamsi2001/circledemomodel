package com.dorel.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name = "userloginlog")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Userloginlog implements  Serializable{

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
	
	@Column(name = "datecreated")
	private Date datecreated;
	
	@Column(name = "actiontype")
	private String actiontype;

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

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public String getActiontype() {
		return actiontype;
	}

	public void setActiontype(String actiontype) {
		this.actiontype = actiontype;
	}

	
		
    
}
