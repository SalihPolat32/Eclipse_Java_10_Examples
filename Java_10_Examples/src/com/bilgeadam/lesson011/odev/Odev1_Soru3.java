package com.bilgeadam.lesson011.odev;

import java.util.Scanner;

public class Odev1_Soru3 {

	public static void main(String[] args) {
		
		System.out.println("===Hesap makinesi===\n"); 
		System.out.println("1) Toplama İşlemi");
		System.out.println("2) Çıkarma İşlemi"); 
		System.out.println("3) Çarpma İşlemi");
		System.out.println("4) Bölme İşlemi"); 
		System.out.println("0) Çıkış");
		
		Scanner scanner = new Scanner(System.in);
		int sayi = 0;

		do {
			System.out.println("Lütfen Yapmak İstediğiniz İşlem Numarasını Giriniz:");
			sayi = Integer.parseInt(scanner.nextLine());

			switch (sayi) {
			case 1:
				topla();
				break;
			case 2:
				cıkar();
				break;
			case 3:
				carp();
				break;
			case 4:
				bol();
				break;
			case 0:
				System.out.println("Çıkış Yapılıyor...");
				break;

			default:
				if (sayi > 4 && sayi < 0) {
					System.out.println("Lütfen Menüdeki İşlemlerden Birini Seçiniz.");
				}
				break;
			}
		} while (sayi != 0);

	}
	
	private static void topla() {
		Scanner scanner = new Scanner(System.in);
		String sayi;
		int sonuc = 0;
		int i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            sayi = scanner.next();
            if (!sayi.equals("=")) {
            	sonuc = sonuc + Integer.parseInt(sayi);
            } else if (sayi.equals("=")) {
            	break;
			} 
        }
        System.out.println("Sonuç : " + sonuc);
	}
	
	private static void cıkar() {
		Scanner scanner = new Scanner(System.in);
		String sayi;
		int sonuc = 0;
		int i = 1;
		int sayac = 0;
		while (true) {
            System.out.print(i++ + ". sayı :");
            sayi = scanner.next();
            sayac++;

            if (!sayi.equals("=")) {
            	if (sayac == 1) {
            		sonuc = Integer.parseInt(sayi);
				} else {
					sonuc = sonuc - Integer.parseInt(sayi);
				}	
            } else if (sayi.equals("=")) {
            	break;
			} 
        }
        System.out.println("Sonuç : " + sonuc);
	}
	
	private static void carp() {
		Scanner scanner = new Scanner(System.in);
		String sayi = "";
		int sonuc = 1;
		int i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            sayi = scanner.next();
            if (sayi == "0") {
                sonuc = 0;
                break;
            } else if (sayi.equals("=")) {
            	break;
			} 
            sonuc = sonuc * Integer.parseInt(sayi);       
	}
        System.out.println("Sonuç : " + sonuc);
	}
	
	private static void bol() {
		Scanner scanner = new Scanner(System.in);
		String sayi = "";
		double sonuc = 1;
		int i = 1;
		int sayac = 0;

        while (true) {
            System.out.print(i++ + ". sayı :");
            sayi = scanner.nextLine();
            if (i != 1 && sayi == "0") {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            } else if (!sayi.equals("=")) {
            	sayac++;
            	if (sayac == 1) {
            		sonuc = Double.parseDouble(sayi);
				} else {
					sonuc = sonuc / Double.parseDouble(sayi);
				}	
            } else if (sayi.equals("=")) {
            	break;
			}
        }
        System.out.println("Sonuç : " + sonuc);
	}
}