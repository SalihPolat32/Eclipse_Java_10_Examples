package com.bilgeadam.lesson033.openclosed;

public class Test {

	public static void main(String[] args) {
		
		Instagram instagram = new Instagram();
		Facebook facebook = new Facebook();
		WhatsApp whatsApp = new WhatsApp();
		Twitter twitter = new Twitter();
		ResizePhoto resizePhoto = new ResizePhoto();
		
//		resizePhoto.resizePhoto(instagram, "jpg");
//		System.out.println(instagram.getSclaeRatio());
//		
//		resizePhoto.resizePhoto2(instagram, "jpg");
//		System.out.println(instagram.getSclaeRatio());
//		resizePhoto.resizePhoto2(facebook, "jpg");
//		System.out.println(facebook.getSclaeRatio());
		
		resizePhoto.resize(facebook, "jpg");
		System.out.println(facebook.getSclaeRatio());
		resizePhoto.resize(instagram, "jpg");
		System.out.println(instagram.getSclaeRatio());
		resizePhoto.resize(whatsApp, "jpg");
		System.out.println(whatsApp.getSclaeRatio());
		resizePhoto.resize(twitter, "jpg");
		System.out.println(twitter.getSclaeRatio());
	}
}