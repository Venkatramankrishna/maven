package com.Adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.AdactinPageObjectManager.Pomanager_Base;
import com.demo.Maven_Project.BaseClass;

public class Adactin_Testngtask extends BaseClass{
	public static WebDriver driver = browserLaunch();
	public static Pomanager_Base pom = new Pomanager_Base(driver);
	@Test
	private void loginpage() {
		urlLaunch("https://adactinhotelapp.com/");
		passInput(pom.getA().getusername(), "venkat07");
		passInput(pom.getA().getpassword(), "Abcd@1234");
		clickOnElement(pom.getA().getlogin());

	}

}
