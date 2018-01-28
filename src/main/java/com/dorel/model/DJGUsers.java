package com.dorel.model;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@SuppressWarnings("serial")
@Entity
@Table(name = "djgusers")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ApiModel(
        value = "DJGUsers", 
        description = "This contains a user related data.")
public class DJGUsers implements  Serializable{
	
	@ApiModelProperty(hidden = true)
	@Id
	@Type(type="pg-uuid")
	private UUID  djguserid;

	@ApiModelProperty(hidden = true)
	@Column(name = "fullname")
	private String fullname;
	
	@ApiModelProperty(value = "email", required = true, example="david.flynn@dorel.com")
	@Column(name = "email")
	private String email;
	
	@ApiModelProperty(value = "password", required = true, example="d0reL@!23")
	@Column(name = "password")
	private String password;
	
	@ApiModelProperty(value = "phone", required = true, example="+1-855-797-9485 ")
	@Column(name = "phone")
	private String phone;
	
	@ApiModelProperty(hidden = true)
	@Column(name = "usebiometric")
	private boolean usebiometric;
	
	@ApiModelProperty(value = "saltkey", required = true, example="sbCd@23cs")
	@Column(name = "saltkey")
	private String saltkey;
	
	@ApiModelProperty(hidden = true)
	@Column(name = "address")
	private String address;
	
	@ApiModelProperty(hidden = true)
	@Column(name = "city")
	private String city;
	
	@ApiModelProperty(hidden = true)
	@Column(name = "state")
	private String state;
	
	@ApiModelProperty(hidden = true)
	@Column(name = "zip")
	private String zip;
	
	@ApiModelProperty(hidden = true)
	@Column(name = "isemailverified")
	private Boolean isemailverified;

	@ApiModelProperty(hidden = true)
	@Column(name = "changepwd")
	private boolean changepwd;

	@ApiModelProperty(hidden = true)
	@Column(name = "pwdexpiry")
	private Date pwdexpiry;

	@ApiModelProperty(hidden = true)
	@Column(name = "active")
	private Boolean active;

	@ApiModelProperty(hidden = true)
	@Column(name = "islocked")
	private Boolean islocked;

	@ApiModelProperty(hidden = true)
	@Column(name = "tekniqueuserid")
	private String tekniqueuserid;
	
	@ApiModelProperty(hidden = true)
	@Column(name = "tekniquepassword")
	private String tekniquepassword;
	
	@ApiModelProperty(hidden = true)
	@Column(name = "timezone")
	private String timezone;
	
	@ApiModelProperty(hidden = true)
	@Type(type="pg-uuid")
	private UUID createdby;

	@ApiModelProperty(hidden = true)
	@Column(name = "datecreated")
	private Date datecreated;
	
	@ApiModelProperty(hidden = true)
	@Type(type="pg-uuid")
	private UUID modifiedby;
	
	@ApiModelProperty(hidden = true)
	@Column(name = "datemodified")
	private Date datemodified;
	
	@Column(name = "termsandconditions")
	private Boolean termsandconditions;
	

	@ApiModelProperty(value = "Devicetoken", required = false, example="185A646516F95F3E312C...")
	@Transient
    private String devicetoken;
    
	@ApiModelProperty(value = "deviceos", required = false, example="iOS/Android")
    @Transient
    private String deviceos;
    
	@ApiModelProperty(value = "deviceosversion", required = false, example="7s")
    @Transient
    private String deviceosversion;
    
	@ApiModelProperty(value = "devicetype", required = false, example="Phone/Tab")
    @Transient
    private String devicetype;
    
	@ApiModelProperty(value = "devicename", required = false, example="Apple")
    @Transient
    private String devicename;
    
	@ApiModelProperty(value = "productcode", required = true, example="ParentUnit")
	@Transient
    private String productcode;
	
	@ApiModelProperty(hidden = true)
	@Transient
	private String verificationcode;
	
	@ApiModelProperty(hidden = true)
	@Transient
	private String verificationcodetype;
	
	@ApiModelProperty(hidden = true)
	@Transient
	private String newemail;
	
	@ApiModelProperty(hidden = true)
	@Transient
	private int messageCode;
	
	@ApiModelProperty(hidden = true)
	@Transient
	private String message;

	@ApiModelProperty(hidden = true)
	@Transient
	private String cameraprovisioned;

	@Transient
	private String olddevicetoken;

	@Transient
	private String productserialno;
	
	@Transient
	private String appversion;
	
