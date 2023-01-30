package com.Cucumber;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//feature", glue = "com.stepdefinition",
monochrome = false,
dryRun = false,
tags="@smoketest, @smoketest1, @smoketest2, @smoketest3",
plugin = {"html:Reports",
		"pretty",
       "json:Reports/JsonReports.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"})
public class Test_Runner {
public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		

		
	}

	

}