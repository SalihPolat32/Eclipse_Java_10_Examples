package com.bilgeadam.lesson023;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * Dışarıdan String bir doğum günü tarihi alalım
 * daha sonra günümüz ile kıyaslayalım kaç gün kaç yıl yaşamışız onu bulalım
 */
public class DogumGunuOrnek {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		DateTimeFormatter formatimiz = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Doğum Tarihinizi Bu şekilde Giriniz -> (gg/aa/yyyy):");
        String giris = scanner.nextLine();
        
//        String gun2 = "2010-05-18";
//        LocalDate date2 = LocalDate.parse(gun2);
        
        LocalDate dogumTarihi = LocalDate.parse(giris, formatimiz);
        LocalDate localDateNow = LocalDate.now();
        
        long yil = dogumTarihi.until(localDateNow, ChronoUnit.YEARS);
		System.out.println("Yaşı: " + yil);
		
		long ay = dogumTarihi.until(localDateNow, ChronoUnit.MONTHS);
		System.out.println("Yaşanılan Ay Sayısı: " + ay);
		
		long gun = dogumTarihi.until(localDateNow, ChronoUnit.DAYS);
		System.out.println("Yaşanılan Gün Sayısı: " + gun);
		
		long hafta = dogumTarihi.until(localDateNow, ChronoUnit.WEEKS);
		System.out.println("Yaşanılan Hafta Sayısı: " + hafta);
		
		LocalDate date = LocalDate.of(1996, 05, 16);
		System.out.println(date.plusDays(10000));
	}
}