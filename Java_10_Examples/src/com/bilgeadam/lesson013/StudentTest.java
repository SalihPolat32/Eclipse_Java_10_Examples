package com.bilgeadam.lesson013;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.ogrenciadi = "Salih Polat";
		student1.ogrenciSoyadi = "DÖNMEZ";

		student1.kayitOl();

		Student student2 = new Student();
		student2.ogrenciadi = "Mustafa";
		student2.ogrenciSoyadi = "ÖZTÜRK";

		student2.kayitOl();

		Student student3 = new Student();
		student3.ogrenciadi = "Ali";
		student3.ogrenciSoyadi = "Veli";

		student3.kayitOl();
		
		Student student4 = new Student();
		student4.ogrenciadi = "Hilal";
		student4.ogrenciSoyadi = "Elif";
		
		student4.kayitOl();

		System.out.println(student1.ogrenciNo);
		System.out.println(student2.ogrenciNo);
		System.out.println(student3.ogrenciNo);
		
		System.out.println("Toplam Kayıtlı Öğrenci Sayısı: " + Student.index);
	}
}