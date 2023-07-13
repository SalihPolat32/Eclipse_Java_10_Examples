package com.bilgeadam.lesson013;

import java.util.Scanner;

/*
 * Bir interest rate account number birde balance özelliklerimiz var
 * 
 * Şimdi bu sınıfı soyutlamanızı istiyorum. Bizim bankamızın faiz oranı 0.05 olsun
 * 
 * daha sonra faiz getirisini hesaplayan bir metot yazalım getInterestRate:
 * 
 * bir de getInformation metotu yazıp hesap bilgilerimizi gösterelim
 */

public class BankaAccount {

	private static String accountNumber;
	private double balance;
	static double interestRate;

	public BankaAccount(String accountNumber, double balance) {

		this(accountNumber); // Tek parametreli constractır çağırımı
		// this(balance, accountNumber);
		// this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public BankaAccount(double balance, String accountNumber) {

		this(accountNumber, balance);
		// this.balance = 5892;
	}

	public BankaAccount(String accountNumber) {

		this(); // Parametresiz constractır çağırımı
		this.accountNumber = accountNumber;
	}

	public BankaAccount() {
		this.balance = 100;
	}

	public void getInformation() {

//		System.out.println(this); // Sınıfa işaret eder.
//		BankaAccount bankaAccount = this;

		System.out.println("===---Hessap Bilgileri---===");
		System.out.println("Hesap Numarası: " + accountNumber);
		System.out.println("Faiz Oranı: " + interestRate);
		System.out.println("Faiz Mitarı: " + getInterestRate());
	}

	public double getInterestRate() {

		return balance * interestRate;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		
		this.accountNumber = accountNumber;
	}
}