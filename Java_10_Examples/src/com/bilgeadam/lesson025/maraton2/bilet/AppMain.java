package com.bilgeadam.lesson025.maraton2.bilet;

public class AppMain {

	public static void main(String[] args) {
		
		Yolcu yolcu1 = new BusinessYolcu(1, "Salih Polat", "DÖNMEZ", false, false);
		Yolcu yolcu2 = new BusinessYolcu(2, "Burak", "DELİCE", false, true);
		Yolcu yolcu3 = new BusinessYolcu(3, "Ahmet", "AKKOYUN", true, true);
		Yolcu yolcu4 = new EkonomiYolcu(1, "Ali", "GÜNEŞ", false);
		Yolcu yolcu5 = new EkonomiYolcu(2, "Ünal Gani", "BERK", true);
		
		System.out.println("***** BUSINESS VIP YOLCU *****");
		yolcu2.biletAl(EFirmaAdi.KLM);
		yolcu2.biletAl(EFirmaAdi.THY);
		System.out.println("---");
		yolcu2.checkInYap();
		yolcu2.checkInYap();
		yolcu2.ucagaBin();
		yolcu2.ucagaBin();
		yolcu2.yolcuBilgileriniGetir();
		
		System.out.println("***** Ekonomi Yolcu *****");
		yolcu4.biletAl(EFirmaAdi.PEGASUS);
		yolcu4.biletAl(EFirmaAdi.THY);
		yolcu4.biletAl(EFirmaAdi.ONURJET);
		yolcu4.biletAl(EFirmaAdi.ADJ);
		System.out.println("---");
		yolcu4.ucagaBin();
		yolcu4.ucagaBin();
		yolcu4.checkInYap();
		yolcu4.checkInYap();
		yolcu4.ucagaBin();
		yolcu4.yolcuBilgileriniGetir();
	}
}