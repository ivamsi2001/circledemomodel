package com.dorel.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class CameraStatusModel implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String djguserid;
	private String[] productserialnos;

	private List<CameraInfo> camerainfo;
	

	public String getDjguserid() {
		return djguserid;
	}

	public void setDjguserid(String djguserid) {
		this.djguserid = djguserid;
	}

	public String[] getProductserialnos() {
		return productserialnos;
	}

	public void setProductserialnos(String[] productserialnos) {
		this.productserialnos = productserialnos;
	}

	public List<CameraInfo> getCamerainfo() {
		return camerainfo;
	}

	public void setCamerainfo(List<CameraInfo> camerainfo) {
		this.camerainfo = camerainfo;
	}

	@Override
	public String toString() {
		return "CameraStatusModel [djguserid=" + djguserid + ", productserialnos=" + Arrays.toString(productserialnos)
				+ ", camerainfo=" + camerainfo + "]";
	}

	
}
