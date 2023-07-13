package com.bilgeadam.lesson033.liskovsusbstition;

public class ResizePhoto {

	public void resizePhoto(Instagram instagram, String type) {
		
		if (type.equals("jpg")) {
			instagram.setSclaeRatio(38);
		} else if (type.equals("png")) {
			instagram.setSclaeRatio(30);
		} else {
			instagram.setSclaeRatio(40);
		}
	}
	
	public void resizePhoto2(SocialMedia socialMeia, String type) {
		
		if (socialMeia instanceof Instagram) {
			
			if (type.equals("jpg")) {
				socialMeia.setSclaeRatio(38);
			} else if (type.equals("png")) {
				socialMeia.setSclaeRatio(30);
			} else {
				socialMeia.setSclaeRatio(40);
			}
		} else if (socialMeia instanceof Facebook) {
			
			if (type.equals("jpg")) {
				socialMeia.setSclaeRatio(34);
			} else if (type.equals("png")) {
				socialMeia.setSclaeRatio(37);
			} else {
				socialMeia.setSclaeRatio(45);
			}
		}
	}
	
	public void resize(SocialMedia socialMedia, String type) {
		
		socialMedia.changeScaleRatio(type);
	}
}