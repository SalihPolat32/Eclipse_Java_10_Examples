package com.bilgeadam.lesson018.odev;

import java.util.Scanner;

public class Manager {

	Scanner scanner = new Scanner(System.in);
	
	public IDatabase secim() {

		System.out.println("1) MySql Database");
		System.out.println("2) Oracle Database");

		System.out.println("Lütfen Database Seçiniz:");
		IDatabase database = null;
		String secim = scanner.nextLine();

		switch (secim) {
		case "1":
			database = new MySql();
			break;
		case "2":
			database = new Oracle();
			break;

		default:
			System.out.println("Lütfen Geçerli Bir İşlem Seçiniz.");
			break;
		}
		return database;
	}

	public void menu() {

		System.out.println("1) Veri Ekle");
		System.out.println("2) Veri Sil");
		System.out.println("3) Veri Güncelle");
		System.out.println("0) Çıkış");
	}

	public void calistir() {

		String secim;

		IDatabase database = secim();

		do {
			menu();
			System.out.println("Lütfen Bir İşlem Seçimi Yapınız:");
			secim = scanner.nextLine();

			switch (secim) {
			case "1":
				database.veriEkleme();
				break;
			case "2":
				database.veriSilme();
				break;
			case "3":
				database.veriGuncelleme();
				break;
			case "0":
				System.out.println("Çıkış Yapılıyor...");
				break;

			default:
				System.out.println("Lütfen Geçerli Bir İşlem Seçiniz.");
				break;
			}

		} while (secim.equals("0"));
	}

}
