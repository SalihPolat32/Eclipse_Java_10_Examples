package com.bilgeadam.lesson018.odev;

public class MySql implements IDatabase {

	@Override
	public void veriEkleme() {
		System.out.println("MySql Sınıfı Veri Ekleme Metodu");
	}

	@Override
	public void veriSilme() {
		System.out.println("MySql Sınıfı Veri Silme Metodu");
	}

	@Override
	public void veriGuncelleme() {
		System.out.println("MySql Sınıfı Veri Güncelleme Metodu");
	}
	
	@Override
	public void login() {
		System.out.println("MySql Sınıfı login Metodu");
	}
}