package com.bilgeadam.lesson021.odev;

public class Antrenor extends TeknikHeyet implements IFutbolcuEgitimi{

	@Override
	public void taktikVer() {
		System.out.println("Antrenör Futbolculara Taktik Verdi.");
	}

	@Override
	public void teknikOgret() {
		System.out.println("Antrenör Futbolculara Teknik Öğretti.");
	}
}