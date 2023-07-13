package com.bilgeadam.lesson033.singlereponsiblity;

import com.bilgeadam.lesson033.utility.Notification;
import com.bilgeadam.lesson033.utility.User;

/*
 * Bir bildirim gönder metodu yazmanızı istiyorum.
 * Daha sonra eğer kullanıcının emaili varsa email gönder
 * Telefonu varsa sms göndersin
 * Hem telefon hem email varsa ikisini de göndersin
 * 
 * bildirim gönder ==> Kullanıcı
 * sms ==> 555-555-555 ==> sms gönderiliyor
 * email ==> mustafa@gmail.com ==> email gönderiliyor
 */

public class Instagram {

	/*
	 * 1. Basamakta bir sendNotification metodu yazdık. Kullanıcının telefon ve
	 * emailini kontrol edip ona göre bildirimler verdik. fakat bu metodun single
	 * responsibility'e uymadığını farkettik ve 2. basamağa geçtik
	 * 
	 */

	public void sendNotification(User user) {

		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}

		if (user.getPhone() != null) {
			Notification.sendSms(user.getPhone());
		}
	}

	/*
	 * 2. Basamakta yukarıdaki metodu görevlerine göre 2'ye ayırdık 2 ayrı metot ile
	 * single responsibility'e uygun hale getirdik
	 */

	public void sendEmail(User user) {

		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}
	}

	public void sendSms(User user) {

		if (user.getPhone() != null) {
			Notification.sendSms(user.getPhone());
		}
	}
}