package com.bilgeadam.lesson021.odev;

public class Futbolcu extends Takim {

	private static String isim;

	private int formaNumarasi;

	private static String mevki;

	private int hiz;

	private int pas;

	private int topSurme;

	private int sut;

	private int dayaniklilik;

	public Futbolcu() {
		super();
	}

	public Futbolcu(String isim, int formaNumarasi, int hiz, int pas, int topSurme, int sut,
			int dayaniklilik) {
		super(isim, isim, pas);
		this.isim = isim;
		this.formaNumarasi = formaNumarasi;
		this.hiz = hiz;
		this.pas = pas;
		this.topSurme = topSurme;
		this.sut = sut;
		this.dayaniklilik = dayaniklilik;
		setTakimAdid("Fenerbahçe");
		setSehir("İstanbul");
	}

	public static String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getFormaNumarasi() {
		return formaNumarasi;
	}

	public void setFormaNumarasi(int formaNumarasi) {
		this.formaNumarasi = formaNumarasi;
	}

	public static String getMevki() {
		return mevki;
	}

	public void setMevki(String mevki) {
		this.mevki = mevki;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	public int getPas() {
		return pas;
	}

	public void setPas(int pas) {
		this.pas = pas;
	}

	public int getTopSurme() {
		return topSurme;
	}

	public void setTopSurme(int topSurme) {
		this.topSurme = topSurme;
	}

	public int getSut() {
		return sut;
	}

	public void setSut(int sut) {
		this.sut = sut;
	}

	public int getDayaniklilik() {
		return dayaniklilik;
	}

	public void setDayaniklilik(int dayaniklilik) {
		this.dayaniklilik = dayaniklilik;
	}

	@Override
	public String toString() {
		return "Futbolcu [isim=" + isim + ", formaNumarasi=" + formaNumarasi + ", mevki=" + mevki + ", hiz=" + hiz
				+ ", pas=" + pas + ", topSurme=" + topSurme + ", sut=" + sut + ", dayaniklilik=" + dayaniklilik
				+ ", getTakimAdi()=" + getTakimAdi() + ", getSehir()=" + getSehir() + "]";
	}

	
}