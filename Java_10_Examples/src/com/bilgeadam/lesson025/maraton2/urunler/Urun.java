package com.bilgeadam.lesson025.maraton2.urunler;

public class Urun {
	
	private String isim;

	private double fiyat;

	public Urun(String isim, double fiyat) {
		this.isim = isim;
		this.fiyat = fiyat;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "Urun [isim=" + isim + ", fiyat=" + fiyat + "]";
	}
}