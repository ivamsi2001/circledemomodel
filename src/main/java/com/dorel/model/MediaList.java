package com.dorel.model;

import java.io.Serializable;
import java.util.List;

public class MediaList implements  Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<VideoObject> videos;

	public List<VideoObject> getVideos() {
		return videos;
	}

	public void setVideos(List<VideoObject> videos) {
		this.videos = videos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MediaList [videos=");
		builder.append(videos);
		builder.append("]");
		return builder.toString();
	}
}
