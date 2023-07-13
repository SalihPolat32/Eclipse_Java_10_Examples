package com.bilgeadam.lesson018.databaseornek;

public class Oracle extends Database {

	@Override
	public void veriEkle() {
		System.out.println("Oracle Veri Tabanına Veri Eklendi");
	}

	@Override
	public void veriSil() {
		System.out.println("Oracle Veri Tabanında Veri Silindi");
	}

	@Override
	public void veriGuncelle() {
		System.out.println("Oracle Veri Tabanında Veri Güncellendi");
	}
	
	@Override
	public void verileriGetir() {
		System.out.println("Oracle Veri Tabanından Veri Getiriliyor");
	}
	
	@Override
	public void login() {
		System.out.println("Oracle Veri Tabanına Bağlanıldı");
	}
}