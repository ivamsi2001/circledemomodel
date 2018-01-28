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

import io.swagger.annotations.ApiModel;

@SuppressWarnings("serial")
@Entity
@Table(name = "fwdistribution")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ApiModel(
        value = "FWDistribution", 
        description = "This contains firmware availability related data.")
public class FWDistribution  implements  Serializable {

	@Id
	@Type(type="pg-uuid")
	private UUID  fwdistributionid;
	
	@Type(type="pg-uuid")
	private UUID fwdreleaseid;
	
	@Column(name = "fwversion")
	private String fwversion;
	
	@Column(name = "severity")
	private String severity;
	
	@Column(name = "productserialno")
	private String productserialno;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "oldversion")
	private String oldversion;
	
	@Column(name = "datecreated")
	private Date datecreated;
	
	@Type(type="pg-uuid")
	private UUID createdby;
	
	
	@Type(type="pg-uuid")
	private UUID updatedby;
	
	@Column(name = "updateddate")
	private Date updateddate;
	
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
	public UUID getFwdistributionid() {
		return fwdistributionid;
	}
	public void setFwdistributionid(UUID fwdistributionid) {
		this.fwdistributionid = fwdistributionid;
	}
	
	public UUID getFwdreleaseid() {
		return fwdreleaseid;
	}
	public void setFwdreleaseid(UUID fwdreleaseid) {
		this.fwdreleaseid = fwdreleaseid;
	}
	public String getFwversion() {
		return fwversion;
	}
	public void setFwversion(String fwversion) {
		this.fwversion = fwversion;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getProductserialno() {
		return productserialno;
	}
	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOldversion() {
		return oldversion;
	}
	public void setOldversion(String oldversion) {
		this.oldversion = oldversion;
	}
	public UUID getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(UUID updatedby) {
		this.updatedby = updatedby;
	}
	public Date getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}
	@Override
	public String toString() {
		return "FWDistribution [fwdistributionid=" + fwdistributionid + ", fwdreleaseid=" + fwdreleaseid
				+ ", fwversion=" + fwversion + ", severity=" + severity + ", productserialno=" + productserialno
				+ ", status=" + status + ", oldversion=" + oldversion + ", updatedby=" + updatedby + ", updateddate="
				+ updateddate + "]";
	}

	
	
}
