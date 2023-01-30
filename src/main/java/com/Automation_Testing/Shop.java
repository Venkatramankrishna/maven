package com.Automation_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Shop')]")
	private WebElement shop;
	
	@FindBy(xpath = "//h3[contains(text(),'JS Data Structures and Algorithm')]")
	private WebElement js;
	
	@FindBy(xpath = "//button[contains(text(),'Add to basket')]")
	private WebElement add;
	
	@FindBy(xpath = "//a[contains(text(),'View Basket')]")
	private WebElement viewbasket;
	
	@FindBy(xpath = "//a[contains(text(),'Proceed to Checkout')]")
	private WebElement checkout;
	
	public Shop(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
		}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getShop() {
		return shop;
	}

	public WebElement getJs() {
		return js;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getViewbasket() {
		return viewbasket;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	
	

}
