package com.bilgeadam.lesson001;
/*
 * İki tane string değikenimiz olsun isim ve soyisim bu değişkenlerdde.
 * yaş değişkeni de bu değişken içinde olsun.
 * 
 * Mustafa ÖZTÜRK - 35
 * 
 * Yazdır.
 */

public class Question2 {

	public static void main(String[] args) {
		
		String isim= "Mustafa";
		String soyisim= "ÖZTÜRK";
		int yaş= 35;
		
		System.out.println(isim+" "+soyisim+" - "+yaş);
		
		String sonuc=isim+"\n"+soyisim+"\n"+yaş;
		// \n alt satıra geçer.
		System.out.println(sonuc);
		
		String sonuc2=isim+"\t\t\t"+soyisim+"\t"+yaş;
		// \t boşluk (tab) bırakır.
		System.out.println(sonuc2);
	
	}

}
