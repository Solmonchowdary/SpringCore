package com.nt.cont;

import java.util.Date;

public class WishMessageGenerator {
	private Date d;
	
	public void setDate(Date d) {
		this.d=d;
	}
	
	public void generateWishMessage(String name) {
		if(d.getHours()<=20) {
			System.out.println("good evening "+name);
		}
		
	}

}
