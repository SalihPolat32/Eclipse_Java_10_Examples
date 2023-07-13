package com.bilgeadam.lesson023.trycatch;

public class InfinityException extends Exception {

	
	private String massage;

	public InfinityException(String message) {
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