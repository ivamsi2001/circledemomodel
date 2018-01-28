package com.dorel.model;

public class speakerVolume {

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "speakerVolume [state=" + state + "]";
	}
}
