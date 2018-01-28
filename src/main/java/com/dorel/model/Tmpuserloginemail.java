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
@Table(name = "tmpuserloginemail")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Tmpuserloginemail implements  Serializable{

	@Id
	@Type(type="pg-uuid")
	private UUID  tmpuserloginemailid;
	
	@Type(type="pg-uuid")
	private UUID djguserid;
	
	@Column(name = "newemail")
	private String newemail;
	
	@Column(name = "active")
	private Boolean active;
	
	@Type(type="pg-uuid")
	private UUID createdby;
	
	@Column(name = "datecreated")
	private Date datecreated;
	
	@Type(type="pg-uuid")
	private UUID modifiedby;
	
	@Column(name = "datemodified")
	private Date datemodified;

	public UUID getTmpuserloginemailid() {
		return tmpuserloginemailid;
	}

	public void setTmpuserloginemailid(UUID tmpuserloginemailid) {
		this.tmpuserloginemailid = tmpuserloginemailid;
	}

	public UUID getDjguserid() {
		return djguserid;
	}

	public void setDjguserid(UUID djguserid) {
		this.djguserid = djguserid;
	}

	public String getNewemail() {
		return newemail;
	}

	public void setNewemail(String newemail) {
		this.newemail = newemail;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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
