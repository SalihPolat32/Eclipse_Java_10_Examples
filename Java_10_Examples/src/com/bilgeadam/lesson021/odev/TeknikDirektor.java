package com.bilgeadam.lesson021.odev;

public class TeknikDirektor extends TeknikHeyet implements IFutbolcuEgitimi {

	@Override
	public void taktikVer() {
		System.out.println("Teknik Direktör Futbolculara Taktik Verdi.");
		
	}

	@Override
	public void teknikOgret() {
		System.out.println("Teknik Direktör Futbolculara Teknik Öğretti.");
	}
}