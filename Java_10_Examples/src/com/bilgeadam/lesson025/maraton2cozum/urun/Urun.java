package com.bilgeadam.lesson025.maraton2cozum.urun;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Urun {

	private String urunAdi;

	private double urunFiyati;

	public Urun(String urunAdi, double urunFiyati) {
		super();
		this.urunAdi = urunAdi;
		this.urunFiyati = urunFiyati;
	}

	public String getUrunAdi() {
		return urunAdi;
	}

	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}

	public double getUrunFiyati() {
		return urunFiyati;
	}

	public void setUrunFiyati(double urunFiyati) {
		this.urunFiyati = urunFiyati;
	}

	@Override
	public String toString() {
		return "Urun [urunAdi=" + urunAdi + ", urunFiyati=" + urunFiyati + "]";
	}

	public static void main(String[] args) {

		List<Urun> urunler = new ArrayList<>(
				List.of(new Urun("Sütaş Ayran", 30), new Urun("Ekici Peynir", 200), new Urun("Çaykur", 150)));

		urunler.stream().filter(x -> x.getUrunFiyati() < 100)
				.collect(Collectors.toMap(x -> x.getUrunAdi(), x -> x.getUrunFiyati()))
				.forEach((k, v) -> System.out.println(k + " ==> " + v));
		
		Map<String, Double> map = urunler.stream().filter(x -> x.getUrunFiyati() < 100)
				.collect(Collectors.toMap(x -> x.getUrunAdi(), x -> x.getUrunFiyati()));
	}
}