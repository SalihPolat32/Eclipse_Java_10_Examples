package com.bilgeadam.lesson025.maraton2cozum.ucakapp;

public class BusinessYolcu extends Yolcu {

	static final int BUSINESS_FIYAT = 200;
	
	static final int BUSINESS_VIP_FIYAT = 150;
	
	private boolean isVip;

	public BusinessYolcu(int id, String ad, String soyad, boolean isVip) {
		super(id, ad, soyad);
		this.isVip = isVip;
	}

	public boolean isVip() {
		return isVip;
	}

	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}

	@Override
	public void yolcuBilgileriniGetir() {

		System.out.println("Ekonomi Yolcusu: " + getAd() + " Biletleri " + getBiletler());
	}

	@Override
	public void biletAl(EFirma firmaAdi) {
		
		int fiyat = 0;
		String value = "";
		if (isVip) {
			
			fiyat = BASE_FIYAT + BUSINESS_FIYAT + BUSINESS_VIP_FIYAT;
			value = "VIP";
		} else {
			
			fiyat = BASE_FIYAT + BUSINESS_FIYAT;
		}
		getBiletler().put(firmaAdi.name(), fiyat);
		System.out.println(getAd() + " Adlı Yolcu " + firmaAdi + " İçin " + value + " İçin Bilet Almıştır. Biletleriniz --> " + getBiletler());
	}
}