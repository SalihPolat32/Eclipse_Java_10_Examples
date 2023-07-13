package com.bilgeadam.lesson014;

import java.util.Arrays;

public class Sepet {
	
	private EUrun[] urunler;
	private double totalPrice;
	
	public static int index;
		
	public Sepet() {
		this.urunler = new EUrun[10];
	}
	
	// alt + shift + S
	public EUrun[] getUrunler() {
		return urunler;
	}

	public void setUrunler(EUrun[] diziUrunler) {
		this.urunler = diziUrunler;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Sepet [Ürünler: " + Arrays.toString(urunler) + ", Total Price: " + totalPrice + "]";
	}
}