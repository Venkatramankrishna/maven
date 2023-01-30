package com.demo.Maven_Project;

import org.openqa.selenium.WebElement;

public class RunnerPOM extends BaseClass {
	public static void main(String[] args) {
		browserLaunch();
		urlLaunch("https://www.facebook.com/");
		
		LoginPOM j = new LoginPOM(driver);
		
		WebElement username = j.getUsername();
		passInput(username, "venkat@gmail.com");
		
		WebElement password = j.getPassword();
		passInput(password, "12345678");
		
		WebElement login = j.getLogin();
		clickOnElement(login);
		
		
		
	}

}
