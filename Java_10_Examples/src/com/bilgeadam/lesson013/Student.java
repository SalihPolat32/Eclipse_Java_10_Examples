package com.bilgeadam.lesson013;
/*
 * Öğrencinin bir ismi ve bir numarası olsun
 * daha sonra kayıt metotdu yazalım
 * Mustafa adlı öğrenci başarı ile kayıt oldu 1
 * Serkan adlı öğrenci başarı ile kayıt oldu 2
 */

import java.util.Scanner;

public class Student {

	String ogrenciadi;
	String ogrenciSoyadi;
	static int index;
	int ogrenciNo;

	public void kayitOl() {

		index++;
		ogrenciNo = index;
		System.out.println("============================");
		System.out.println(ogrenciadi + " " + ogrenciSoyadi + " isimli öğrenci başarı ile kayıt edildi.");
		System.out.println("Öğrenci Numarası: " + ogrenciNo);
		System.out.println("============================");
	}

	public static Student kayitOl2() { // Static metot içinde static olmayan değişken kullanılamaz. Obj oluşturmak geremektedir.

		index++;

		Student student = new Student();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen Öğrenci Adını Giriniz: ");
		student.ogrenciadi = scanner.nextLine();
		
		System.out.println("Lütfen Öğrenci Soyadını Giriniz: ");
		student.ogrenciSoyadi = scanner.nextLine();
		
		student.ogrenciNo = index;
		
		System.out.println("============================");
		System.out.println(student.ogrenciadi + " " + student.ogrenciSoyadi + " isimli öğrenci başarı ile kayıt edildi.");
		System.out.println("Öğrenci Numarası: " + student.ogrenciNo);
		System.out.println("============================");
		
		return student;
	}
}