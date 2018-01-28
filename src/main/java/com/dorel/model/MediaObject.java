package com.dorel.model;

import java.io.Serializable;

public class MediaObject implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long utcTime;
	private String key;
	private int duration;
	private int contiguous;
	private StorageObject storage;
	private String type;
	private int id;
	private String cameraId;
	public long getUtcTime() {
		return utcTime;
	}
	public void setUtcTime(long utcTime) {
		this.utcTime = utcTime;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getContiguous() {
		return contiguous;
	}
	public void setContiguous(int contiguous) {
		this.contiguous = contiguous;
	}
	public StorageObject getStorage() {
		return storage;
	}
	public void setStorage(StorageObject storage) {
		this.storage = storage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCameraId() {
		return cameraId;
	}
	public void setCameraId(String cameraId) {
		this.cameraId = cameraId;
	}
	@Override
	public String toString() {
		return "MediaObject [utcTime=" + utcTime + ", key=" + key + ", duration=" + duration + ", contiguous="
				+ contiguous + ", storage=" + storage + ", type=" + type + ", id=" + id + ", cameraId=" + cameraId
				+ "]";
	}
	
}
