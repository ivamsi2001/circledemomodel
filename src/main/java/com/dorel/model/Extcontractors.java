package com.dorel.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@SuppressWarnings("serial")
@Entity
@Table(name = "extcontractors")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Extcontractors implements  Serializable{

	@Id
	@Column(name = "extcontractorcode")
	private String extcontractorcode;
	
	@Column(name = "extcontractorname")
	private String extcontractorname;
	
	@Column(name = "productcode")
	private String productcode;
	
	@Column(name = "apiurl")
	private String apiurl;
	
	@Column(name = "additionalcontractorsetting")
	private String additionalcontractorsetting;

	/**
	 * @return the extcontractorcode
	 */
	public String getExtcontractorcode() {
		return extcontractorcode;
	}

	/**
	 * @param extcontractorcode the extcontractorcode to set
	 */
	public void setExtcontractorcode(String extcontractorcode) {
		this.extcontractorcode = extcontractorcode;
	}

	/**
	 * @return the extcontractorname
	 */
	public String getExtcontractorname() {
		return extcontractorname;
	}

	/**
	 * @param extcontractorname the extcontractorname to set
	 */
	public void setExtcontractorname(String extcontractorname) {
		this.extcontractorname = extcontractorname;
	}

	/**
	 * @return the productcode
	 */
	public String getProductcode() {
		return productcode;
	}

	/**
	 * @param productcode the productcode to set
	 */
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	/**
	 * @return the apiurl
	 */
	public String getApiurl() {
		return apiurl;
	}

	/**
	 * @param apiurl the apiurl to set
	 */
	public void setApiurl(String apiurl) {
		this.apiurl = apiurl;
	}

	/**
	 * @return the additionalcontractorsetting
	 */
	public String getAdditionalcontractorsetting() {
		return additionalcontractorsetting;
	}

	/**
	 * @param additionalcontractorsetting the additionalcontractorsetting to set
	 */
	public void setAdditionalcontractorsetting(String additionalcontractorsetting) {
		this.additionalcontractorsetting = additionalcontractorsetting;
	}
	
}
