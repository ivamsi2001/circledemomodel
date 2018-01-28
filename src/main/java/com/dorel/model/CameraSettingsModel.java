package com.dorel.model;

import io.swagger.annotations.ApiModelProperty;

public class CameraSettingsModel {
 
	@ApiModelProperty(value = "Video Quality", required = true, example="1080p")
	private String videoquality;
	@ApiModelProperty(value = "Camera Video Quality", required = true, example="1080p")
	private String cameravideoquality;
	@ApiModelProperty(value = "Time zone", required = true, example="IST")
	private String timezone;
	private CameraMotionsModel motions;
	private DeviceSoundModel sound;
	private CameravolumeModel cameravolume;
	private TekbaseSettings tekbaseSettings;

	
	/**
	 * @return the tekbaseSettings
	 */
	public TekbaseSettings getTekbaseSettings() {
		return tekbaseSettings;
	}
	/**
	 * @param tekbaseSettings the tekbaseSettings to set
	 */
	public void setTekbaseSettings(TekbaseSettings tekbaseSettings) {
		this.tekbaseSettings = tekbaseSettings;
	}
	public String getVideoquality() {
		return videoquality;
	}
	public void setVideoquality(String videoquality) {
		this.videoquality = videoquality;
	}
	public String getCameravideoquality() {
		return cameravideoquality;
	}
	public void setCameravideoquality(String cameravideoquality) {
		this.cameravideoquality = cameravideoquality;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public CameraMotionsModel getMotions() {
		return motions;
	}
	public void setMotions(CameraMotionsModel motions) {
		this.motions = motions;
	}
	public DeviceSoundModel getSound() {
		return sound;
	}
	public void setSound(DeviceSoundModel sound) {
		this.sound = sound;
	}
	public CameravolumeModel getCameravolume() {
		return cameravolume;
	}
	public void setCameravolume(CameravolumeModel cameravolume) {
		this.cameravolume = cameravolume;
	}
	@Override
	public String toString() {
		return "CameraSettingsModel [videoquality=" + videoquality + ", cameravideoquality=" + cameravideoquality
				+ ", timezone=" + timezone + ", motions=" + motions + ", sound=" + sound + ", cameravolume="
				+ cameravolume + "]";
	}
	
	
	
}
