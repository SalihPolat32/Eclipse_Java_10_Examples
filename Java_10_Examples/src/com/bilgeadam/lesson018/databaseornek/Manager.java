package com.bilgeadam.lesson018.databaseornek;

import java.util.Scanner;

public class Manager {

	Database database;
	
	public Manager(Database database) {
		super();
		this.database = database;
	}
	
	public void menu() {

		System.out.println("1) Veri Ekle");
		System.out.println("2) Veri Sil");
		System.out.println("3) Veri Güncelle");
		System.out.println("4) Verileri Getir");
		System.out.println("0) Çıkış");
	}

	public void calistir() {
		
		Scanner scanner = new Scanner(System.in);

		int secim = 0;

		do {
			database.login();
			menu();
			System.out.println("Lütfen Bir İşlem Seçimi Yapınız:");
			secim = scanner.nextInt();

			switch (secim) {
			case 1:
				database.veriEkle();
				break;
			case 2:
				database.veriSil();
				break;
			case 3:
				database.veriGuncelle();
				break;
			case 4:
				database.verileriGetir();
				break;
			case 0:
				System.out.println("Çıkış Yapılıyor...");
				break;

			default:
				System.out.println("Lütfen Geçerli Bir İşlem Seçiniz.");
				break;
			}

		} while (secim != 0);
	}

}
