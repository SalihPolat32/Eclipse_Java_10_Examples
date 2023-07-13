package com.bilgeadam.lesson025.maraton2cozum.ucakapp;

public class Test {

	public static void main(String[] args) {

		Yolcu yolcu = new BusinessYolcu(1, "Mustafa", "ÖZTÜRK", false);
		Yolcu yolcu2 = new EkonomikYolcu(2, "Burhan", "ÜNLÜ");
		Yolcu yolcu3 = new BusinessYolcu(3, "Damla", "GÜREL", true);

		System.out.println("Business Vip Yolcu");

		yolcu3.biletAl(EFirma.ADJ);
		yolcu3.biletAl(EFirma.THY);
		
		System.out.println("*****");
		
		yolcu3.ucagaBin();
		yolcu3.ucagaBin();
		yolcu3.checkInYap();
		yolcu3.checkInYap();
		yolcu3.ucagaBin();

		yolcu3.yolcuBilgileriniGetir();

		System.out.println("*****Ekonomi Yolcu*******");

		yolcu2.biletAl(EFirma.ADJ);
		yolcu2.biletAl(EFirma.THY);
		yolcu2.biletAl(EFirma.THY);
		yolcu2.biletAl(EFirma.THY);

		System.out.println("*****");

		yolcu2.ucagaBin();
		yolcu2.ucagaBin();
		yolcu2.checkInYap();
		yolcu2.checkInYap();
		yolcu2.ucagaBin();
		
		yolcu2.yolcuBilgileriniGetir();
	}
}