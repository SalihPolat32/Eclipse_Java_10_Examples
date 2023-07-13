package com.bilgeadam.lesson018.databaseornek;

public abstract class Database {
	
	// Sadece metot olduğunda interface
	// Özellik + metot kullanacaksak abstract class kullanılır
	
	String username;
	String password;
	

	public abstract void veriEkle();
	
	public abstract void veriSil();
	
	public abstract void veriGuncelle();
	
	public abstract void verileriGetir();
	
	public abstract void login();
}