package com.dorel.model;

import io.swagger.annotations.ApiModelProperty;

public class CameravolumeModel {

	@ApiModelProperty(value = "Volume Switch", required = true, example="On")
	private String volumeswitch;
	
	@ApiModelProperty(value = "Sound Sensitive Level", required = true, example="100")
	private String soundsensitivelevel;
	
	public String getVolumeswitch() {
		return volumeswitch;
	}
	public void setVolumeswitch(String volumeswitch) {
		this.volumeswitch = volumeswitch;
	}
	public String getSoundsensitivelevel() {
		return soundsensitivelevel;
	}
	public void setSoundsensitivelevel(String soundsensitivelevel) {
		this.soundsensitivelevel = soundsensitivelevel;
	}
	@Override
	public String toString() {
		return "CameravolumeModel [volumeswitch=" + volumeswitch + ", soundsensitivelevel=" + soundsensitivelevel + "]";
	}
	
}
