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
@Table(name = "fwreleases")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class FWReleases  implements  Serializable{

	@Id
	@Type(type="pg-uuid")
	private UUID  fwreleaseid;
	
	@Column(name = "releaselabel")
	private String releaselabel;
	
	@Column(name = "fwversion")
	private String fwversion;
	
	@Column(name = "severity")
	private String severity;
	
	@Column(name = "releaseto")
	private String releaseto;
	
	@Column(name = "releasenotes")
	private String releasenotes;
	
	@Type(type="pg-uuid")
	private UUID releasedby;
	
	@Column(name = "releasedate")
	private Date releasedate;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "canceleddate")
	private Date canceleddate;
	
	@Type(type="pg-uuid")
	private UUID canceledby;
	
	@Column(name = "comments")
	private String comments;
	
	@Column(name = "datecreated")
	private Date datecreated;
	
	@Type(type="pg-uuid")
	private UUID createdby;
	
	@Column(name = "datemodified")
	private Date datemodified;
	
	@Type(type="pg-uuid")
	private UUID modifiedby;
	

	public UUID getFwreleaseid() {
		return fwreleaseid;
	}

	public void setFwreleaseid(UUID fwreleaseid) {
		this.fwreleaseid = fwreleaseid;
	}

	public String getReleaselabel() {
		return releaselabel;
	}

	public void setReleaselabel(String releaselabel) {
		this.releaselabel = releaselabel;
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

	public String getReleaseto() {
		return releaseto;
	}

	public void setReleaseto(String releaseto) {
		this.releaseto = releaseto;
	}

	public String getReleasenotes() {
		return releasenotes;
	}

	public void setReleasenotes(String releasenotes) {
		this.releasenotes = releasenotes;
	}

	public UUID getReleasedby() {
		return releasedby;
	}

	public void setReleasedby(UUID releasedby) {
		this.releasedby = releasedby;
	}

	public Date getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(Date releasedate) {
		this.releasedate = releasedate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCanceleddate() {
		return canceleddate;
	}

	public void setCanceleddate(Date canceleddate) {
		this.canceleddate = canceleddate;
	}

	public UUID getCanceledby() {
		return canceledby;
	}

	public void setCanceledby(UUID canceledby) {
		this.canceledby = canceledby;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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

	@Override
	public String toString() {
		return "FWReleases [fwreleaseid=" + fwreleaseid + ", releaselabel=" + releaselabel + ", fwversion=" + fwversion
				+ ", severity=" + severity + ", releaseto=" + releaseto + ", releasenotes=" + releasenotes
				+ ", releasedby=" + releasedby + ", releasedate=" + releasedate + ", status=" + status
				+ ", canceleddate=" + canceleddate + ", canceledby=" + canceledby + ", comments=" + comments
				+ ", datecreated=" + datecreated + ", createdby=" + createdby + ", datemodified=" + datemodified
				+ ", modifiedby=" + modifiedby + "]";
	}

	

	
	
	
}
