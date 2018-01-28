package com.dorel.model;

import io.swagger.annotations.ApiModelProperty;

public class CameraMotionsModel {

	@ApiModelProperty(value = "Motion Switch", required = true, example="On")
	private String motionswitch;
	
	@ApiModelProperty(value = "Video Sensitive level", required = true, example="1080p")
	private String videosensitivelevel;
	
	public String getVideosensitivelevel() {
		return videosensitivelevel;
	}
	public void setVideosensitivelevel(String videosensitivelevel) {
		this.videosensitivelevel = videosensitivelevel;
	}
	public String getMotionswitch() {
		return motionswitch;
	}
	public void setMotionswitch(String motionswitch) {
		this.motionswitch = motionswitch;
	}
	@Override
	public String toString() {
		return "CameraMotionsModel [motionswitch=" + motionswitch + ", videosensitivelevel=" + videosensitivelevel
				+ "]";
	}
	
	
	
}
