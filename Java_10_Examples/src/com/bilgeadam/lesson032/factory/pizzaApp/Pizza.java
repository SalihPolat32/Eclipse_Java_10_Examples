package com.bilgeadam.lesson032.factory.pizzaApp;
/*
 * Hamurtipi
 * Boyutu
 * Türü
 * Fiyatı
 * 
 * 2 tane de alt sınıf oluşturalım VeganPizza KlasikPizza
 */

public abstract class Pizza {

	private double fiyat;
	private ETur tur;
	private EHamurTipi hamurtipi;
	private EBoyut boyut;
	
	public Pizza(double fiyat, ETur tur, EHamurTipi hamurtipi, EBoyut boyut) {
		super();
		this.fiyat = fiyat;
		this.tur = tur;
		this.hamurtipi = hamurtipi;
		this.boyut = boyut;
	}
	
	public Pizza(ETur tur, EHamurTipi hamurtipi, EBoyut boyut) {
		super();
		this.tur = tur;
		this.hamurtipi = hamurtipi;
		this.boyut = boyut;
	}
	
	public double getFiyat() {
		return fiyat;
	}
	
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	public ETur getTur() {
		return tur;
	}
	
	public void setTur(ETur tur) {
		this.tur = tur;
	}
	
	public EHamurTipi getHamurtipi() {
		return hamurtipi;
	}
	
	public void setHamurtipi(EHamurTipi hamurtipi) {
		this.hamurtipi = hamurtipi;
	}
	
	public EBoyut getBoyut() {
		return boyut;
	}
	
	public void setBoyut(EBoyut boyut) {
		this.boyut = boyut;
	}
}