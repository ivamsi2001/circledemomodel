package com.dorel.model;

import java.io.Serializable;

public class TekMedia implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TekMediaObject data;
	private String messageId;
	
	
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public TekMediaObject getData() {
		return data;
	}
	public void setData(TekMediaObject data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "TekMedia [data=" + data + ", messageId=" + messageId + "]";
	}
	
	

}
