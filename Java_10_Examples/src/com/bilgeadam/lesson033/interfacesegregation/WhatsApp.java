package com.bilgeadam.lesson033.interfacesegregation;

import com.bilgeadam.lesson033.utility.Notification;
import com.bilgeadam.lesson033.utility.User;

public class WhatsApp extends SocialMedia implements IEmail, ISms, IConferencable, ISharableStory {
	
	@Override
	public void sendEmail(User user) {

		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}
	}

	@Override
	public void sendSms(User user) {

		if (user.getPhone() != null) {
			Notification.sendSms(user.getPhone());
		}
	}

	@Override
	public void changeScaleRatio(String type) {

		if (type.equals("jpg")) {
			setSclaeRatio(28);
		} else if (type.equals("png")) {
			setSclaeRatio(32);
		} else {
			setSclaeRatio(36);
		}
	}

	@Override
	public void sharePhoto() {
		
	}

	@Override
	public void shareStory() {
		
	}

	@Override
	public void chat() {
		
	}

	@Override
	public void videoConferancing() {
		
	}
}