package com.dorel.model;

public class TekcamerasObject {
	private String status;
	private String identifier;
	private String name;
	private String thumbnailUrl;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	@Override
	public String toString() {
		return "cameras [status=" + status + ", identifier=" + identifier + ", name=" + name + ", thumbnailUrl="
				+ thumbnailUrl + "]";
	}
	
}
