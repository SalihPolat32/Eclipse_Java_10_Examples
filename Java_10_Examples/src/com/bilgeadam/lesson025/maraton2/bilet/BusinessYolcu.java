package com.bilgeadam.lesson025.maraton2.bilet;

import java.util.HashMap;
import java.util.Map;

public class BusinessYolcu extends Yolcu {

	private final int BUSINNESFIYAT = 200;
	private final int BUSINNESVIPFIYAT = 150;
	private boolean vip;
	
	Map<EFirmaAdi, Integer> biletMap = new HashMap<>();
	
	public BusinessYolcu(int id, String ad, String soyad, boolean chechin, boolean vip) {
		super(id, ad, soyad, chechin);
		this.vip = vip;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public int getBUSINNESFIYAT() {
		return BUSINNESFIYAT;
	}

	public int getBUSINNESVIPFIYAT() {
		return BUSINNESVIPFIYAT;
	}

	@Override
	public String toString() {
		return "BusinessYolcu [BUSINNESFIYAT=" + BUSINNESFIYAT + ", BUSINNESVIPFIYAT=" + BUSINNESVIPFIYAT + ", vip="
				+ vip + ", getId()=" + getId() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad()
				+ ", getKoltukNo()=" + getKoltukNo() + "]";
	}

	@Override
	public void biletAl(EFirmaAdi firmaAdi) {
		
	int biletUcreti = getBASEFIYAT();
		
		if (vip == true) {
			
			biletUcreti = biletUcreti + getBUSINNESFIYAT() + getBUSINNESVIPFIYAT();
		} else {
			
			biletUcreti = biletUcreti + getBUSINNESFIYAT();
		}
		
		biletMap.put(firmaAdi, biletUcreti);
		
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
		
		System.out.println(getAd() + " İsimli Yolcunun Business Biletleri" + biletMap);
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