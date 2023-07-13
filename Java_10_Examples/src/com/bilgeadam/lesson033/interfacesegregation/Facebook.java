package com.bilgeadam.lesson033.interfacesegregation;

import com.bilgeadam.lesson033.utility.Notification;
import com.bilgeadam.lesson033.utility.User;

public class Facebook extends SocialMedia implements IEmail, IPostable, ISharableStory {
	
	@Override
	public void sendEmail(User user) {

		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}
	}

	@Override
	public void changeScaleRatio(String type) {
		
		if (type.equals("jpg")) {
			setSclaeRatio(34);
		} else if (type.equals("png")) {
			setSclaeRatio(37);
		} else {
			setSclaeRatio(45);
		}
	}

	@Override
	public void sharePost() {
		
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
}