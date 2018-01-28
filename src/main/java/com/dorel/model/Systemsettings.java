package com.dorel.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@SuppressWarnings("serial")
@Entity
@Table(name = "systemsettings")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Systemsettings implements  Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  settingid;
	
	@Column(name = "settingtype")
	private String settingtype;
	
	@Column(name = "settingvalue")
	private String settingvalue;

	/**
	 * @return the settingid
	 */
	public int getSettingid() {
		return settingid;
	}

	/**
	 * @param settingid the settingid to set
	 */
	public void setSettingid(int settingid) {
		this.settingid = settingid;
	}

	/**
	 * @return the settingtype
	 */
	public String getSettingtype() {
		return settingtype;
	}

	/**
	 * @param settingtype the settingtype to set
	 */
	public void setSettingtype(String settingtype) {
		this.settingtype = settingtype;
	}

	/**
	 * @return the settingvalue
	 */
	public String getSettingvalue() {
		return settingvalue;
	}

	/**
	 * @param settingvalue the settingvalue to set
	 */
	public void setSettingvalue(String settingvalue) {
		this.settingvalue = settingvalue;
	}
	
}
