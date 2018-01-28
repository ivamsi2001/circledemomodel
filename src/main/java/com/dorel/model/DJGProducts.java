package com.dorel.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@SuppressWarnings("serial")
@Entity
@Table(name = "djgproducts")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DJGProducts implements  Serializable{

	@Id
	@Column(name = "productcode")
	private String productcode;
	
	@Column(name = "productname")
	private String productname;
	
	@Column(name = "appname")
	private String appname;

	@Column(name = "productsetting")
	private String productsetting;
	
	public String getProductsetting() {
		return productsetting;
	}

	public void setProductsetting(String productsetting) {
		this.productsetting = productsetting;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getAppname() {
		return appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}

	@Override
	public String toString() {
		return "DJGProducts [productcode=" + productcode + ", productname=" + productname + ", appname=" + appname
				+ ", productsetting=" + productsetting + "]";
	}
	
}
