package com.bilgeadam.lesson025.maraton2cozum.ucakapp;

public class EkonomikYolcu extends Yolcu {

	static final int EKONOMI_FIYAT = 200;

	public EkonomikYolcu(int id, String ad, String soyad) {
		super(id, ad, soyad);
	}

	@Override
	public void yolcuBilgileriniGetir() {

		System.out.println("Ekonomi Yolcusu: " + getAd() + " Biletleri " + getBiletler());
	}

	@Override
	public void biletAl(EFirma firmaAdi) {

		int fiyat = BASE_FIYAT + EKONOMI_FIYAT;

		if (getBiletler().containsKey(firmaAdi.name())) {

			getBiletler().put(firmaAdi.name(), getBiletler().get(firmaAdi.name()) + fiyat);
			System.out.println(firmaAdi + " Adlı Firmadan Bir Bilet Daha Alınmıştır. Biletleriniz --> " + getBiletler());
		} else {

			getBiletler().put(firmaAdi.name(), fiyat);
			System.out.println(getAd() + " Adlı Yolcu " + firmaAdi
					+ " İçin Ekonomi Sınıfından Bilet Almıştır. Biletleriniz --> " + getBiletler());
		}
	}
}