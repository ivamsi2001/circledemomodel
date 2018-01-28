package com.dorel.model;

import java.io.Serializable;

public class TekCamerasResponse implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TekCamerasResponseCode  data;
	private String messageId;
	
	public TekCamerasResponseCode getData() {
		return data;
	}
	public void setData(TekCamerasResponseCode data) {
		this.data = data;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	@Override
	public String toString() {
		return "TekCamerasResponse [data=" + data + ", messageId=" + messageId + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
