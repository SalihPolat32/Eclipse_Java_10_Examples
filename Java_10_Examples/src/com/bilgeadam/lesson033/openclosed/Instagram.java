package com.bilgeadam.lesson033.openclosed;
/*
 * Open Closed
 * 
 * 1 - instagram sınıfımız içinde bir sclaeRatio özelliğimiz olsun
 * ResizePhoto diye bir sınıfımız olsun. Bu sınıf içinde boyutlandırma yapacağız.
 * Bu metot bizden bir instagram alacak birde String bir type alacak ve
 * eğer type jpg ise sclaeRatio(Küçültme Katsayısı) 38, eğer png ise 30, default ise 40 olsun.
 * 
 * 2 - Yeni bir sosyal medya daha eklendi facebook. 
 * Facebook için jpg --> 34, png --> 37, default 45 olsun daha sonra resizephoto sınıfında 
 * 2. bir metot yazalım bu metoda facebookta göz önüne alınsın.
 * 
 * 3 - Yeni bir sosyal medya daha ekleyelim whatsapp
 * jpg --> 28, png --> 32, default --> 36
 */

public class Instagram extends SocialMedia {

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
}