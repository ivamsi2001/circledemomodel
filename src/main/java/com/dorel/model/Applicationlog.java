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
import com.fasterxml.jackson.annotation.JsonInclude;
@Entity
@Table(name = "Applicationlog")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Applicationlog implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Type(type="pg-uuid")
	private UUID  id;
	
	@Column(name = "platform")
	private String platform;
	
	@Column(name = "device")
	private String device;
	
	@Column(name = "deviceos")
	private String deviceos;
	
	@Column(name = "productcode")
	private String productcode;
	
	@Type(type="pg-uuid")
	private UUID  djguserid;
	
	@Column(name = "logtype")
	private String logtype;

	@Column(name = "logtime")
	private Date logtime;
	
	@Column(name = "productserialno")
	private String productserialno;
	
	@Column(name = "eventtype")
	private String eventtype;
	

	@Column(name = "functionname")
	private String functionname;
	

	@Column(name = "eventmessage")
	private String eventmessage;
	

	@Column(name = "eventparameter")
	private String eventparameter;
	

	@Column(name = "otherparams")
	private String otherparams;
	
	@Column(name = "datecreated")
	private Date datecreated;


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public String getPlatform() {
		return platform;
	}


	public void setPlatform(String platform) {
		this.platform = platform;
	}


	public String getDevice() {
		return device;
	}


	public void setDevice(String device) {
		this.device = device;
	}


	public String getDeviceos() {
		return deviceos;
	}


	public void setDeviceos(String deviceos) {
		this.deviceos = deviceos;
	}


	public String getProductcode() {
		return productcode;
	}


	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}


	public UUID getDjguserid() {
		return djguserid;
	}


	public void setDjguserid(UUID djguserid) {
		this.djguserid = djguserid;
	}


	public String getLogtype() {
		return logtype;
	}


	public void setLogtype(String logtype) {
		this.logtype = logtype;
	}


	public Date getLogtime() {
		return logtime;
	}


	public void setLogtime(Date logtime) {
		this.logtime = logtime;
	}


	public String getProductserialno() {
		return productserialno;
	}


	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}


	public String getEventtype() {
		return eventtype;
	}


	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}


	public String getFunctionname() {
		return functionname;
	}


	public void setFunctionname(String functionname) {
		this.functionname = functionname;
	}


	public String getEventmessage() {
		return eventmessage;
	}


	public void setEventmessage(String eventmessage) {
		this.eventmessage = eventmessage;
	}


	public String getEventparameter() {
		return eventparameter;
	}


	public void setEventparameter(String eventparameter) {
		this.eventparameter = eventparameter;
	}


	public String getOtherparams() {
		return otherparams;
	}


	public void setOtherparams(String otherparams) {
		this.otherparams = otherparams;
	}


	public Date getDatecreated() {
		return datecreated;
	}


	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	
	
}
