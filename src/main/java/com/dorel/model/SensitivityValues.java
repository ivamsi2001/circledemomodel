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
@Table(name = "sensitivityvalues")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SensitivityValues implements  Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  sensitivityid;
	
	@Column(name = "sensitivitycode")
	private String sensitivitycode;
	
	@Column(name = "sensitivitycodevalue")
	private int sensitivitycodevalue;
	
	@Column(name = "sensitivityvalue")
	private int sensitivityvalue;

	@Column(name = "sensitivitytype")
	private String sensitivitytype;
	
	@Column(name = "productcode")
	private String productcode;

	@Column(name = "description")
	private String description;

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSensitivityid() {
		return sensitivityid;
	}

	public void setSensitivityid(int sensitivityid) {
		this.sensitivityid = sensitivityid;
	}

	public String getSensitivitycode() {
		return sensitivitycode;
	}

	public void setSensitivitycode(String sensitivitycode) {
		this.sensitivitycode = sensitivitycode;
	}

	public int getSensitivitycodevalue() {
		return sensitivitycodevalue;
	}

	public void setSensitivitycodevalue(int sensitivitycodevalue) {
		this.sensitivitycodevalue = sensitivitycodevalue;
	}

	public int getSensitivityvalue() {
		return sensitivityvalue;
	}

	public void setSensitivityvalue(int sensitivityvalue) {
		this.sensitivityvalue = sensitivityvalue;
	}

	public String getSensitivitytype() {
		return sensitivitytype;
	}

	public void setSensitivitytype(String sensitivitytype) {
		this.sensitivitytype = sensitivitytype;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	
	
	
	
	
}
