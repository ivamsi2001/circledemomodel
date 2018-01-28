package com.dorel.model;

import java.io.Serializable;
import java.util.Arrays;

public class SensitivityModel implements  Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String djguserid;
	private String productserialno;
	private long[] utctime;
	
	public String getDjguserid() {
		return djguserid;
	}
	public void setDjguserid(String djguserid) {
		this.djguserid = djguserid;
	}
	
	public String getProductserialno() {
		return productserialno;
	}
	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}
	public long[] getUtctime() {
		return utctime;
	}
	public void setUtctime(long[] utctime) {
		this.utctime = utctime;
	}
	@Override
	public String toString() {
		return "SensitivityModel [djguserid=" + djguserid + ", productserialno=" + productserialno + ", utctime="
				+ Arrays.toString(utctime) + "]";
	}
	
}
