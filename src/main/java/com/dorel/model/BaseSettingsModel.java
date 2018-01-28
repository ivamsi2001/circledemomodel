package com.dorel.model;

import java.util.Arrays;

public class BaseSettingsModel {
	
	private motionSensitivity motionSensitivity;
	private noiseSensitivity noiseSensitivity;
	private noiseAlerts noiseAlerts;
	private timeZone timeZone;
	private motionAlerts motionAlerts;
	private speakerVolume speakerVolume;
	private uploadMode uploadMode;
	private CurrentMode currentMode;
	
	public CurrentMode getCurrentMode() {
		return currentMode;
	}
	public void setCurrentMode(CurrentMode currentMode) {
		this.currentMode = currentMode;
	}
	public uploadMode getUploadMode() {
		return uploadMode;
	}
	public void setUploadMode(uploadMode uploadMode) {
		this.uploadMode = uploadMode;
	}
	/**
	 * @return the speakerVolume
	 */
	public speakerVolume getSpeakerVolume() {
		return speakerVolume;
	}
	/**
	 * @param speakerVolume the speakerVolume to set
	 */
	public void setSpeakerVolume(speakerVolume speakerVolume) {
		this.speakerVolume = speakerVolume;
	}
	public motionSensitivity getMotionSensitivity() {
		return motionSensitivity;
	}
	public void setMotionSensitivity(motionSensitivity motionSensitivity) {
		this.motionSensitivity = motionSensitivity;
	}
	public noiseSensitivity getNoiseSensitivity() {
		return noiseSensitivity;
	}
	public void setNoiseSensitivity(noiseSensitivity noiseSensitivity) {
		this.noiseSensitivity = noiseSensitivity;
	}
	public noiseAlerts getNoiseAlerts() {
		return noiseAlerts;
	}
	public void setNoiseAlerts(noiseAlerts noiseAlerts) {
		this.noiseAlerts = noiseAlerts;
	}
	public timeZone getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(timeZone timeZone) {
		this.timeZone = timeZone;
	}

	public motionAlerts getMotionAlerts() {
		return motionAlerts;
	}
	public void setMotionAlerts(motionAlerts motionAlerts) {
		this.motionAlerts = motionAlerts;
	}
	@Override
	public String toString() {
		return "BaseSettingsModel [motionSensitivity=" + motionSensitivity + ", noiseSensitivity=" + noiseSensitivity
				+ ", noiseAlerts=" + noiseAlerts + ", timeZone=" + timeZone + ", motionAlerts=" + motionAlerts
				+ ", speakerVolume=" + speakerVolume + ", uploadMode=" + uploadMode + ", currentMode=" + currentMode
				+ "]";
	}
	

}
class uploadMode{
	private String name;
	private String global;
	private boolean editable;
	private int state;
	private String[] values;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGlobal() {
		return global;
	}
	public void setGlobal(String global) {
		this.global = global;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String[] getValues() {
		return values;
	}
	public void setValues(String[] values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "uploadMode [name=" + name + ", global=" + global + ", editable=" + editable + ", state=" + state
				+ ", values=" + Arrays.toString(values) + "]";
	}
	
}


