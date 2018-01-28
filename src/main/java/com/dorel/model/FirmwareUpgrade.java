package com.dorel.model;

import java.io.Serializable;
import java.util.UUID;

public class FirmwareUpgrade implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UUID  djguserid;
	
	private String releaselabel;
	
	private String fwversion;
	
	private String releasenotes;
	
	private String status;
	
	private String comments;
	
	private FWReleaseTo releaseto;
	
	
	public UUID getDjguserid() {
		return djguserid;
	}

	public void setDjguserid(UUID djguserid) {
		this.djguserid = djguserid;
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

	public String getReleasenotes() {
		return releasenotes;
	}

	public void setReleasenotes(String releasenotes) {
		this.releasenotes = releasenotes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public FWReleaseTo getReleaseto() {
		return releaseto;
	}

	public void setReleaseto(FWReleaseTo releaseto) {
		this.releaseto = releaseto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "FirmwareUpgrade [djguserid=" + djguserid + ", releaselabel=" + releaselabel + ", fwversion="
		+ fwversion + ", releasenotes=" + releasenotes + ", status=" + status + ", comments=" + comments +",FirmwareReleaseTo="+ releaseto + "]";
	}
	
}
