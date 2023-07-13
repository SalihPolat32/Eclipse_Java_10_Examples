package com.bilgeadam.lesson026;

public enum ErrorType {

	DOLU_YERSECIMI(1001, "Sectiginiz Yer Doludur."),
	SINIRLAR_DISINDA(1002, "Yaptiginiz Secim Sinirlar Disindadir."),
	YETERSİZ_AGIRLIK(1003, "100 Kilonun Altinda Yuk Kabulu Yoktur."),
	GECMIS_TARIH(1004, "Gecmisteki Tarihi Giremezsiniz."),
	MESAI_DISI(1005, "Mesai Disinda Islem Yapamazsiniz.");
	
	private String message;
	
	private int code;

	private ErrorType(int code, String message) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}
}