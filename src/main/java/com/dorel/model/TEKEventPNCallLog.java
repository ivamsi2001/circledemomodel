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
@Table(name = "tekeventpncalllog")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TEKEventPNCallLog implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Type(type="pg-uuid")
	private UUID  logid;

	@Column(name = "utctime")
	private long utctime;
	
	@Column(name = "cameraid")
	private String cameraid;
	
	@Column(name = "type")
	private String type;

	@Column(name = "subtype")
	private String subtype;

	@Column(name = "sensitivity")
	private int sensitivity;
	   
	@Column(name = "dateadded")
	private Date dateadded;
	
	@Column(name = "medialist")
	private String medialist;
	
	@Column(name = "more")
	private String more;

	public String getMore() {
		return more;
	}

	public void setMore(String more) {
		this.more = more;
	}

	public String getMedialist() {
		return medialist;
	}

	public void setMedialist(String medialist) {
		this.medialist = medialist;
	}

	public UUID getLogid() {
		return logid;
	}

	public void setLogid(UUID logid) {
		this.logid = logid;
	}

	public long getUtctime() {
		return utctime;
	}
 
	public void setUtctime(long utctime) {
		this.utctime = utctime;
	}	

	public void setUtctime(int utctime) {
		this.utctime = utctime;
	}

	public String getCameraid() {
		return cameraid;
	}

	public void setCameraid(String cameraid) {
		this.cameraid = cameraid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public int getSensitivity() {
		return sensitivity;
	}

	public void setSensitivity(int sensitivity) {
		this.sensitivity = sensitivity;
	}

	public Date getDateadded() {
		return dateadded;
	}

	public void setDateadded(Date dateadded) {
		this.dateadded = dateadded;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TEKEventPNCallLog [logid=");
		builder.append(logid);
		builder.append(", utctime=");
		builder.append(utctime);
		builder.append(", cameraid=");
		builder.append(cameraid);
		builder.append(", type=");
		builder.append(type);
		builder.append(", subtype=");
		builder.append(subtype);
		builder.append(", sensitivity=");
		builder.append(sensitivity);
		builder.append(", dateadded=");
		builder.append(dateadded);
		builder.append("]");
		return builder.toString();
	}
	



}
