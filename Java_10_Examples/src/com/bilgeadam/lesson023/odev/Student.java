package com.bilgeadam.lesson023.odev;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	int id;
	
	String durum;
	
	String bolum;
	
	String name;
	
	List<Double> notlar = new ArrayList<>();

	public double ortHesapla() {

		double toplam = notlar.stream().mapToDouble(Double::doubleValue).map(x -> x).sum();
		double ortalama = toplam / notlar.size();
		
		return ortalama;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Double> getNotlar() {
		return notlar;
	}

	public void setNotlar(List<Double> notlar) {
		this.notlar = notlar;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", durum=" + durum + ", bolum=" + bolum + ", name=" + name + ", notlar=" + notlar + "]";
	}
}