package com.bilgeadam.lesson025.maraton2cozum.ucakapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Yolcu {

	private int id;
	
	private String ad;
	
	private String soyad;

	private int koltukNo;
	
	private boolean checkIn;
	
	static final int BASE_FIYAT = 100;
	
	private Map<String, Integer> biletler;

	public Yolcu(int id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.koltukNo = koltukNoUret();
		this.biletler = new HashMap<>();
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

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public Map<String, Integer> getBiletler() {
		return biletler;
	}

	public void setBiletler(Map<String, Integer> biletler) {
		this.biletler = biletler;
	}

	public static int getBaseFiyat() {
		return BASE_FIYAT;
	}
	
	public int koltukNoUret() {
		
		Random random = new Random();
		
		return random.nextInt(1, 201);
	}
	
	public abstract void yolcuBilgileriniGetir();
	
	public abstract void biletAl(EFirma firmaAdi);
	
	public void checkInYap() {
		
		if (checkIn) {
			
			System.out.println(ad + " İçin Zaten Check-In yapılmıştır.");
		} else {

			System.out.println("Check-In Yapılmıştır. İyi Uçuşlar.");
			this.checkIn = true;
		}
	}
	
	public void ucagaBin() {
		
		if (checkIn) {
			
			System.out.println(ad + " " + koltukNo + " Numaraları Koltukta Uçağa Binebilirsiniz.");
		} else {

			System.out.println("Uçağa Binmek İçin Lütfen Check-In Yapınız.");
		}
	}

	@Override
	public String toString() {
		return "Yolcu [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", koltukNo=" + koltukNo + ", checkIn=" + checkIn
				+ "]";
	}
}