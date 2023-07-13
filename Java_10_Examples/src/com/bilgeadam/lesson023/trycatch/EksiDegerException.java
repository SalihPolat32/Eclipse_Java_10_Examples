package com.bilgeadam.lesson023.trycatch;

public class EksiDegerException extends RuntimeException {

	
	private String massage;

	public EksiDegerException(String message) {
		super(message);
		this.massage = massage;
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}	
}