package com.dorel.model;

public class PolicyChange {
	
	private String djguserid;
	private String eventsdeletetime;
	private String djgrolecode;
	private String snsmode;
	
	public String getDjguserid() {
		return djguserid;
	}
	public void setDjguserid(String djguserid) {
		this.djguserid = djguserid;
	}
	public String getEventsdeletetime() {
		return eventsdeletetime;
	}
	public void setEventsdeletetime(String eventsdeletetime) {
		this.eventsdeletetime = eventsdeletetime;
	}
	public String getDjgrolecode() {
		return djgrolecode;
	}
	public void setDjgrolecode(String djgrolecode) {
		this.djgrolecode = djgrolecode;
	}
	public String getSnsmode() {
		return snsmode;
	}
	public void setSnsmode(String snsmode) {
		this.snsmode = snsmode;
	}
	@Override
	public String toString() {
		return "PolicyChange [djguserid=" + djguserid + ", eventsdeletetime=" + eventsdeletetime + ", djgrolecode="
				+ djgrolecode + ", snsmode=" + snsmode + "]";
	}
	
	
}
