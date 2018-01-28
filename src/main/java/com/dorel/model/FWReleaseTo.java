package com.dorel.model;

public class FWReleaseTo {
	
	private String severity;
	private String relaseimmediately;
	private String oldfwversion;
	private long releasedate;
	private String productserialnofrom;
	private String productserialnoto;
	private String productserialnos;
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getRelaseimmediately() {
		return relaseimmediately;
	}
	public void setRelaseimmediately(String relaseimmediately) {
		this.relaseimmediately = relaseimmediately;
	}
	public String getOldfwversion() {
		return oldfwversion;
	}
	public void setOldfwversion(String oldfwversion) {
		this.oldfwversion = oldfwversion;
	}

	public long getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(long releasedate) {
		this.releasedate = releasedate;
	}
	public String getProductserialnofrom() {
		return productserialnofrom;
	}
	public void setProductserialnofrom(String productserialnofrom) {
		this.productserialnofrom = productserialnofrom;
	}
	public String getProductserialnoto() {
		return productserialnoto;
	}
	public void setProductserialnoto(String productserialnoto) {
		this.productserialnoto = productserialnoto;
	}
	public String getProductserialnos() {
		return productserialnos;
	}
	public void setProductserialnos(String productserialnos) {
		this.productserialnos = productserialnos;
	}
	
	
	@Override
	public String toString() {
		return "FirmwareReleaseTo [severity=" + severity + ", relaseimmediately=" + relaseimmediately + ", oldfwversion="
		+ oldfwversion + ", releasedate=" + releasedate + ", productserialnofrom=" + productserialnofrom + ", productserialnoto=" + productserialnoto +",productserialnos="+ productserialnos + "]";
	}

}
