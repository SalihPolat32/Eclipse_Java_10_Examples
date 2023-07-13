package com.bilgeadam.lesson032.singelton.lazy;
/*
* 1- 1 tane Robotumuz var bu robotun çalış metodu var
* çalış metodunda==> hascode----> numaralı robot çalışıyor
* 
* 2- Ev halkı sınıfımız olsun bu sınıfta Robot cagır metodu olsun
* bu metot çalısınca bize robot sınıfındaki çalış metodunu çalıstırsın
* (ev halkı herdefasında aynı robotu çağırmalı)
* 
* 3- Test sınıfında  3 tane ev halkı yaratarak bunu deneyeleim
*/
public class Robot {
	
	private static Robot instance;

	private Robot() {
		
	}

	// Threadlerin aynı anda bu metoda girmesini engellemek için synchronized keyword'unu kullanmak gerekir.
	// public synchronized static Robot getRobot()
	// Bu sayede eğer threadler üzerinde çalışıyorsak her defasında aynı nesneyi üretmeyi garanti altına almış oluruz.
	public static Robot getRobot() {

		if (instance == null) {
			instance = new Robot();
		}

		return instance;
	}

	public void calis() {
		System.out.println(hashCode() + " ---> Numaralı Robot Çalışıyor.");
	}
}