	public String getAppversion() {
		return appversion;
	}

	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}

	/**
	 * @return the termsandconditions
	 */
	public Boolean getTermsandconditions() {
		return termsandconditions;
	}

	/**
	 * @param termsandconditions the termsandconditions to set
	 */
	public void setTermsandconditions(Boolean termsandconditions) {
		this.termsandconditions = termsandconditions;
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
	 * @return the olddevicetoken
	 */
	public String getOlddevicetoken() {
		return olddevicetoken;
	}

	/**
	 * @param olddevicetoken the olddevicetoken to set
	 */
	public void setOlddevicetoken(String olddevicetoken) {
		this.olddevicetoken = olddevicetoken;
	}

	public String getCameraprovisioned() {
		return cameraprovisioned;
	}

	public void setCameraprovisioned(String cameraprovisioned) {
		this.cameraprovisioned = cameraprovisioned;
	}

	public int getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(int messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public DJGUsers(DJGUsers user) {
		super();
	
		this.newemail = user.getEmail();
		this.password = user.getPassword();
		System.out.println("newemail "+newemail+"  | password "+password);
	}
	
	public DJGUsers() {
		// TODO Auto-generated constructor stub
	}

	public String getNewemail() {
		return newemail;
	}

	public void setNewemail(String newemail) {
		this.newemail = newemail;
	}

	public String getVerificationcode() {
		return verificationcode;
	}

	public void setVerificationcode(String verificationcode) {
		this.verificationcode = verificationcode;
	}

	public String getVerificationcodetype() {
		return verificationcodetype;
	}

	public void setVerificationcodetype(String verificationcodetype) {
		this.verificationcodetype = verificationcodetype;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isUsebiometric() {
		return usebiometric;
	}

	public void setUsebiometric(boolean usebiometric) {
		this.usebiometric = usebiometric;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public boolean isChangepwd() {
		return changepwd;
	}

	public void setChangepwd(boolean changepwd) {
		this.changepwd = changepwd;
	}

	public Date getPwdexpiry() {
		return pwdexpiry;
	}

	public void setPwdexpiry(Date pwdexpiry) {
		this.pwdexpiry = pwdexpiry;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getIslocked() {
		return islocked;
	}

	public void setIslocked(Boolean islocked) {
		this.islocked = islocked;
	}

	public String getTekniqueuserid() {
		return tekniqueuserid;
	}

	public void setTekniqueuserid(String tekniqueuserid) {
		this.tekniqueuserid = tekniqueuserid;
	}

	public String getTekniquepassword() {
		return tekniquepassword;
	}

	public void setTekniquepassword(String tekniquepassword) {
		this.tekniquepassword = tekniquepassword;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	
	public UUID getCreatedby() {
		return createdby;
	}

	public void setCreatedby(UUID createdby) {
		this.createdby = createdby;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	
	public UUID getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(UUID modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getDatemodified() {
		return datemodified;
	}

	public void setDatemodified(Date datemodified) {
		this.datemodified = datemodified;
	}

	public UUID getDjguserid() {
		return djguserid;
	}

	public void setDjguserid(UUID djguserid) {
		this.djguserid = djguserid;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSaltkey() {
		return saltkey;
	}

	public void setSaltkey(String saltkey) {
		this.saltkey = saltkey;
	}

	public Boolean getIsemailverified() {
		return isemailverified;
	}

	public void setIsemailverified(Boolean isemailverified) {
		this.isemailverified = isemailverified;
	}

	public String getDevicetoken() {
		return devicetoken;
	}

	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}

	public String getDeviceos() {
		return deviceos;
	}

	public void setDeviceos(String deviceos) {
		this.deviceos = deviceos;
	}

	public String getDeviceosversion() {
		return deviceosversion;
	}

	public void setDeviceosversion(String deviceosversion) {
		this.deviceosversion = deviceosversion;
	}

	public String getDevicetype() {
		return devicetype;
	}

	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}

	public String getDevicename() {
		return devicename;
	}

	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DJGUsers [djguserid=");
		builder.append(djguserid);
		builder.append(", fullname=");
		builder.append(fullname);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", usebiometric=");
		builder.append(usebiometric);
		builder.append(", saltkey=");
		builder.append(saltkey);
		builder.append(", address=");
		builder.append(address);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", zip=");
		builder.append(zip);
		builder.append(", isemailverified=");
		builder.append(isemailverified);
		builder.append(", changepwd=");
		builder.append(changepwd);
		builder.append(", pwdexpiry=");
		builder.append(pwdexpiry);
		builder.append(", active=");
		builder.append(active);
		builder.append(", islocked=");
		builder.append(islocked);
		builder.append(", tekniqueuserid=");
		builder.append(tekniqueuserid);
		builder.append(", tekniquepassword=");
		builder.append(tekniquepassword);
		builder.append(", timezone=");
		builder.append(timezone);
		builder.append(", createdby=");
		builder.append(createdby);
		builder.append(", datecreated=");
		builder.append(datecreated);
		builder.append(", modifiedby=");
		builder.append(modifiedby);
		builder.append(", datemodified=");
		builder.append(datemodified);
		builder.append(", termsandconditions=");
		builder.append(termsandconditions);
		builder.append(", devicetoken=");
		builder.append(devicetoken);
		builder.append(", deviceos=");
		builder.append(deviceos);
		builder.append(", deviceosversion=");
		builder.append(deviceosversion);
		builder.append(", devicetype=");
		builder.append(devicetype);
		builder.append(", devicename=");
		builder.append(devicename);
		builder.append(", productcode=");
		builder.append(productcode);
		builder.append(", verificationcode=");
		builder.append(verificationcode);
		builder.append(", verificationcodetype=");
		builder.append(verificationcodetype);
		builder.append(", newemail=");
		builder.append(newemail);
		builder.append(", messageCode=");
		builder.append(messageCode);
		builder.append(", message=");
		builder.append(message);
		builder.append(", cameraprovisioned=");
		builder.append(cameraprovisioned);
		builder.append(", olddevicetoken=");
		builder.append(olddevicetoken);
		builder.append(", productserialno=");
		builder.append(productserialno);
		builder.append("]");
		return builder.toString();
	}

	
	
}
