package com.bilgeadam.lesson025.maraton2.kitapci;

public class KitaplikException extends Exception {

	private String mesaj;

	public KitaplikException(String mesaj) {
		super(mesaj);
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
}