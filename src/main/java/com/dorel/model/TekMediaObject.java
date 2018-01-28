package com.dorel.model;

import java.io.Serializable;
import java.util.List;

public class TekMediaObject implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7462662100083163808L;
	private List<MediaObject> media;
	private boolean truncated;
	
	public List<MediaObject> getMedia() {
		return media;
	}
	public void setMedia(List<MediaObject> media) {
		this.media = media;
	}
	public boolean isTruncated() {
		return truncated;
	}
	public void setTruncated(boolean truncated) {
		this.truncated = truncated;
	}
	@Override
	public String toString() {
		return "TekMediaObject [media=" + media + ", truncated=" + truncated + "]";
	}
	
}
