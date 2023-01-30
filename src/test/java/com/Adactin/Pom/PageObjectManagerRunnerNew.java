package com.Adactin.Pom;

import org.openqa.selenium.WebDriver;

import com.AdactinPageObjectManager.PageObjectManager;
import com.AdactinPageObjectManager.Pomanager_Base;
import com.demo.Maven_Project.BaseClass;

public class PageObjectManagerRunnerNew extends BaseClass{
	  

	Pomanager_Base pom = new Pomanager_Base(driver);

	public static void main(String[] args) {
		urlLaunch("https://adactinhotelapp.com/");
		
	
		
	}
	

}
