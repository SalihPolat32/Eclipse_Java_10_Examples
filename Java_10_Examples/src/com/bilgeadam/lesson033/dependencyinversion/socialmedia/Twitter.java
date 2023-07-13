package com.bilgeadam.lesson033.dependencyinversion.socialmedia;

import com.bilgeadam.lesson033.utility.User;

public class Twitter extends SocialMedia implements ISms, IEmail, IPostable {

	@Override
	public void sharePost() {
		
	}

	@Override
	public void sendEmail(User user) {
		
	}

	@Override
	public void sendSms(User user) {
		
	}

	@Override
	public void changeScaleRatio(String type) {
		
	}

	@Override
	public void sharePhoto() {
		
	}

	@Override
	public void chat() {
		
	}

}