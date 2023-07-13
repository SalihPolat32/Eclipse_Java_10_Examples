package com.bilgeadam.lesson032.factory;

import java.util.Scanner;

/*
 * Kullanıcıdan aldığım database ismine göre loglama yapacağım.
 */
public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir Database İsmi Giriniz:");
		String dbName = scanner.nextLine().toLowerCase();
		ILogger logger = DatabaseFactory.createDatabase(dbName);

//		switch (dbName) {
//		case "postgre":
//			logger = new PostgreSql();
//			break;
//			
//		case "mongo":
//			logger = new MongoDb();
//			break;
//			
//		default:
//			System.out.println("Yanlış Bir Database İsmi Girdiniz.");
//			break;
//		}
		
		logger.logTodatabase("Log Mesajı");
	}
}