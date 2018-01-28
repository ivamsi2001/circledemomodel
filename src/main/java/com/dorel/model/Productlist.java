package com.dorel.model;

import java.util.Date;

public class Productlist {
	private String productserialno;

	private String djgrolecode;

	private Date accessuntil;
	
	private String action;


	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the productserialno
	 */
	public String getProductserialno() {
		return productserialno;
	}

	/**
	 * @param productserialno the productserialno to set
	 */
	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}

	/**
	 * @return the djgrolecode
	 */
	public String getDjgrolecode() {
		return djgrolecode;
	}

	/**
	 * @param djgrolecode the djgrolecode to set
	 */
	public void setDjgrolecode(String djgrolecode) {
		this.djgrolecode = djgrolecode;
	}

	/**
	 * @return the accessuntil
	 */
	public Date getAccessuntil() {
		return accessuntil;
	}

	/**
	 * @param accessuntil the accessuntil to set
	 */
	public void setAccessuntil(Date accessuntil) {
		this.accessuntil = accessuntil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Productlist [productserialno=");
		builder.append(productserialno);
		builder.append(", djgrolecode=");
		builder.append(djgrolecode);
		builder.append(", accessuntil=");
		builder.append(accessuntil);
		builder.append(", action=");
		builder.append(action);
		builder.append("]");
		return builder.toString();
	}

	
}
