package com.bilgeadam.lesson025.maraton2.kitapci;

public class Kisi {
	
	private int id;

	private String ad;
	
	private String Soyad;

	public Kisi() {
		super();
	}

	public Kisi(int id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		Soyad = soyad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return Soyad;
	}

	public void setSoyad(String soyad) {
		Soyad = soyad;
	}

	@Override
	public String toString() {
		return "Kisi [id=" + id + ", ad=" + ad + ", Soyad=" + Soyad + "]";
	}
}