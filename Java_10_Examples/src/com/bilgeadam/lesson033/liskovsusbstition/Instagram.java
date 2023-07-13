package com.bilgeadam.lesson033.liskovsusbstition;
/*
 * Liskov Substition
 * 
 * 1 - email ve sms gönder metotlarımız vardı. Sonra Facebook sms göndermeyi desteklemeyi bıraktı. Bu sorunu nasıl çözeriz.
 * 
 * 2 - WhatsApp sadece video konferans, sohbet, resim paylaş, hikaye paylaş özelliklerini destekliyor.
 * --- Facebook ==> post, resim, hikaye, sohbet,
 * --- Instagram ==> post, resim, hikaye, sohbet,
 */

import com.bilgeadam.lesson033.utility.Notification;
import com.bilgeadam.lesson033.utility.User;

public class Instagram extends SocialMedia implements IEmail, ISms, IPostable {
	
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