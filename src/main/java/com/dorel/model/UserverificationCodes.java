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
@Table(name = "userverificationcodes")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserverificationCodes implements  Serializable{

	@Id
	@Type(type="pg-uuid")
	private UUID  userverificationcodeid;
	
	@Type(type="pg-uuid")
	private UUID djguserid;
	
	@Column(name = "productcode")
	private String productcode;
	
	@Column(name = "verificationcode")
	private String verificationcode;
	
	@Column(name = "verificationcodetype")
	private String verificationcodetype;
	
	@Column(name = "expirydate")
	private Date expirydate;
	
	@Column(name = "isactive")
	private boolean isactive;
	
	@Type(type="pg-uuid")
	private UUID createdby;
	
	@Column(name="datecreated")
	private Date datecreated;
	
	@Type(type="pg-uuid")
	private UUID modifiedby;
	
	@Column(name="datemodified")
	private Date datemodified;
	
	

	public UUID getUserverificationcodeid() {
		return userverificationcodeid;
	}

	public void setUserverificationcodeid(UUID userverificationcodeid) {
		this.userverificationcodeid = userverificationcodeid;
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

	public String getVerificationcode() {
		return verificationcode;
	}

	public void setVerificationcode(String verificationcode) {
		this.verificationcode = verificationcode;
	}

	public String getVerificationcodetype() {
		return verificationcodetype;
	}

	public void setVerificationcodetype(String verificationcodetype) {
		this.verificationcodetype = verificationcodetype;
	}

	public Date getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public UUID getCreatedby() {
		return createdby;
	}

	public void setCreatedby(UUID createdby) {
		this.createdby = createdby;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public UUID getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(UUID modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getDatemodified() {
		return datemodified;
	}

	public void setDatemodified(Date datemodified) {
		this.datemodified = datemodified;
	}
	
	
}
