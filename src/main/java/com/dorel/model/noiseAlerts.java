package com.dorel.model;

public class noiseAlerts{
	
	private boolean state;

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "noiseAlerts [state=" + state + "]";
	}

	
}
