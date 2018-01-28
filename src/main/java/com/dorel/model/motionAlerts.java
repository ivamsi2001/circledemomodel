package com.dorel.model;

public class motionAlerts {

	private boolean state;

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "motionAlerts [state=" + state + "]";
	}
}
