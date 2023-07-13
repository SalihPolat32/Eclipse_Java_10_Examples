package com.bilgeadam.lesson018.odev;
/*
 * 2 tane sınıfmız olacak database sınıflarımız MySql Oracle
 * 
 * Database'e veri ekleme veri silme veri güncelleme verileri getir metotlarımız olacak
 * bir tane login metodumuz olsun
 * Bir tane Manager sınıfımız olsun
 * Bu manager sınıfında bir menü yapalım
 * 
 * System.out.println("1-Veri ekle");
 * System.out.println("2-Veri sil");
 * System.out.println("3-Veri guncelle");
 * System.out.println("4-Verileri getir");
 * System.out.println("0-Çıkış");
 *
 * Manager sınıfında çalıştır metoduyla beraber console menumuz gelsin ve biz çıkış yapana kadar buradaki metotları çalıştıralım
 * 1 veri ekle metodu çalıştığında beklediğimiz çıktı ---> MySQL Veri Tabanına Veri Eklendi veya Oracle Veri Tabanına Veri Eklendi
 */

public class Odev {
	
	public static void main(String[] args) {
		
		Manager manager = new Manager();
		
		manager.calistir();
	}
}