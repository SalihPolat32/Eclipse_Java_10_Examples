package com.bilgeadam.lesson025.maraton2.kitapci;

import java.util.ArrayList;
import java.util.List;

public class Musteri extends Kisi {
	
	private String telNo;
	
	private String adres;
	
	private List<Kitap> kiralanmısKitaplar;

	public Musteri(int id, String ad, String soyad, String telNo, String adres, List<Kitap> kiralanmısKitaplar) {
		super(id, ad, soyad);
		this.telNo = telNo;
		this.adres = adres;
		this.kiralanmısKitaplar =new ArrayList<>();
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public List<Kitap> getKiralanmısKitaplar() {
		return kiralanmısKitaplar;
	}

	public void setKiralanmısKitaplar(List<Kitap> kiralanmısKitaplar) {
		this.kiralanmısKitaplar = kiralanmısKitaplar;
	}

	@Override
	public String toString() {
		return "Musteri [telNo=" + telNo + ", adres=" + adres + ", kiralanmısKitaplar=" + kiralanmısKitaplar
				+ ", getId()=" + getId() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + "]";
	}
}