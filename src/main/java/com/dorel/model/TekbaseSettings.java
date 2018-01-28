package com.dorel.model;

public class TekbaseSettings {

	private BaseSettingsModel baseSettings;

	public BaseSettingsModel getBaseSettings() {
		return baseSettings;
	}

	public void setBaseSettings(BaseSettingsModel baseSettings) {
		this.baseSettings = baseSettings;
	}

	@Override
	public String toString() {
		return "TekbaseSettings [baseSettings=" + baseSettings + "]";
	}
	
}
