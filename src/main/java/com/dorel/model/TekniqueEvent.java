package com.dorel.model;

import java.io.Serializable;

public class TekniqueEvent implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MediaList mediaList;
	private EventList eventList;
	private String  clientId;
	private String clientSecret;
	private String tekrawdata;
	private String forwardfrom;
	
	public String getForwardfrom() {
		return forwardfrom;
	}

	public void setForwardfrom(String forwardfrom) {
		this.forwardfrom = forwardfrom;
	}

	public String getTekrawdata() {
		return tekrawdata;
	}

	public void setTekrawdata(String tekrawdata) {
		this.tekrawdata = tekrawdata;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public EventList getEventList() {
		return eventList;
	}

	public void setEventList(EventList eventList) {
		this.eventList = eventList;
	}
	
	public MediaList getMediaList() {
		return mediaList;
	}

	public void setMediaList(MediaList mediaList) {
		this.mediaList = mediaList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TekniqueEvent [mediaList=");
		builder.append(mediaList);
		builder.append(", eventList=");
		builder.append(eventList);
		builder.append(", clientId=");
		builder.append(clientId);
		builder.append(", clientSecret=");
		builder.append(clientSecret);
		builder.append("]");
		return builder.toString();
	}

}

