package com.bilgeadam.lesson018.databaseornek;
/*
 * 1 database sec metodu yapalım
 * Bu metot bize 2 seçenek sunsun bunlardan birini seçip
 * Daha sonra sınıfındaki çalıştır metodunu çalıştıralım.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		databaseSec();

		Database database = databaseSec2();
		Manager manager = new Manager(database);
		manager.calistir();

	}

	private static void databaseSec() {

		Manager manager;

		Scanner scanner = new Scanner(System.in);

		System.out.println("1) MySql Database");
		System.out.println("2) Oracle Database");
		System.out.println("3) PostgreSql Database");

		System.out.println("Lütfen Database Seçiniz:");

		int secim = scanner.nextInt();

		Database database = null;

		switch (secim) {
		case 1:
			database = new MySql();
			break;
		case 2:
			database = new Oracle();
			break;
		case 3:
			database = new PostgreSql();
			break;

		default:
			System.out.println("Lütfen Geçerli Bir İşlem Seçiniz.");
			break;
		}
		manager = new Manager(database);
		manager.calistir();
	}

	private static Database databaseSec2() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1) MySql Database");
		System.out.println("2) Oracle Database");

		System.out.println("Lütfen Database Seçiniz:");

		int secim = scanner.nextInt();

		Database database = null;

		switch (secim) {
		case 1:
			database = new MySql();
			break;
		case 2:
			database = new Oracle();
			break;

		default:
			System.out.println("Lütfen Geçerli Bir İşlem Seçiniz.");
			break;
		}
		return database;
	}
}