package com.bilgeadam.lesson025.maraton2.bilet;

import java.util.HashMap;
import java.util.Map;

public class EkonomiYolcu extends Yolcu {

	private final int EKONOMIFIYAT = 100;
	
	Map<EFirmaAdi, Integer> biletMap = new HashMap<>();

	public EkonomiYolcu(int id, String ad, String soyad, boolean chechin) {
		super(id, ad, soyad, chechin);
	}

	public int getEKONOMIFIYAT() {
		return EKONOMIFIYAT;
	}

	@Override
	public String toString() {
		return "EkonomiYolcu [EKONOMIFIYAT=" + EKONOMIFIYAT + ", getEKONOMIFIYAT()=" + getEKONOMIFIYAT() + ", getId()="
				+ getId() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + ", getKoltukNo()=" + getKoltukNo()
				+ ", isChechin()=" + isChechin() + "]";
	}

	@Override
	public void biletAl(EFirmaAdi firmaAdi) {

		int biletUcreti = getBASEFIYAT() + getEKONOMIFIYAT();
		
		if (biletMap.containsKey(firmaAdi)) {
			
			int bilet = biletMap.get(firmaAdi);
			biletMap.replace(firmaAdi, bilet + biletUcreti);
			
		} else {

			biletMap.put(firmaAdi, biletUcreti);
		}
		
		System.out.println(getAd() +  " Yolcunun Bileti: " + biletMap );
	}

	@Override
	public void checkInYap() {

		if (isChechin()) {
			
			System.out.println(getAd() + " İsimli Yolcunun Check-in Daha Önce Yapımıştır.");
			
		} else {

			setChechin(true);
			System.out.println("Check-in Yapılmıştır. " + getAd() + " Yolcunun Bileti Hazır.");
			
		}
	}

	@Override
	public void yolcuBilgileriniGetir() {
		
		System.out.println(getAd() + " İsimli Yolcunun Ekonomi Biletleri" + biletMap);
		
	}

	@Override
	public void ucagaBin() {

		if (isChechin()) {
			
			System.out.println(getAd() + " İsimli Yolcu Uçağa Binebilir. Koltuk Numarası: " + getKoltukNo());
			
		} else {

			System.out.println(getAd() + " İsimli Yolcu Önce Check-in Yapmalıdır.");
		}
	}
}