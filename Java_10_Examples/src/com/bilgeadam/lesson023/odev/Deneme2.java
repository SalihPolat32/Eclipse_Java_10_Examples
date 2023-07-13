package com.bilgeadam.lesson023.odev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;

import com.bilgeadam.lesson023.trycatch.EksiDegerException;

/*
 * 1- İsminde a geçen öğrencileri getirelim
 * 
 * 2- Her bir öğrencinin not ortalamasını hesaplayıp double bir listede toplayalım 
 * 
 * 3- Bütün öğrencilerin not ortalamasını hesaplayalım 
 * 
 * 4- Bölüme göre Maple metoduyla beraber öğrencileri bölümlere gore mapleyelim 
 * 
 * 5- Ortalaması 50'den büyük olanların durumu geçti küçüklerin durumu kaldı olarak güncellensin 
 * 
 * 6- Her öğrenciye 4'üncü notuda ekleyelim
 * 
 * 7- Her öğrencinin her bir notuna 15 puan daha ekleyelim 
 * 
 * 8- Her öğrenci id'sine karşılık ismi gelecek şekilde mapleyelim
 */
public class Deneme2 {

	static List<Student> students = new ArrayList<>();
	static List<Double> notOrtalamaları = new ArrayList<>();

	static Deneme2 deneme2 = new Deneme2();

	static Student student = new Student();

	public static void main(String[] args) {

		System.out.println("==============================================");

		ismindeAOlanOgrenciler();

		System.out.println("==============================================");

		students.stream().forEach(x -> System.out.println(x.getName() + "'in Not Ortalaması: " + x.ortHesapla()));

		System.out.println("==============================================");

		OptionalDouble sinifOrtalamasi = students.stream().mapToDouble(x -> x.ortHesapla()).average();
		System.out.println("Sınıf Ortalaması: " + sinifOrtalamasi);

		System.out.println("==============================================");

		bolumeGoreMaple();

		System.out.println("==============================================");

		gectiKaldi();

		System.out.println("==============================================");

		dorduncuNot();

		System.out.println("==============================================");

		notaOnBesEkle();

		System.out.println("==============================================");

		idOgreciMap();

		System.out.println("==============================================");
	}

	private static void idOgreciMap() {

		Map<Integer, String> ogrenciID = students.stream().collect(Collectors.toMap(x -> x.getId(), x -> x.getName()));
		System.out.println(ogrenciID);
	}

	private static void notaOnBesEkle() {

		students.stream().forEach(x -> x.setNotlar(x.getNotlar().stream().map(a -> a + 15).toList()));
		System.out.println(students);
	}

	private static void dorduncuNot() {

		Random random = new Random();
		double dorduncuNot = random.nextDouble(0.0, 100.0);

		students.stream().forEach(x -> x.notlar.add(dorduncuNot));
		students.stream().forEach(x -> System.out.println(x.getName() + " ==> " + x.getNotlar()));
	}

	private static void gectiKaldi() {

		students.stream().map(x -> (x.ortHesapla() < 50) ? "Kaldı" : "Geçti")
				.forEach(x -> System.out.println(students.stream().map(y -> y.getName()) + " - " + x));
	}

	private static void bolumeGoreMaple() {

		Map<String, List<Student>> bolumeGoreOgrenciler = students.stream()
				.collect(Collectors.groupingBy(x -> x.bolum));
		System.out.println(bolumeGoreOgrenciler);
	}

	private static void ismindeAOlanOgrenciler() {

		deneme2.students.stream().filter(x -> x.getName().startsWith("A"))
				.forEach(x -> System.out.println(x.getName()));
	}

	public Deneme2() {

		Student student = new Student();

		student.name = "Ali";
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.bolum = "tm";
		student.id = 1;

		Student student2 = new Student();

		student2.name = "Ayşe";
		student2.notlar.add(80.0);
		student2.notlar.add(55.5);
		student2.notlar.add(79.4);
		student2.bolum = "mat";
		student2.id = 2;

		Student student3 = new Student();

		student3.name = "Hakan";
		student3.notlar.add(86.0);
		student3.notlar.add(97.5);
		student3.notlar.add(50.4);
		student3.bolum = "mat";
		student3.id = 3;

		Student student4 = new Student();

		student4.name = "Mert";
		student4.notlar.add(10.0);
		student4.notlar.add(35.5);
		student4.notlar.add(58.4);
		student4.bolum = "tm";
		student4.id = 4;

		Student student5 = new Student();

		student5.name = "Gamze";
		student5.notlar.add(68.0);
		student5.notlar.add(23.5);
		student5.notlar.add(90.4);
		student5.bolum = "mat";
		student5.id = 5;

		Student student6 = new Student();

		student6.name = "Merve";
		student6.notlar.add(36.0);
		student6.notlar.add(23.5);
		student6.notlar.add(58.4);
		student6.bolum = "tm";
		student6.id = 6;

		students.add(student);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
	}
}