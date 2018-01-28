package com.dorel.model;

import java.util.List;

public class TekData {
	private List<TekcamerasObject> cameras;

	public List<TekcamerasObject> getCameras() {
		return cameras;
	}

	public void setCameras(List<TekcamerasObject> cameras) {
		this.cameras = cameras;
	}

	@Override
	public String toString() {
		return "data [cameras=" + cameras + "]";
	}
}
