package com.dorel.model;

public class EventNotificationsModel {

	private String productserialno;
	private String movement;
	private String sound;
	private String sensitivitylevel;
	private String feedback;
	private String rating;
	
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String getProductserialno() {
		return productserialno;
	}
	public void setProductserialno(String productserialno) {
		this.productserialno = productserialno;
	}
	public String getMovement() {
		return movement;
	}
	public void setMovement(String movement) {
		this.movement = movement;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getSensitivitylevel() {
		return sensitivitylevel;
	}
	public void setSensitivitylevel(String sensitivitylevel) {
		this.sensitivitylevel = sensitivitylevel;
	}
	
	@Override
	public String toString() {
		return "EventNotificationsModel [productserialno=" + productserialno + ", movement=" + movement + ", sound="
				+ sound + ", sensitivitylevel=" + sensitivitylevel + ", feedback=" + feedback + ", rating=" + rating
				+ "]";
	}
	
}
