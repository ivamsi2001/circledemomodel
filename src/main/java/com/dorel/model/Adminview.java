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
import com.fasterxml.jackson.annotation.JsonInclude;
@SuppressWarnings("serial")
@Entity
@Table(name = "adminview")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Adminview  implements  Serializable{

	@Id
	@Type(type="pg-uuid")
	private UUID djguserid;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "fullname")
	private String fullname;
		
	@Column(name = "tekniqueuserid")
	private String tekniqueuserid;
	
	@Column(name = "tekniquepassword")
	private String tekniquepassword;
	
	@Column(name = "datecreated")
	private Date datecreated;
	
	@Column(name = "cameracount")
	private long cameracount;
	
	@Column(name = "cameralist")
	private String cameralist;
				 	
	@Transient
	private String cameraprovisioned;
	
	public String getCameraprovisioned() {
		return cameraprovisioned;
	}

	public void setCameraprovisioned(String cameraprovisioned) {
		this.cameraprovisioned = cameraprovisioned;
	}

	public UUID getDjguserid() {
		return djguserid;
	}

	public void setDjguserid(UUID djguserid) {
		this.djguserid = djguserid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getTekniqueuserid() {
		return tekniqueuserid;
	}

	public void setTekniqueuserid(String tekniqueuserid) {
		this.tekniqueuserid = tekniqueuserid;
	}

	public String getTekniquepassword() {
		return tekniquepassword;
	}

	public void setTekniquepassword(String tekniquepassword) {
		this.tekniquepassword = tekniquepassword;
	}



	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public long getCameracount() {
		return cameracount;
	}

	public void setCameracount(long cameracount) {
		this.cameracount = cameracount;
	}

	public String getCameralist() {
		return cameralist;
	}

	public void setCameralist(String cameralist) {
		this.cameralist = cameralist;
	}
	
	
	
	
}
