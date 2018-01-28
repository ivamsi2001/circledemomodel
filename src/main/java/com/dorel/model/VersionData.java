package com.dorel.model;

import java.io.Serializable;

public class VersionData implements  Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  CameraVersionObject data;
    private String messageId = "";
	public CameraVersionObject getData() {
		return data;
	}
	public void setData(CameraVersionObject data) {
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
		return "VersionData [data=" + data + ", messageId=" + messageId + "]";
	}
    
}