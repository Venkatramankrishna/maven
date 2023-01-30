package com.Automation_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement usernameElement;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement login;
	
	public Login (WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
		}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsernameElement() {
		return usernameElement;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	

}
