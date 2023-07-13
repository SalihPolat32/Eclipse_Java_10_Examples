package com.bilgeadam.lesson018.odev;

public class Oracle implements IDatabase {

	@Override
	public void veriEkleme() {
		System.out.println("Oracle Sınıfı Veri Ekleme Metodu");
	}

	@Override
	public void veriSilme() {
		System.out.println("Oracle Sınıfı Veri Silme Metodu");
	}

	@Override
	public void veriGuncelleme() {
		System.out.println("Oracle Sınıfı Veri Güncelleme Metodu");
	}
	
	@Override
	public void login() {
		System.out.println("Oracle Sınıfı login Metodu");
	}
}
