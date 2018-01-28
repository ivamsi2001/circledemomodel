package com.dorel.model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "errorlogs")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ErrorLogs implements  Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  errorlogid;
	
	@Column(name = "errormessage")
	private String errormessage;
	
	@Column(name = "refurl")
	private String refurl;
	
	@Column(name = "pageurl")
	private String pageurl;
	
	@Column(name = "funcname")
	private String funcname;
	
	@Column(name = "parameter1")
	private String parameter1;
	
	@Column(name = "parameter2")
	private String parameter2;
	
	@Column(name = "dateadded")
	private Date dateadded;


	/**
	 * @return the errorlogid
	 */
	public int getErrorlogid() {
		return errorlogid;
	}

	/**
	 * @param errorlogid the errorlogid to set
	 */
	public void setErrorlogid(int errorlogid) {
		this.errorlogid = errorlogid;
	}

	/**
	 * @return the errormessage
	 */
	public String getErrormessage() {
		return errormessage;
	}

	/**
	 * @param errormessage the errormessage to set
	 */
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

	/**
	 * @return the refurl
	 */
	public String getRefurl() {
		return refurl;
	}

	/**
	 * @param refurl the refurl to set
	 */
	public void setRefurl(String refurl) {
		this.refurl = refurl;
	}

	/**
	 * @return the pageurl
	 */
	public String getPageurl() {
		return pageurl;
	}

	/**
	 * @param pageurl the pageurl to set
	 */
	public void setPageurl(String pageurl) {
		this.pageurl = pageurl;
	}

	/**
	 * @return the funcname
	 */
	public String getFuncname() {
		return funcname;
	}

	/**
	 * @param funcname the funcname to set
	 */
	public void setFuncname(String funcname) {
		this.funcname = funcname;
	}

	/**
	 * @return the parameter1
	 */
	public String getParameter1() {
		return parameter1;
	}

	/**
	 * @param parameter1 the parameter1 to set
	 */
	public void setParameter1(String parameter1) {
		this.parameter1 = parameter1;
	}

	/**
	 * @return the parameter2
	 */
	public String getParameter2() {
		return parameter2;
	}

	/**
	 * @param parameter2 the parameter2 to set
	 */
	public void setParameter2(String parameter2) {
		this.parameter2 = parameter2;
	}

	/**
	 * @return the dateadded
	 */
	public Date getDateadded() {
		return dateadded;
	}

	/**
	 * @param dateadded the dateadded to set
	 */
	public void setDateadded(Date dateadded) {
		this.dateadded = dateadded;
	}
	
	
	
}
