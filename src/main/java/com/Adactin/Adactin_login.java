package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_login {
	
	public  WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement login;
	
	public Adactin_login(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	public WebElement getusername() {
		return username;
	}
	public WebElement getpassword() {
		return password;
	}
	public WebElement getlogin() {
		return login;
	}
	}
	
	


