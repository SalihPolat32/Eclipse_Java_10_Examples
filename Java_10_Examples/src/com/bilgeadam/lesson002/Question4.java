package com.bilgeadam.lesson002;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

/*
 * Bir TL değeri olsun. Başlanfıç mitarı belli olsun.
 * Daha sonra dolar kuru cinsinden hesaplansın.
 */

public class Question4 {

	public static void main(String[] args) {
		
		int turklirasi = 20;
		
		float dolarKuru = 3.14f;
		double guncelDolarKuru = 19.42;
		
		System.out.println("Dolar ==> "+ turklirasi/dolarKuru);
		System.out.println("Dolar ==> "+ turklirasi/guncelDolarKuru);

	}

}
