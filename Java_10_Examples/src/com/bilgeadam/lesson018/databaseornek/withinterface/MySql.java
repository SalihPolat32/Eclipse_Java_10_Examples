package com.bilgeadam.lesson018.databaseornek.withinterface;

public class MySql implements IDatabase {
	
	@Override
	public void veriEkle() {
		System.out.println("MySql Veri Tabanına Veri Eklendi");
	}

	@Override
	public void veriSil() {
		System.out.println("MySql Veri Tabanında Veri Silindi");
	}

	@Override
	public void veriGuncelle() {
		System.out.println("MySql Veri Tabanında Veri Güncellendi");
	}
	
	@Override
	public void verileriGetir() {
		System.out.println("MySql Veri Tabanından Veri Getiriliyor");
	}
	
	@Override
	public void login() {
		System.out.println("MySql Veri Tabanına Bağlanıldı");
	}
}