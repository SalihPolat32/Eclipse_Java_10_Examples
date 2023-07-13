package com.bilgeadam.lesson001;

import java.util.List;

import javax.swing.ListCellRenderer;

public class Question1 {
	
	public static void main(String[] args) {
		
		//Primitive (İlkel) Veri Tipleri
		/*
		 * değişken isimlerini adlandırmada camel case kullanılır.
		 * 
		 * İlk harf küçük daha sonra gelen yeni kelimenin  ilk harfi büyük başlar
		 * 
		 */
		
		int sayi=50;
		byte myByte=25;
		short myShort=5222;
		long myLong=1_000_000_000;
		double myDouble=125000000000000000000.52;
		char myChar='A'; // ctrl+alt+aşağı yön tuşu bu satırı aşağıya kopyalar.
		char myChar2=66; // ctrl+z geri alma tuşu
		boolean myBlooean=true; // true yada false değeri alır
		float myFloat=128.65f; // float olduğunu görmesi için sonuna f konulması gereliyor
		
		System.out.println("int deger ==> "+sayi);
		System.out.println("byte degeri ==> "+myByte);
		System.out.println("short deger ==> "+myShort);
		System.out.println("long değer ==> "+myLong);
		System.out.println("double deger ==> "+myDouble);
		System.out.println("char deger ==> "+myChar);
		System.out.println("char2 deger ==> "+myChar2);
		System.out.println("boolean deger ==> "+myBlooean);
		System.out.println("folat deger ==> "+myFloat);
		System.out.println("int degerin char karsıllıgı ==> "+(char) sayi);
		System.out.println("iki char degerin toplanması ==> "+(myChar+myChar2));
		
		//Wrapper class (Sarmalayıcı Sınıfları)
		
		Integer myInteger=539;
		Integer myInteger2= null;
		int myInt= 0;
		
		System.out.println("INTEGER2 ==> "+myInteger2);
		
		myInteger2=myInt;
		
		System.out.println("INTEGER ==> "+myInteger);
		System.out.println("INTEGER2 ==> "+myInteger2);
		System.out.println("int ==> "+myInt);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.toString(myInt)); // Integer değerini stringe çevirir.
		
		System.out.println("Double Max ==> "+Double.MAX_VALUE+" min ==> "+Double.MIN_VALUE);
		System.out.println("Long Max ==> "+Long.MAX_VALUE+" min ==> "+Long.MIN_VALUE);
		System.out.println("Short Max ==> "+Short.MAX_VALUE+" min ==> "+Short.MIN_VALUE);
		System.out.println("Byte Max ==> "+Byte.MAX_VALUE+" min ==> "+Byte.MIN_VALUE);
		System.out.println("Float Max ==> "+Float.MAX_VALUE+" min ==> "+Float.MIN_VALUE);
		System.out.println("Integer Max ==> "+Integer.MAX_VALUE+" min ==> "+Integer.MIN_VALUE);
		System.out.println("//////////////////////////////");
		
		long number1=32767;
		long number2=100;
		byte number3= (byte) number2;
		byte number4= (byte) number1;
		System.out.println(number3);
		System.out.println(number4);
		
		long result=number1+number3;
		System.out.println(result);
		
		short number5=(short) (number1+number3);
		short number6=(short) (number2+number3);
		short number7=(short) number2;
		long number8= number7;
		
		System.out.println(number5);
		System.out.println(number6);
		System.out.println(number7);
		System.out.println(number8);
		
		double number9=25.8;
		
		long result2=(long) (number9+number2);
		// Long her zaman alt basamağa yuvarlar.
		
		double result3= number9+number2;
		System.out.println(result2);
		System.out.println(result3);
		
		int number10=125/10;
		System.out.println(number10);
		
		float number11=(float) (number9+10);
		double number12=number11+10;
		System.out.println(number11);
		System.out.println(number12);
		
		String isim="Mustafa";
		System.out.println(isim+number10);
		String a=isim+number10; 
		System.out.println(a);
		String deger1=Integer.toString(number10);
		System.out.println(deger1.length());
		String deger2=number10+"";
		String deger3=""+number10;
		System.out.println(deger2);
		System.out.println(deger3);
				
	}

}
