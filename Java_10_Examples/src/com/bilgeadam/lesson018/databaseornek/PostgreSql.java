package com.bilgeadam.lesson018.databaseornek;

public class PostgreSql extends Database {
	
	@Override
	public void veriEkle() {
		System.out.println("PostgreSql Veri Tabanına Veri Eklendi");
	}

	@Override
	public void veriSil() {
		System.out.println("PostgreSql Veri Tabanında Veri Silindi");
	}

	@Override
	public void veriGuncelle() {
		System.out.println("PostgreSql Veri Tabanında Veri Güncellendi");
	}
	
	@Override
	public void verileriGetir() {
		System.out.println("PostgreSql Veri Tabanından Veri Getiriliyor");
	}
	
	@Override
	public void login() {
		System.out.println("PostgreSql Veri Tabanına Bağlanıldı");
	}
}