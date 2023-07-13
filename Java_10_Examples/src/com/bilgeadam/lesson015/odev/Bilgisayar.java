package com.bilgeadam.lesson015.odev;

import java.util.Arrays;

public class Bilgisayar {
	
	private String ad;
	private AnaKart anaKart;
	private HariciDonanim[] hariciDonanimlar;
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public AnaKart getAnaKart() {
		return anaKart;
	}
	public void setAnaKart(AnaKart anaKart) {
		this.anaKart = anaKart;
	}
	public HariciDonanim[] getHariciDonanimlar() {
		return hariciDonanimlar;
	}
	public void setHariciDonanimlar(HariciDonanim[] hariciDonanimlar) {
		this.hariciDonanimlar = hariciDonanimlar;
	}
	
	@Override
	public String toString() {
		return "Bilgisayar [ad=" + ad + ", anaKart=" + anaKart + ", hariciDonanimlar="
				+ Arrays.toString(hariciDonanimlar) + "]";
	}
}