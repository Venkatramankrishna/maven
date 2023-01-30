package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Booking {
	
	@FindBy(id = "first_name")
	private WebElement fname;
	
	@FindBy(id = "last_name")
	private WebElement lname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement cc;
	
	@FindBy(id = "cc_type")
	private WebElement cardtype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expiremonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id = "book_now")
	private WebElement book;

	public WebDriver driver;

	
	
	public Adactin_Booking (WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}
	
	public WebElement getfname(){
		return fname;
	}
	
	public WebElement getlname() {
		return lname;
	}
	public WebElement getaddress() {
		return address;
	}
	public WebElement getcc() {
		return cc;
	}
	public WebElement getcardtype() {
		return cardtype;
	}
	public WebElement getexpiremonth() {
		return expiremonth;
	}
	public WebElement getexpyear() {
		return expyear;
	}
	public WebElement cvv() {
		return cvv;
	}
	public WebElement book() {
		return book;
	}
	
	
	
	

}
