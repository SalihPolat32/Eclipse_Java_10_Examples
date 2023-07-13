package com.bilgeadam.lesson016;

import java.util.Arrays;

public class Market {

	private String ad;
	private String adres;
	private Urun[] urunler;
	private Calisan[] calisanlar;
	private Musteri[] Musteriler;
	
	public Market(String ad, String adres) {
		super();
		this.ad = ad;
		this.adres = adres;
	}

	public Market(String ad, String adres, Urun[] urunler, Calisan[] calisanlar) {
		super();
		this.ad = ad;
		this.adres = adres;
		this.urunler = urunler;
		this.calisanlar = calisanlar;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public Urun[] getUrunler() {
		return urunler;
	}

	public void setUrunler(Urun[] urunler) {
		this.urunler = urunler;
	}

	public Calisan[] getCalisanlar() {
		return calisanlar;
	}

	public void setCalisanlar(Calisan[] calisanlar) {
		this.calisanlar = calisanlar;
	}

	public Musteri[] getMusteriler() {
		return Musteriler;
	}

	public void setMusteriler(Musteri[] musteriler) {
		Musteriler = musteriler;
	}

	@Override
	public String toString() {
		return "Market [ad=" + ad + ", adres=" + adres + ", urunler=" + Arrays.toString(urunler) + ", calisanlar="
				+ Arrays.toString(calisanlar) + ", Musteriler=" + Arrays.toString(Musteriler) + "]";
	}
}