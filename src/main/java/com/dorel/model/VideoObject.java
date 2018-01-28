package com.dorel.model;

public class VideoObject {
	private int duration;
	private long utcTime;
	private boolean contiguous;
	private String storageKey;
	private String cameraId;
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public long getUtcTime() {
		return utcTime;
	}
	public void setUtcTime(long utcTime) {
		this.utcTime = utcTime;
	}
	public boolean isContiguous() {
		return contiguous;
	}
	public void setContiguous(boolean contiguous) {
		this.contiguous = contiguous;
	}
	public String getStorageKey() {
		return storageKey;
	}
	public void setStorageKey(String storageKey) {
		this.storageKey = storageKey;
	}
	public String getCameraId() {
		return cameraId;
	}
	public void setCameraId(String cameraId) {
		this.cameraId = cameraId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VideoObject [duration=");
		builder.append(duration);
		builder.append(", utcTime=");
		builder.append(utcTime);
		builder.append(", contiguous=");
		builder.append(contiguous);
		builder.append(", storageKey=");
		builder.append(storageKey);
		builder.append(", cameraId=");
		builder.append(cameraId);
		builder.append("]");
		return builder.toString();
	}
}
