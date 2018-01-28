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

@SuppressWarnings("serial")
@Entity
@Table(name = "djguserroles")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Djguserroles implements  Serializable{

	@Id
	@Type(type="pg-uuid")
	private UUID  djguserroleid;
	
	@Type(type="pg-uuid")
	private UUID  djguserid;
	
	@Column(name = "productcode")
	private String productcode;
	
	@Column(name = "djgrolecode")
	private String djgrolecode;
	
	@Column(name = "active")
	private Boolean active;
	 
	@Type(type="pg-uuid")
	private UUID createdby;
	
	@Type(type="pg-uuid")
	private UUID modifiedby;
	
	@Column(name = "datecreated")
	private Date datecreated;
	
	@Column(name = "datemodified")
	private Date datemodified;

	public UUID getDjguserroleid() {
		return djguserroleid;
	}

	public void setDjguserroleid(UUID djguserroleid) {
		this.djguserroleid = djguserroleid;
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

	public String getDjgrolecode() {
		return djgrolecode;
	}

	public void setDjgrolecode(String djgrolecode) {
		this.djgrolecode = djgrolecode;
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

	public UUID getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(UUID modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public Date getDatemodified() {
		return datemodified;
	}

	public void setDatemodified(Date datemodified) {
		this.datemodified = datemodified;
	}
	
	  
}
