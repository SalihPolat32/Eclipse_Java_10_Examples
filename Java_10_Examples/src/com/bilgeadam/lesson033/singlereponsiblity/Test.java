package com.bilgeadam.lesson033.singlereponsiblity;

import com.bilgeadam.lesson033.utility.User;

public class Test {

	public static void main(String[] args) {
		
		Instagram instagram = new Instagram();
		User user = new User("Mustafa", "mustafa@gmail.com");
		User user2 = new User("Mustafa", "mustafa@gmail.com", "555-55-55-55");
		
		// instagram.sendNotification(user);
		
		instagram.sendEmail(user2);
		instagram.sendSms(user2);
	}
}