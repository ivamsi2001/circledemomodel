package com.dorel.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
@Table(name = "productusers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductUsers implements  Serializable{
	@Id
	@Type(type="pg-uuid")
	private UUID  productuserid;
	
	@Type(type="pg-uuid")
	private UUID djguserid;
	
	@Column(name = "productcode")
	private String productcode;
	
	@Type(type="pg-uuid")
	private UUID pairedproductid;

	@Column(name = "productserialno")
	private String productserialno;
	
	@Column(name = "djgrolecode")
	private String djgrolecode;
	
	@Column(name = "displayname")
	private String displayname;
	
	@Column(name = "displayimage")
	private String displayimage;
	
	@Column(name = "active")
	private boolean active;

	@Type(type="pg-uuid")
	private UUID accessprovidedby;
	
	@Column(name = "accessuntil")
	private Date accessuntil;
	
	@Column(name = "produsersetting")
	private String produsersetting;
	
	@Column(name = "sendnotification")
	private boolean sendnotification;
	
	@Type(type="pg-uuid")
	private UUID createdby;
	
	@Column(name = "datecreated")
	private Date datecreated;

	@Type(type="pg-uuid")
	private UUID modifiedby;

	@Column(name = "datemodified")
	private Date datemodified;

	@Column(name = "teksettings")
	private String teksettings;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "accesssince")
	private Date accesssince;
	
	@Transient
	private String firmwareversion;
	
	@Transient
	private Date firmwareupdatedon;
	
	@Transient
	private String subtype;
	
	@Transient
	private List<Member> members;
	
	@Transient
	private String msettings;

	@Transient
	private String nsettings;

	@Transient
	private String vsettings;
	
	@Transient
	private String livestreamerror;
	
	@Transient
	private String accessprovidedbby;
	
	@Transient
	private String customdateadded;
	
	@Transient
	private String customformwaredate;
	

	
	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public String getMsettings() {
		return msettings;
	}

	public void setMsettings(String msettings) {
		this.msettings = msettings;
	}

	public String getNsettings() {
		return nsettings;
	}

	public void setNsettings(String nsettings) {
		this.nsettings = nsettings;
	}

	public String getVsettings() {
		return vsettings;
	}

	public void setVsettings(String vsettings) {
		this.vsettings = vsettings;
	}

	public String getCustomdateadded() {
		return customdateadded;
	}

	public void setCustomdateadded(String customdateadded) {
		this.customdateadded = customdateadded;
	}

	public String getCustomformwaredate() {
		return customformwaredate;
	}

	public void setCustomformwaredate(String customformwaredate) {
		this.customformwaredate = customformwaredate;
	}

	public String getAccessprovidedbby() {
		return accessprovidedbby;
	}

	public void setAccessprovidedbby(String accessprovidedbby) {
		this.accessprovidedbby = accessprovidedbby;
	}

	public String getLivestreamerror() {
		return livestreamerror;
	}

	public void setLivestreamerror(String livestreamerror) {
		this.livestreamerror = livestreamerror;
	}

	
	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public Date getFirmwareupdatedon() {
		return firmwareupdatedon;
	}

	public void setFirmwareupdatedon(Date firmwareupdatedon) {
		this.firmwareupdatedon = firmwareupdatedon;
	}

	public String getFirmwareversion() {
		return firmwareversion;
	}

	public void setFirmwareversion(String firmwareversion) {
		this.firmwareversion = firmwareversion;
	}

	public Date getAccesssince() {
		return accesssince;
	}

	public void setAccesssince(Date accesssince) {
		this.accesssince = accesssince;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTeksettings() {
		return teksettings;
	}

	public void setTeksettings(String teksettings) {
		this.teksettings = teksettings;
	}

	public UUID getProductuserid() {
		return productuserid;
	}

	public void setProductuserid(UUID productuserid) {
		this.productuserid = productuserid;
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

	public UUID getPairedproductid() {
		return pairedproductid;
	}

	public void setPairedproductid(UUID pairedproductid) {
		this.pairedproductid = pairedproductid;
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

	public String getDisplayname() {
		return displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	public String getDisplayimage() {
		return displayimage;
	}

	public void setDisplayimage(String displayimage) {
		this.displayimage = displayimage;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public UUID getAccessprovidedby() {
		return accessprovidedby;
	}

	public void setAccessprovidedby(UUID accessprovidedby) {
		this.accessprovidedby = accessprovidedby;
	}

	public Date getAccessuntil() {
		return accessuntil;
	}

	public void setAccessuntil(Date accessuntil) {
		this.accessuntil = accessuntil;
	}

	public String getProdusersetting() {
		return produsersetting;
	}

	public void setProdusersetting(String produsersetting) {
		this.produsersetting = produsersetting;
	}

	public boolean isSendnotification() {
		return sendnotification;
	}

	public void setSendnotification(boolean sendnotification) {
		this.sendnotification = sendnotification;
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
