package com.bilgeadam.lesson010;

import java.util.Iterator;

/*
 * Çarpım tablosunu bir çift boyutlu array içine toplayacağız.
 * 1 ile 10 (10 dahil) arasındaki sayılar için geçerli 
 * 1X1 = 1
 * 1x2 = 2
 * ...
 * 1x10 = 10
 */

public class Question50 {

	public static void main(String[] args) {
		
//		String[][] array = carpımTablosuOlustur();
//		carpimTablosuYazdir(array);
		
		
	    carpimTablosuYazdir(carpımTablosuOlustur());
		
	}
	
	public static String[][] carpımTablosuOlustur() {
		
		String carpımTablosu[][] = new String[10][10];
		
		for (int i = 0; i < carpımTablosu.length; i++) {
			for (int j = 0; j < carpımTablosu[i].length; j++) {
//				Integer sonuc = i*j;
//				carpımTablosu[i][j] = sonuc.toString();
//				System.out.println(i + " x " + j + " = " + sonuc);
				carpımTablosu[i][j] = (i + 1) + " x " + (j + 1) + " = " + ((i + 1) * (j + 1));
			}
			System.out.println();
		}
		return carpımTablosu;
	}
	
	public static void carpimTablosuYazdir(String[][] dizi) {
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				
				System.out.println(dizi[i][j]);
			}
		}
	}
}