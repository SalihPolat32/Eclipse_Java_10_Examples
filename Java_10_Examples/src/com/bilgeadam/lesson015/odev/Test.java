package com.bilgeadam.lesson015.odev;

public class Test {
	
	public static void main(String[] args) {
		
		Ram ram = new Ram();
		Islemci islemci = new Islemci();
		AnaKart anaKart = new AnaKart();
		Mouse mouse = new Mouse();
		Klavye klavye = new Klavye();
		
		Dizustu dizustu = new Dizustu();
//		dizustu.setAnaKart(anaKart);
//		dizustu.setIslemci(islemci);
//		dizustu.setKlavye(klavye);
//		dizustu.setRam(ram);
//		dizustu.setMouse(mouse);
		
		DahiliDonanim[] dahiliDonanimlar = { ram, islemci };
		HariciDonanim[] hariciDonanimlar = { klavye, mouse };
		anaKart.setDahiliDonanimlar(dahiliDonanimlar);
		
		dizustu.setAd("my pc)");
		dizustu.setAnaKart(anaKart);
		dizustu.setHariciDonanimlar(hariciDonanimlar);
		
		System.out.println(dizustu);
		System.out.println(dizustu.getAnaKart().getDahiliDonanimlar()[0]); // Ram
		System.out.println(dizustu.getAnaKart().getDahiliDonanimlar()[1]); // İşlemci
		
	}
}