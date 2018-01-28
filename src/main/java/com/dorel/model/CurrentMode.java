package com.dorel.model;

public class CurrentMode {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "CurrentMode [state=" + state + "]";
	}
	
}
