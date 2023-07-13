package com.bilgeadam.lesson033.utility;

public class Notification {
	
	public static void sendEmail(String email) {
		
		System.out.println(email + " ==> email gönderiliyor...");
	}
	
	public static void sendSms(String phone) {
		
		System.out.println(phone + " ==> sms gönderiliyor...");
	}
}