package com.bilgeadam.lesson033.dependencyinversion.socialmedia;

public abstract class SocialMedia implements ISocialMedia {
	
	private double sclaeRatio;
	
	public abstract void changeScaleRatio(String type);
	
	public double getSclaeRatio() {
		return sclaeRatio;
	}

	public void setSclaeRatio(double sclaeRatio) {
		this.sclaeRatio = sclaeRatio;
	}
	
	// BUradaki metotlarımızı buradan kaldırabiliriz alt sınıflar implement ettiği için kaldırırsak sorun çıkmayacaktır.
	@Override
	public abstract void sharePhoto();
	
	@Override
	public abstract void chat();
}