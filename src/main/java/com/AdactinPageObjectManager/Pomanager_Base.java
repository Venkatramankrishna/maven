package com.AdactinPageObjectManager;

import org.openqa.selenium.WebDriver;

import com.Adactin.Adactin_Booking;
import com.Adactin.Adactin_SearchHotel;
import com.Adactin.Adactin_login;

public class Pomanager_Base {
	
	public WebDriver driver;
	
	private Adactin_login a;
	
	private Adactin_SearchHotel b;
	
	private Adactin_Booking c;
	
	public Pomanager_Base (WebDriver driver1) {
		this.driver=driver1;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public Adactin_login getA() {
		if (a==null) {
			a=new Adactin_login(driver);
			
		}
		
		return a;
	}

	public Adactin_SearchHotel getB() {
		if (b==null) {
			b=new Adactin_SearchHotel(driver);
		}
		return b;
	}

	public Adactin_Booking getC() {
		if (c==null) {
			c=new Adactin_Booking(driver);
		}
		return c;
	}
	
	
	
	
	

}
