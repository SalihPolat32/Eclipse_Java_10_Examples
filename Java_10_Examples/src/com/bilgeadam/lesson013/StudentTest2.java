package com.bilgeadam.lesson013;

public class StudentTest2 {
	
	public static void main(String[] args) {
		
		Student student1 = Student.kayitOl2();
		
		Student student2 = new Student();
		student2 = Student.kayitOl2();
		
		Student student3 = Student.kayitOl2();
		
		System.out.println("Kayıtlı Öğrenci Sayısı: " + Student.index);
		System.out.println(student1.ogrenciNo);
		System.out.println(student2.ogrenciNo);
	}
}