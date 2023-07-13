package com.bilgeadam.lesson032.singelton;
/*
 * Singelton Yapısında Bir Sınıf Oluşturmak İçin Gerekli Adımlar
 * 
 * 1 - cont --> private olacak yeni bir nesne new'lememize izin verilmeyecek
 * 2 - Sınıfında kendi referansında private static bir değişken tutacağız
 * 3 - Static bir getInstance() metodu oluşturuyoruz içerisinde sınıf içinde tanımladığımız instance değişkeninin null olup olmadığını kontol ediyoruz.
 * Eğer null ise new'leme işlemini yapıyoruz ve metot sonunda yeni oluşturduğumuz instance'i geri dönüyoruz. Eğer null değilse
 * daha önce oluşturduğumuştur bizde daha önce oluşturulmuş instance'i bu metot sayesinde dönüyoruz.
 */

public class MyPostgreConnection {

	private static MyPostgreConnection instance;

	private MyPostgreConnection() {

	}

	public static MyPostgreConnection getInstance() {

		if (instance == null) {
			instance = new MyPostgreConnection();
		}

		return instance;
	}

	@Override
	public String toString() {
		return "MyPostgreConnection [hashCode()=" + hashCode() + "]";
	}
}