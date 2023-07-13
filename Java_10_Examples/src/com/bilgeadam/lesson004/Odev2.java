package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * 1. Soru) Dışarıdan dogum gununuzun ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre
 *
 * burc hesabı yapan program
 *
 * Koç Burcu : 21 Mart - 20 Nisan
 *
 * Boğa Burcu : 21 Nisan - 21 Mayıs
 *
 * İkizler Burcu : 22 Mayıs - 22 Haziran
 *
 * Yengeç Burcu : 23 Haziran - 22 Temmuz
 *
 * Aslan Burcu : 23 Temmuz - 22 Ağustos
 *
 * Başak Burcu : 23 Ağustos - 22 Eylül
 *
 * Terazi Burcu : 23 Eylül - 22 Ekim
 *
 * Akrep Burcu : 23 Ekim - 21 Kasım
 *
 * Yay Burcu : 22 Kasım - 21 Aralık
 *
 * Oğlak Burcu : 22 Aralık - 21 Ocak
 *
 * Kova Burcu : 22 Ocak - 19 Şubat
 *
 * Balık Burcu : 20 Şubat - 20 Mart
 *
 * swicth case if else
 */

// 2. Soru) Girilen sayının 5 in kuvveti olup olmadığını bulan kod

public class Odev2 {

	public static void main(String[] args) {
		
		System.out.println("1. Soru:");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Doğum Gününüzü Giriniz:");
		int gun = scanner.nextInt();
		System.out.println("Lütfen Doğum Ayınızı Giriniz:");
		int ay = scanner.nextInt();
		
		switch (ay) {
		case 1:
			if (gun > 31 || gun < 1) {
				System.out.println("Ocak Ayı Günleri 1-31 Arasıdır. Lütfen Bu Aralıkta Bir Rakam Giriniz.");
			} else if (gun <= 21) {
				System.out.println("Burcunuz: Oğlak Burcudur.");
			}
				else {
				System.out.println("Burcunuz: Kova Burcudur.");
			}
			break;
		case 2:
			if (gun > 29 || gun < 1) {
				System.out.println("Ocak Ayı Günleri 1-29 Arasıdır. Lütfen Bu Aralıkta Bir Rakam Giriniz.");
				
			} else if (gun <= 19) {
				System.out.println("Burcunuz: Kova Burcudur.");
			} else {
				System.out.println("Burcunuz: Balık Burcudur.");
			}
			break;
		case 3:
			if (gun > 31 || gun < 1) {
				System.out.println("Mart Ayı Günleri 1-31 Arasıdır. Lütfen Bu Aralıkta Bir Rakam Giriniz.");
			} else if (gun <= 20) {
				System.out.println("Burcunuz: Balık Burcudur.");				
			} else {
				System.out.println("Burcunuz: Koç Burcudur.");
			}
			break;
		case 4:
			if (gun > 30 || gun < 1) {
				System.out.println("Nisan Ayı Günleri 1-30 Arasıdır. Lütfen Bu Aralıkta Bir Rakam Giriniz.");
			} else if (gun <= 20) {	
			    System.out.println("Burcunuz: Koç Burcudur.");
			} else {
				System.out.println("Burcunuz: Boğa Burcudur.");
			}
			break;
		case 5:
			if (gun > 31 || gun < 1) {
				System.out.println("Mayıs Ayı Günleri 1-31 Arasıdır. Lütfen Bu Aralıkta Bir Rakam Giriniz.");
			} else if (gun <= 21) {
				System.out.println("Burcunuz: Boğa Burcudur.");
			} else {
				System.out.println("Burcunuz: İkizler Burcudur.");
			}
			break;
		case 6:
			if (gun > 30 || gun < 1) {
				System.out.println("Haziran Ayı Günleri 1-30 Arasıdır. Lütfen Bu Aralıkta Bir Rakam Giriniz.");
			} else if (gun <= 22) {
				System.out.println("Burcunuz: İkizler Burcudur.");
			} else {
				System.out.println("Burcunuz: Yengeç Burcudur.");
			}
			break;
		case 7:
			if (gun > 31 || gun < 1) {
				System.out.println("Temmuz Ayı Günleri 1-31 Arasıdır. Lütfen Bu Aralıkta Bir Rakam Giriniz.");
			} else if (gun <= 22) {
				System.out.println("Burcunuz: Yengeç Burcudur.");
			} else {
				System.out.println("Burcunuz: Aslan Burcudur.");
			}
			break;
		case 8:
			if (gun > 31 || gun < 1) {
				System.out.println("Ağustos Ayı Günleri 1-31 Arasıdır. Lütfen Bu Aralıkta Bir Rakam Giriniz.");
			} else if (gun <= 22) {
				System.out.println("Burcunuz: Aslan Burcudur.");
			} else {
				System.out.println("Burcunuz: Başak Burcudur.");
			}
			break;
		case 9:
			if (gun > 30 || gun < 1) {
				System.out.println("Eylül Ayı Günleri 1-30 Arasıdır. Lütfen Bu Aralıkta Bir Rakam Giriniz.");
			} else if (gun <= 22) {
				System.out.println("Burcunuz: Başak Burcudur.");
			} else {
				System.out.println("Burcunuz: Terazi Burcudur.");
			}
			break;
		case 10:
			if (gun > 31 || gun < 1) {
				System.out.println("Ekim Ayı Günleri 1-31 Arasıdır. Lütfen Bu Aralıkta Bir Rakam Giriniz.");
		    } else if (gun <= 22) {
				System.out.println("Burcunuz: Terazi Burcudur.");
			} else {
				System.out.println("Burcunuz: Akrep Burcudur.");
			}
			break;
		case 11:
			if (gun > 30 || gun < 1) {
				System.out.println("Kasım Ayı Günleri 1-30 Arasıdır. Lütfen Bu Aralıkta Bir Rakam Giriniz.");
			} else if (gun <= 21) {
				System.out.println("Burcunuz: Akrep Burcudur.");
			} else {
				System.out.println("Burcunuz: Yay Burcudur.");
			}
			break;
		case 12:
			if (gun > 31 || gun < 1) {
				System.out.println("Kasım Ayı Günleri 1-30 Arasıdır. Lütfen Bu Aralıkta Bir Rakam Giriniz.");
			} else if (gun <= 21) {
				System.out.println("Burcunuz: Yay Burcudur.");
			} else {
				System.out.println("Burcunuz: Oğlak Burcudur.");
			}
			break;
		default:
			System.out.println("Lütfen Doğum Ayınızı Kontrol Ediniz.");
			break;
		}
		if (gun > 31 || gun < 1) {
			System.out.println("Lütfen Doğum Gününüzü Kontrol Ediniz.");
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println("2. Soru:");	
		System.out.println("Lütfen Bir Sayi Giriniz:");
		int sayi = scanner.nextInt();
		if (sayi % 5 == 0) {
			while (sayi % 5 == 0) {
				sayi = sayi/5;
			}	
		} 
		if (sayi == 1){
		System.out.println("Girilen Sayı 5'in Kuvvetidir.");
		} else {
		System.out.println("Girilen Sayı 5'in Kuvveti Değildir.");
		}				
	}
}
