package com.Automation_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing {
	public WebDriver driver;

	@FindBy(id = "billing_first_name")
	private WebElement firstname;
	
	@FindBy(id = "billing_last_name")
	private WebElement lastname;
	
	@FindBy(id = "billing_company")
	private WebElement companyname;
	
	@FindBy(id = "billing_email")
	private WebElement email;
	
	@FindBy(id = "billing_phone")
	private WebElement phone;
	
	@FindBy(id = "s2id_billing_country")
	private WebElement country;
	
	@FindBy(id = "billing_address_1")
	private WebElement address;
	
	@FindBy(id = "billing_address_2")
	private WebElement address2;
	
	@FindBy(id = "billing_city")
	private WebElement city;
	
	@FindBy(id = "select2-chosen-2")
	private WebElement state;
	
	@FindBy(id = "billing_postcode")
	private WebElement pincode;
	
	@FindBy(id = "payment_method_cod")
	private WebElement cod;
	
	@FindBy(id = "place_order")
	private WebElement place_order;
	
	public Billing(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
		}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getCod() {
		return cod;
	}

	public WebElement getPlace_order() {
		return place_order;
	}
	
	
	
}
