package com.bilgeadam.lesson016;
/*
 * Bir market ve market yönetimi sınıflarımız olsun
 * içicekler yiyecekler temizlik ürünleri ve süt ürünleri satılsın
 * 
 * markette çalışanlar ve müşterilerimiz olsun
 */

public class Test {
	
	public static void main(String[] args) {
	
		
	MarketYonetimi marketYonetimi = new MarketYonetimi();
	Market market = new Market("Market", "Ankara");
	marketYonetimi.setMarket(market);
	
	System.out.println(marketYonetimi.getMarket());
	
	Market market2 = new Market("Market", "Ankara");
	MarketYonetimi marketYonetimi2 = new MarketYonetimi(market2);
	
	System.out.println(marketYonetimi2.getMarket());
	}
}