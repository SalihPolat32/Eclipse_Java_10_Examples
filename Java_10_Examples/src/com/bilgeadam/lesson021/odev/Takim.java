package com.bilgeadam.lesson021.odev;

public class Takim {

	private String takimAdi;
	
	private String sehir;
	
	private int stadyumKapasitesi;

	public Takim() {
		super();
	}

	public Takim(String takimAdi, String sehir, int stadyumKapasitesi) {
		super();
		this.takimAdi = takimAdi;
		this.sehir = sehir;
		this.stadyumKapasitesi = stadyumKapasitesi;
	}

	public String getTakimAdi() {
		return takimAdi;
	}

	public void setTakimAdid(String takimAdi) {
		this.takimAdi = takimAdi;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public int getStadyumKapasitesi() {
		return stadyumKapasitesi;
	}

	public void setStadyumKapasitesi(int stadyumKapasitesi) {
		this.stadyumKapasitesi = stadyumKapasitesi;
	}

	@Override
	public String toString() {
		return "Takim [takimAdi=" + takimAdi + ", sehir=" + sehir + ", stadyumKapasitesi=" + stadyumKapasitesi + "]";
	}
}