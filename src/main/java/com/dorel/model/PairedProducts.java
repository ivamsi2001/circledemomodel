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
@Table(name = "pairedproducts")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PairedProducts implements  Serializable{

	@Id
	@Type(type="pg-uuid")
	private UUID  pairedproductid;

	@Column(name = "productcode")
	private String productcode;

	@Column(name = "productserialno")
	private String productserialno;
	
	@Column(name = "userproductname")
	private String userproductname;

	@Column(name = "active")
	private boolean active;
	
	@Type(type="pg-uuid")
	private UUID  addedby;

	@Column(name = "dateadded")
	private Date dateadded;
	
	@Type(type="pg-uuid")
	private UUID  removedby;

	@Column(name = "dateremoved")
	private Date dateremoved;
	
	@Column(name = "productsetting")
	private String productsetting;
	
	@Column(name = "datecreated")
	private Date datecreated;
	
	@Type(type="pg-uuid")
	private UUID  createdby;
	
	@Column(name = "datemodified")
	private Date datemodified;
	
	@Type(type="pg-uuid")
	private UUID  modifiedby;

	@Column(name = "wifiname")
	private String wifiname;
	
	@Column(name="cameraauthkey")
	private String cameraauthkey;

	@Column(name = "teksettings")
	private String teksettings;
	
	@Column(name = "productfirmwareversion")
	private String productfirmwareversion;
	
	@Type(type="pg-uuid")
	private UUID firmwareupdatedby;
	
	@Column(name = "firmwareupdatedon")
	private Date firmwareupdatedon;
	
	public String getProductfirmwareversion() {
		return productfirmwareversion;
	}

	public void setProductfirmwareversion(String productfirmwareversion) {
		this.productfirmwareversion = productfirmwareversion;
	}

	public UUID getFirmwareupdatedby() {
		return firmwareupdatedby;
	}

	public void setFirmwareupdatedby(UUID firmwareupdatedby) {
		this.firmwareupdatedby = firmwareupdatedby;
	}

	public Date getFirmwareupdatedon() {
		return firmwareupdatedon;
	}

	public void setFirmwareupdatedon(Date firmwareupdatedon) {
		this.firmwareupdatedon = firmwareupdatedon;
	}

	public String getTeksettings() {
		return teksettings;
	}

	public void setTeksettings(String teksettings) {
		this.teksettings = teksettings;
	}

	public String getCameraauthkey() {
		return cameraauthkey;
	}

	public void setCameraauthkey(String cameraauthkey) {
		this.cameraauthkey = cameraauthkey;
	}

	public String getWifiname() {
		return wifiname;
	}

	public void setWifiname(String wifiname) {
		this.wifiname = wifiname;
	}

	public UUID getPairedproductid() {
		return pairedproductid;
	}

	public void setPairedproductid(UUID pairedproductid) {
		this.pairedproductid = pairedproductid;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductserialno() {
		return productserialno;
	}

	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}

	public String getUserproductname() {
		return userproductname;
	}

	public void setUserproductname(String userproductname) {
		this.userproductname = userproductname;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public UUID getAddedby() {
		return addedby;
	}

	public void setAddedby(UUID addedby) {
		this.addedby = addedby;
	}

	public Date getDateadded() {
		return dateadded;
	}

	public void setDateadded(Date dateadded) {
		this.dateadded = dateadded;
	}

	public UUID getRemovedby() {
		return removedby;
	}

	public void setRemovedby(UUID removedby) {
		this.removedby = removedby;
	}

	public Date getDateremoved() {
		return dateremoved;
	}

	public void setDateremoved(Date dateremoved) {
		this.dateremoved = dateremoved;
	}

	public String getProductsetting() {
		return productsetting;
	}

	public void setProductsetting(String productsetting) {
		this.productsetting = productsetting;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public UUID getCreatedby() {
		return createdby;
	}

	public void setCreatedby(UUID createdby) {
		this.createdby = createdby;
	}

	public Date getDatemodified() {
		return datemodified;
	}

	public void setDatemodified(Date datemodified) {
		this.datemodified = datemodified;
	}

	public UUID getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(UUID modifiedby) {
		this.modifiedby = modifiedby;
	}
	
	
}

