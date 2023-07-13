package com.bilgeadam.lesson033.dependencyinversion.socialmedia;
/*
 * İnterface Segregation
 * 
 * Twitter diye bir sosyal medya özelliğimiz eklendi ve 
 * hikaye paylaş özelliğini ve video konferans özelliğini desteklemiyor.
 */

import com.bilgeadam.lesson033.utility.Notification;
import com.bilgeadam.lesson033.utility.User;

public class Instagram extends SocialMedia implements IEmail, ISms, IPostable, ISharableStory {
	
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
			setSclaeRatio(38);
		} else if (type.equals("png")) {
			setSclaeRatio(30);
		} else {
			setSclaeRatio(40);
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