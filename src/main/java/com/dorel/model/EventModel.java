package com.dorel.model;

import java.io.Serializable;
import java.util.List;

public class EventModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String djguserid;
	private String productserialno;
	private String starttime;
	private long utctime;
	private int eventid;
	private List<Storage> storage;
	private String tekaccesstoken;
	
	public long getUtctime() {
		return utctime;
	}
	public void setUtctime(long utctime) {
		this.utctime = utctime;
	}
	public String getTekaccesstoken() {
		return tekaccesstoken;
	}
	public void setTekaccesstoken(String tekaccesstoken) {
		this.tekaccesstoken = tekaccesstoken;
	}
	public String getDjguserid() {
		return djguserid;
	}
	public void setDjguserid(String djguserid) {
		this.djguserid = djguserid;
	}
	public int getEventid() {
		return eventid;
	}
	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	public List<Storage> getStorage() {
		return storage;
	}
	public void setStorage(List<Storage> storage) {
		this.storage = storage;
	}
	public String getProductserialno() {
		return productserialno;
	}
	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	@Override
	public String toString() {
		return "EventModel [djguserid=" + djguserid + ", productserialno=" + productserialno + ", starttime="
				+ starttime + ", eventid=" + eventid + ", storage=" + storage + "]";

	}
	
	
	
}
