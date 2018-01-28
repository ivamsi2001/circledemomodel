package com.dorel.model;

import java.io.Serializable;

public class CameraInfo implements  Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productserialno;
	private String provisioned;
	
	public String getProductserialno() {
		return productserialno;
	}
	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}
	public String getProvisioned() {
		return provisioned;
	}
	public void setProvisioned(String provisioned) {
		this.provisioned = provisioned;
	}
	@Override
	public String toString() {
		return "CameraInfo [productserialno=" + productserialno + ", provisioned=" + provisioned + "]";
	}
	
}
