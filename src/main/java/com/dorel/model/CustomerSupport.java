package com.dorel.model;

import java.io.Serializable;
import java.util.UUID;

public class CustomerSupport implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String faqlink;
	private String sendmessgage;
	private String callus;
	private UUID  djguserid;
	private String troubleshoot;
	
	public String getTroubleshoot() {
		return troubleshoot;
	}
	public void setTroubleshoot(String troubleshoot) {
		this.troubleshoot = troubleshoot;
	}
	public UUID getDjguserid() {
		return djguserid;
	}
	public void setDjguserid(UUID djguserid) {
		this.djguserid = djguserid;
	}
	public String getFaqlink() {
		return faqlink;
	}
	public void setFaqlink(String faqlink) {
		this.faqlink = faqlink;
	}
	
	public String getSendmessgage() {
		return sendmessgage;
	}
	public void setSendmessgage(String sendmessgage) {
		this.sendmessgage = sendmessgage;
	}
	public String getCallus() {
		return callus;
	}
	public void setCallus(String callus) {
		this.callus = callus;
	}
	@Override
	public String toString() {
		return "CustomerSupport [faqlink=" + faqlink + ", sendmessgage=" + sendmessgage + ", callus=" + callus
				+ ", djguserid=" + djguserid + ", troubleshoot=" + troubleshoot + "]";
	}
	
	
	
}
