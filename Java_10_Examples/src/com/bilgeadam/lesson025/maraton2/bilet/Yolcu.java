package com.bilgeadam.lesson025.maraton2.bilet;

import java.util.Random;

public abstract class Yolcu {

	Random random = new Random();
	
	private int id;
	
	private String ad;
	
	private String soyad;
	
	private int koltukNo;
	
	private boolean chechin;
	
	private final int BASEFIYAT = 100;
	
	public Yolcu() {
		super();
	}

	public Yolcu(int id, String ad, String soyad, boolean chechin) {
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.koltukNo = random.nextInt(1, 200);
		this.chechin = chechin;
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
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getKoltukNo() {
		return koltukNo;
	}

	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}

	public boolean isChechin() {
		return chechin;
	}

	public void setChechin(boolean chechin) {
		this.chechin = chechin;
	}

	public int getBASEFIYAT() {
		return BASEFIYAT;
	}

	@Override
	public String toString() {
		return "Yolcu [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", koltukNo=" + koltukNo + ", chechin=" + chechin
				+ ", BASEFIYAT=" + BASEFIYAT + "]";
	}
	
	public abstract void biletAl(EFirmaAdi firmaAdi);
	
	public abstract void checkInYap();
	
	public abstract void yolcuBilgileriniGetir();
	
	public abstract void ucagaBin();
}