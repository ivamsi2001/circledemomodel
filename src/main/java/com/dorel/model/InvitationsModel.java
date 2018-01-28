package com.dorel.model;

import java.util.List;

public class InvitationsModel {
	

	private String firstname;
	
	private String lastname;
	
	private String email;
	
	private List<Productlist> productlist;
	
	private String djguserid;
	
	private String pairedproductid;
	
	private String status;
	
	private String devicetoken;

	
	public String getDevicetoken() {
		return devicetoken;
	}

	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}

	public String getPairedproductid() {
		return pairedproductid;
	}

	public void setPairedproductid(String pairedproductid) {
		this.pairedproductid = pairedproductid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDjguserid() {
		return djguserid;
	}

	public void setDjguserid(String djguserid) {
		this.djguserid = djguserid;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public List<Productlist> getProductlist() {
		return productlist;
	}

	public void setProductlist(List<Productlist> productlist) {
		this.productlist = productlist;
	}

	@Override
	public String toString() {
		return "InvitationsModel [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", productlist=" + productlist + ", djguserid=" + djguserid + ", pairedproductid=" + pairedproductid
				+ ", status=" + status + ", devicetoken=" + devicetoken + "]";
	}

	
}
