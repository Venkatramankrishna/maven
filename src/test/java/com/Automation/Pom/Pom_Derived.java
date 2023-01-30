package com.Automation.Pom;

import org.openqa.selenium.WebElement;

import com.AutomationPageObjectManager.Automation_Base;
import com.demo.Maven_Project.BaseClass;

public class Pom_Derived extends BaseClass{
	public static void main(String[] args) {
		browserLaunch();
		urlLaunch("https://practice.automationtesting.in/my-account/");
		
		Automation_Base apom = new Automation_Base(driver);
		
		WebElement usernameElement = apom.getX().getUsernameElement();
		passInput(usernameElement, "venkatvr95@gmail.com");
		
		WebElement password = apom.getX().getPassword();
		passInput(password, "Venkat@123%");
		
		WebElement login = apom.getX().getLogin();
		clickOnElement(login);
		
		
		WebElement shop = apom.getY().getShop();
		clickOnElement(shop);
		
		WebElement js = apom.getY().getJs();
		clickOnElement(js);
		
		WebElement add = apom.getY().getAdd();
		clickOnElement(add);
		
		WebElement viewbasket = apom.getY().getViewbasket();
		clickOnElement(viewbasket);
		
		WebElement checkout = apom.getY().getCheckout();
		clickOnElement(checkout);
	}

}
