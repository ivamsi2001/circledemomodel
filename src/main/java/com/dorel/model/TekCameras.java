package com.dorel.model;

import java.io.Serializable;

public class TekCameras implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TekData  data;
	private String messageId;
	public TekData getData() {
		return data;
	}
	public void setData(TekData data) {
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
		return "TekCameras [data=" + data + ", messageId=" + messageId + "]";
	}
	
	

}
