package com.AdactinPageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.Adactin_Booking;
import com.Adactin.Adactin_SearchHotel;
import com.Adactin.Adactin_login;

public class PageObjectManager {
	public static WebDriver driver;
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(getDriver(), this);
				
	}
	public static WebDriver getDriver() {
		return driver;
	}
	private Adactin_login al;
	public Adactin_login getAl() {
		al=new Adactin_login(getDriver());
		return al;
	}
	private Adactin_SearchHotel ash;
	public Adactin_SearchHotel getAsh() {
		ash=new Adactin_SearchHotel(getDriver());
		return ash;
	}
	private Adactin_Booking ab;
	public Adactin_Booking getAb() {
		ab=new Adactin_Booking(getDriver());
		return ab;
	}
	
	
}
