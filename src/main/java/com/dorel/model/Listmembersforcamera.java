package com.dorel.model;

import java.io.Serializable;
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
@Table(name = "listmembersforcamera")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Listmembersforcamera implements  Serializable{

	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	
	@Column(name = "productserialno")
	private String productserialno;
	
	@Column(name = "djgrolecode")
	private String djgrolecode;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "email")
	private String email;
	
	@Type(type="pg-uuid")
	private UUID createdby;
	
	@Type(type="pg-uuid")
	private UUID djguserid;
	
	@Id
	@Type(type="pg-uuid")
	private UUID productuserid;
	
	@Type(type="pg-uuid")
	private UUID adminuser;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getProductserialno() {
		return productserialno;
	}

	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}

	public String getDjgrolecode() {
		return djgrolecode;
	}

	public void setDjgrolecode(String djgrolecode) {
		this.djgrolecode = djgrolecode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UUID getCreatedby() {
		return createdby;
	}

	public void setCreatedby(UUID createdby) {
		this.createdby = createdby;
	}

	public UUID getDjguserid() {
		return djguserid;
	}

	public void setDjguserid(UUID djguserid) {
		this.djguserid = djguserid;
	}

	public UUID getProductuserid() {
		return productuserid;
	}

	public void setProductuserid(UUID productuserid) {
		this.productuserid = productuserid;
	}

	public UUID getAdminuser() {
		return adminuser;
	}

	public void setAdminuser(UUID adminuser) {
		this.adminuser = adminuser;
	}
	
	
}
