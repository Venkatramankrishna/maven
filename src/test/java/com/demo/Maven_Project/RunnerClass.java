package com.demo.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RunnerClass extends BaseClass {
	public static void main(String[] args) {
		browserLaunch();
		urlLaunch("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		passInput(email, "venkat@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		passInput(password, "12345678");
		WebElement login = driver.findElement(By.name("login"));
		clickOnElement(login);
		
	}

}
