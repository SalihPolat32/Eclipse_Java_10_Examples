package com.bilgeadam.lesson012.oop;

import java.util.Random;

public class UserProfile {
	
	String avatar;
	String username;
	String name;
	String surName;
	int followers;
	Integer following;
	double repositories;
	
	
	public void editProfile() {
		System.out.println(name + "Profilini Düzenledi...");
	}
	
	public void createRepository() {
		System.out.println("Yeni Bir Repository Oluşturuldu");
	}
	
	public void randomFollowers() {
		Random random = new Random();
		followers = random.nextInt(1, 100000000);
	}
	
	public void getInformation() {
		System.out.println("===== Profil Bilgileri =====");
		System.out.println("İsim Soyisim: " + name + " " + surName);
		System.out.println("Kullanıcı Adı: " + username);
		System.out.println("Followers: " + followers);
		System.out.println("Following: " + following);
		System.out.println("Repositories: " + repositories);
		System.out.println("-------------------------------");
	}
}