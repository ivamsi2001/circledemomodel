package com.dorel.model;

public class Storage {

	private String url;
	private int order;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	
	@Override
	public String toString() {
		return "Storage [url=" + url + ", order=" + order + "]";
	}
	
}
