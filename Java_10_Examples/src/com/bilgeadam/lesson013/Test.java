package com.bilgeadam.lesson013;

public class Test {
	
	public static void main(String[] args) {
	
		StaticOrnek.number2 = 12;
		
		StaticOrnek.numaraVer2();
		
		StaticOrnek so = new StaticOrnek();
		so.number1 = 15;
		// so.number2 = 26; // İstersek böyle de ulaşabiliriz ama static olduğu için gereksiz olur
		
	}
}