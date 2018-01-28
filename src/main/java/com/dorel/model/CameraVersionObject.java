package com.dorel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CameraVersionObject implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String platform;
	private String currentVersion="";
	private int id = 0;
	private List<String> availableVersions;
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getCurrentVersion() {
		return currentVersion;
	}
	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getAvailableVersions() {
		return availableVersions;
	}
	public void setAvailableVersions(List<String> availableVersions) {
		this.availableVersions = availableVersions;
	}
	@Override
	public String toString() {
		return "CameraVersionObject [platform=" + platform + ", currentVersion=" + currentVersion + ", id=" + id
				+ ", availableVersions=" + availableVersions + "]";
	}

}
