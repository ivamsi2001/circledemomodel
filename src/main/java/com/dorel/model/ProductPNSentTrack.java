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
@Table(name = "productpnsenttrack")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductPNSentTrack implements Serializable{

	@Id
	@Type(type="pg-uuid")
	private UUID  pntrackid;
	
	@Type(type="pg-uuid")
	private UUID djguserid;
	
	@Column(name = "productserialno")
	private String productserialno;
	
	@Column(name = "eventtrigger")
	private boolean eventtrigger;
	
	@Column(name = "triggertimestamp")
	private Date triggertimestamp;

	@Column(name = "eventcomplete")
	private boolean eventcomplete;
    
	
	@Column(name = "completetimestamp")
	private Date completetimestamp;


	public UUID getPntrackid() {
		return pntrackid;
	}


	public void setPntrackid(UUID pntrackid) {
		this.pntrackid = pntrackid;
	}


	public UUID getDjguserid() {
		return djguserid;
	}


	public void setDjguserid(UUID djguserid) {
		this.djguserid = djguserid;
	}


	public String getProductserialno() {
		return productserialno;
	}


	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}


	public boolean isEventtrigger() {
		return eventtrigger;
	}


	public void setEventtrigger(boolean eventtrigger) {
		this.eventtrigger = eventtrigger;
	}


	public Date getTriggertimestamp() {
		return triggertimestamp;
	}


	public void setTriggertimestamp(Date triggertimestamp) {
		this.triggertimestamp = triggertimestamp;
	}


	public boolean isEventcomplete() {
		return eventcomplete;
	}


	public void setEventcomplete(boolean eventcomplete) {
		this.eventcomplete = eventcomplete;
	}


	public Date getCompletetimestamp() {
		return completetimestamp;
	}


	public void setCompletetimestamp(Date completetimestamp) {
		this.completetimestamp = completetimestamp;
	}
	

}
