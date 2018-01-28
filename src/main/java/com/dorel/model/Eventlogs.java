package com.dorel.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "eventlogs")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Eventlogs implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Type(type="pg-uuid")
	private UUID  id;

	@Column(name = "productserialno")
	private String productserialno;

	@Column(name = "starttime")
	private long starttime;

	@Column(name = "uploadedfilelink")
	private String uploadedfilelink;
	
	@Column(name = "outfilename")
	private String outfilename;
	
	@Column(name = "datecreated")
	private Date datecreated;

	@Column(name = "urlcount")
	private int urlcount;
	
	@Column(name="datemodified")
	private Date datemodified;
	
	public int getUrlcount() {
		return urlcount;
	}

	public void setUrlcount(int urlcount) {
		this.urlcount = urlcount;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getProductserialno() {
		return productserialno;
	}

	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}

	public long getStarttime() {
		return starttime;
	}

	public void setStarttime(long starttime) {
		this.starttime = starttime;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public String getUploadedfilelink() {
		return uploadedfilelink;
	}

	public void setUploadedfilelink(String uploadedfilelink) {
		this.uploadedfilelink = uploadedfilelink;
	}

	public String getOutfilename() {
		return outfilename;
	}

	public void setOutfilename(String outfilename) {
		this.outfilename = outfilename;
	}

	public Date getDatemodified() {
		return datemodified;
	}

	public void setDatemodified(Date datemodified) {
		this.datemodified = datemodified;
	}

	
}
