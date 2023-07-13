package com.bilgeadam.lesson031;

public class Hesap {

	int bakiye = 10000;
	
	public synchronized void paraYatir(int para) {
		
		bakiye += para;
		System.out.println(Thread.currentThread().getName() + " ==> Para Yatırdı. Bakiye: " + bakiye);
	}
	
	public synchronized void paraCek(int para) {
		
		if (bakiye >= para) {
			bakiye -= para;
			System.out.println(Thread.currentThread().getName() + " ==> Para Çekti. Bakiye: " + bakiye);
		}else {
			System.out.println(Thread.currentThread().getName() + " Yetersiz Bakiye. Bakiye: " + bakiye);
		}
	}
}