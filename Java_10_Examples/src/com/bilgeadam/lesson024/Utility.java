package com.bilgeadam.lesson024;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class Utility {

	static Scanner scanner = new Scanner(System.in);
	
//	public static void main(String[] args) {
//		
//		intDegerAlma("Lütfen Bir Sayı Giriniz:");
//		
//		intDegerAlma("Lütfen Bir Seçim Yapınız:");
//		
//		stringTarihDegeriniTarihDegerineCevirme("Lütfen Bir Tarih Giriniz:", "02-05-2023");
//		
//		stringTarihDegeriAlma("Lütfen Bir Tarih Giriniz:");
//	}
	
	/*
	 * Doğru değer alana kadar bizden veri almaya devam eder
	 * int değer alana kadar
	 */
	
	public static int intDegerAlma(String sorgu) {
		
		boolean kontrol = false;
		int deger = 0;
		
		do {
			
			System.out.println(sorgu);
			
			try {
				
				deger = scanner.nextInt();
				
				kontrol = false;
				
			} catch (Exception e) {
				
				System.out.println(e.toString() + ": Lütfen Sayısal Bir Değer Giriniz!");
				kontrol = true;
				
			} finally {
				
				scanner.nextLine();
			}

		} while (kontrol);
		
		return deger;
	}
	
	public static double doubleDegerAlma(String sorgu) {
		
		boolean kontrol = false;
		double deger = 0D;
		
		do {
			
			System.out.println(sorgu);
			
			try {
				
				deger = Double.parseDouble(scanner.nextLine());
				
				kontrol = false;
				
			} catch (Exception e) {
				
				System.out.println(e.toString() + ": Lütfen Sayısal Bir Değer Giriniz!");
				kontrol = true;
				
			}
		} while (kontrol);
		
		return deger;
	}
	
	public static long longDegerAlma(String sorgu) {
		
		boolean kontrol = false;
		long deger = 0;
		
		do {
			
			System.out.println(sorgu);
			
			try {
				
				deger = Long.parseLong(scanner.nextLine());
				
				kontrol = false;
				
			} catch (Exception e) {
				
				System.out.println(e.toString() + ": Lütfen Sayısal Bir Değer Giriniz!");
				kontrol = true;
				
			}
		} while (kontrol);
		
		return deger;
	}
	
	public static String stringdDegerAlma(String sorgu) {
		
		System.out.println(sorgu);
		return scanner.nextLine();
	}
	
	public static LocalDate stringTarihDegeriAlma(String sorgu) {
		
		boolean kontrol = false;
		LocalDate date = null;
		
		do {
			
			try {
				
				System.out.println(sorgu);
				date = LocalDate.parse(scanner.nextLine());
				kontrol = false;
				
			} catch (Exception e) {

				System.out.println(e.toString() + ": Lütfen yıl-ay-gün Formatında Bir Tarih Giriniz!");
				kontrol = true;
				
			}

		} while (kontrol);
		return date;
	}
	
	public static Optional<LocalDate> stringTarihDegeriniTarihDegerineCevirme(String sorgu, String tarih) {
		
		boolean kontrol = false;
		LocalDate date = null;
			
			try {
				
				System.out.println(sorgu);
				date = LocalDate.parse(tarih);
				kontrol = false;
				
			} catch (Exception e) {

				System.out.println(e.toString() + ": Lütfen yıl-ay-gün Formatında Bir Tarih Giriniz!");
				kontrol = true;
				
			}
			
		return Optional.ofNullable(date);
	}
}