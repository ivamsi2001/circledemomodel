package com.dorel.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name = "productuserview")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Productuserview implements  Serializable{

	@Id
	@Type(type="pg-uuid")
	private UUID  djguserid;
	
	@Column(name = "productcode")
	private String productcode;
	
	@Column(name = "productserialno")
	private String productserialno;
	
	@Column(name = "pairedproductid")
	private UUID  pairedproductid;
	
	@Column(name = "soundswitch")
	private String  soundswitch;
	
	@Column(name = "soundsensitivity")
	private int  soundsensitivity;
	
	@Column(name = "movementswitch")
	private String  movementswitch;
	
	@Column(name = "movementsensitivity")
	private int  movementsensitivity;

	@Column(name = "displayname")
	private String  displayname;
	
	public String getDisplayname() {
		return displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	public UUID getDjguserid() {
		return djguserid;
	}

	public void setDjguserid(UUID djguserid) {
		this.djguserid = djguserid;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductserialno() {
		return productserialno;
	}

	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}

	public UUID getPairedproductid() {
		return pairedproductid;
	}

	public void setPairedproductid(UUID pairedproductid) {
		this.pairedproductid = pairedproductid;
	}

	public String getSoundswitch() {
		return soundswitch;
	}

	public void setSoundswitch(String soundswitch) {
		this.soundswitch = soundswitch;
	}

	public int getSoundsensitivity() {
		return soundsensitivity;
	}

	public void setSoundsensitivity(int soundsensitivity) {
		this.soundsensitivity = soundsensitivity;
	}

	public String getMovementswitch() {
		return movementswitch;
	}

	public void setMovementswitch(String movementswitch) {
		this.movementswitch = movementswitch;
	}

	public int getMovementsensitivity() {
		return movementsensitivity;
	}

	public void setMovementsensitivity(int movementsensitivity) {
		this.movementsensitivity = movementsensitivity;
	}

	
}
