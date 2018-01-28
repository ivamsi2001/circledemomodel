package com.dorel.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
@SuppressWarnings("serial")
@Entity
@Table(name = "extcontractoruserdata")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Extcontractoruserdata implements  Serializable{

	@Id
	@Type(type="pg-uuid")
	private UUID  djguserid;
	
	@Column(name = "extcontractoruserid")
	private String extcontractoruserid;
	
	@Column(name = "extcontractorpassword")
	private String extcontractorpassword;
	
	@Column(name = "extcontractorauthtoken")
	private String extcontractorauthtoken;
	
	@Column(name = "extcontractorcode")
	private String extcontractorcode;
	
	@Column(name = "additionalsetting")
	private String additionalsetting;

	/**
	 * @return the djguserid
	 */
	public UUID getDjguserid() {
		return djguserid;
	}

	/**
	 * @param djguserid the djguserid to set
	 */
	public void setDjguserid(UUID djguserid) {
		this.djguserid = djguserid;
	}

	/**
	 * @return the extcontractoruserid
	 */
	public String getExtcontractoruserid() {
		return extcontractoruserid;
	}

	/**
	 * @param extcontractoruserid the extcontractoruserid to set
	 */
	public void setExtcontractoruserid(String extcontractoruserid) {
		this.extcontractoruserid = extcontractoruserid;
	}

	/**
	 * @return the extcontractorpassword
	 */
	public String getExtcontractorpassword() {
		return extcontractorpassword;
	}

	/**
	 * @param extcontractorpassword the extcontractorpassword to set
	 */
	public void setExtcontractorpassword(String extcontractorpassword) {
		this.extcontractorpassword = extcontractorpassword;
	}

	/**
	 * @return the extcontractorauthtoken
	 */
	public String getExtcontractorauthtoken() {
		return extcontractorauthtoken;
	}

	/**
	 * @param extcontractorauthtoken the extcontractorauthtoken to set
	 */
	public void setExtcontractorauthtoken(String extcontractorauthtoken) {
		this.extcontractorauthtoken = extcontractorauthtoken;
	}

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
	 * @return the additionalsetting
	 */
	public String getAdditionalsetting() {
		return additionalsetting;
	}

	/**
	 * @param additionalsetting the additionalsetting to set
	 */
	public void setAdditionalsetting(String additionalsetting) {
		this.additionalsetting = additionalsetting;
	}
	
	
}
