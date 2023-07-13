package com.bilgeadam.lesson013;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankaAccount.interestRate = 0.05;
		
		BankaAccount bankaAccount1 = new BankaAccount("123",6989);
		// bankaAccount1.accountNumber = "123";
		bankaAccount1.setAccountNumber("123");
		
		// bankaAccount1.balance = 1258.50;
		// bankaAccount1.interestRate = 0.05;
		bankaAccount1.getInformation();
		
		BankaAccount bankaAccount2 = new BankaAccount("1456", 159);
		// bankaAccount2.accountNumber = "456";
		bankaAccount2.setAccountNumber("456");
		// bankaAccount2.balance = 561258.50;
		bankaAccount2.setBalance(561258.50);
		bankaAccount2.getInformation();
		
		BankaAccount bankaAccount3 = new BankaAccount("987",1589);
		bankaAccount3.getInformation();
		
		BankaAccount bankaAccount4 = new BankaAccount("5689");
		bankaAccount4.getInformation();
		
		BankaAccount bankaAccount5 = new BankaAccount(500,"234");
		bankaAccount5.getInformation();
		
//		bankaAccount5.getBalance() = 123;
//		double sayi = bankaAccount5.getBalance();
//		sayi = 5689;
		
		
		System.out.println(bankaAccount5.getBalance());
		System.out.println(bankaAccount5.getAccountNumber());
	}
}