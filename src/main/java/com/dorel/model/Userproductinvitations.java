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
@Table(name = "userproductinvitations")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Userproductinvitations implements  Serializable{

	@Id
	@Type(type="pg-uuid")
	private UUID  userinvitationid;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "productserialno")
	private String productserialno;
	
	@Column(name = "djgrolecode")
	private String djgrolecode;
	
	@Column(name = "invitationstatus")
	private String invitationstatus;
	
	@Column(name = "accessuntil")
	private Date accessuntil;
	
	@Column(name = "accessdays")
	private String accessdays;
	
	@Column(name = "starttime")
	private Date starttime;
	
	@Column(name = "endtime")
	private Date endtime;
	
	@Type(type="pg-uuid")
	private UUID  createdby;
	
	@Type(type="pg-uuid")
	private UUID  modifiedby;
	
	@Column(name = "datecreated")
	private Date datecreated;
	
	@Column(name = "datemodified")
	private Date datemodified;

	@Column(name = "verificationcode")
	private String verificationcode;
	
	
	@Column(name = "invalidattempts")
	private Integer invalidattempts;
	 
	
	public Integer getInvalidattempts() {
		return invalidattempts;
	}

	public void setInvalidattempts(Integer invalidattempts) {
		this.invalidattempts = invalidattempts;
	}

	public String getVerificationcode() {
		return verificationcode;
	}

	public void setVerificationcode(String verificationcode) {
		this.verificationcode = verificationcode;
	}

	/**
	 * @return the userinvitationid
	 */
	public UUID getUserinvitationid() {
		return userinvitationid;
	}

	/**
	 * @param userinvitationid the userinvitationid to set
	 */
	public void setUserinvitationid(UUID userinvitationid) {
		this.userinvitationid = userinvitationid;
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

	/**
	 * @return the productserialno
	 */
	public String getProductserialno() {
		return productserialno;
	}

	/**
	 * @param productserialno the productserialno to set
	 */
	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}

	/**
	 * @return the djgrolecode
	 */
	public String getDjgrolecode() {
		return djgrolecode;
	}

	/**
	 * @param djgrolecode the djgrolecode to set
	 */
	public void setDjgrolecode(String djgrolecode) {
		this.djgrolecode = djgrolecode;
	}

	/**
	 * @return the invitationstatus
	 */
	public String getInvitationstatus() {
		return invitationstatus;
	}

	/**
	 * @param invitationstatus the invitationstatus to set
	 */
	public void setInvitationstatus(String invitationstatus) {
		this.invitationstatus = invitationstatus;
	}

	/**
	 * @return the accessuntil
	 */
	public Date getAccessuntil() {
		return accessuntil;
	}

	/**
	 * @param accessuntil the accessuntil to set
	 */
	public void setAccessuntil(Date accessuntil) {
		this.accessuntil = accessuntil;
	}

	/**
	 * @return the accessdays
	 */
	public String getAccessdays() {
		return accessdays;
	}

	/**
	 * @param accessdays the accessdays to set
	 */
	public void setAccessdays(String accessdays) {
		this.accessdays = accessdays;
	}

	/**
	 * @return the starttime
	 */
	public Date getStarttime() {
		return starttime;
	}

	/**
	 * @param starttime the starttime to set
	 */
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	/**
	 * @return the endtime
	 */
	public Date getEndtime() {
		return endtime;
	}

	/**
	 * @param endtime the endtime to set
	 */
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	/**
	 * @return the createdby
	 */
	public UUID getCreatedby() {
		return createdby;
	}

	/**
	 * @param createdby the createdby to set
	 */
	public void setCreatedby(UUID createdby) {
		this.createdby = createdby;
	}

	/**
	 * @return the modifiedby
	 */
	public UUID getModifiedby() {
		return modifiedby;
	}

	/**
	 * @param modifiedby the modifiedby to set
	 */
	public void setModifiedby(UUID modifiedby) {
		this.modifiedby = modifiedby;
	}

	/**
	 * @return the datecreated
	 */
	public Date getDatecreated() {
		return datecreated;
	}

	/**
	 * @param datecreated the datecreated to set
	 */
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	/**
	 * @return the datemodified
	 */
	public Date getDatemodified() {
		return datemodified;
	}

	/**
	 * @param datemodified the datemodified to set
	 */
	public void setDatemodified(Date datemodified) {
		this.datemodified = datemodified;
	}
	
	
}
