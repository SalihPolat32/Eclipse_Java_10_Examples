package com.bilgeadam.lesson001;

import java.util.HashMap;

/*
 * Ürün fiyatında %18 kdv %15 kar payı var.
 * Ürünün fiyatı belli
 * ürünün ham fiyatı ve kdv'siz fiyatını bulalım.
 */

public class Question3 {

	public static void main(String[] args) {
		
		int ürün_fiyatı= 100;
		double kdvsiz_fiyat= ürün_fiyatı - (ürün_fiyatı * 0.18);
		double ham_fiyat= kdvsiz_fiyat - (kdvsiz_fiyat * 0.15);
		
		System.out.println("Ürün Fiyatı - "+ürün_fiyatı);
		System.out.println("Ürünün KDV'siz Fiyatı - "+kdvsiz_fiyat);
		System.out.println("Ürünün Ham Fİyatı - "+ham_fiyat);
				

	}

}
