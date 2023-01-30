package com.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	@BeforeSuite
	public void propertySetting() {
		System.out.println("property Setting");

	}
	@BeforeTest
	public void browserLanunch() {
		System.out.println("Browser launch");

	}
	@BeforeClass
	public void urlLaunch() {
		System.out.println("url launch");

	}
	@BeforeMethod
	public void login() {
		System.out.println("login");

	}
	
	@Test(invocationCount = 3, priority = -1)
	public void men() {
		System.out.println("men");
		
	}
	@Test
	public void kids() {
		System.out.println("kids");
		
	}
	@Test
	public void women() {
		System.out.println("women");
		
	}
	@AfterMethod
	private void logout() {
		System.out.println("logout");

	}
	@AfterClass
	private void screenshot() {
		System.out.println("screenshot");
	}
	@AfterTest
	private void closewindow() {
		System.out.println("close");

	}
	@AfterSuite
	private void quitbrowser() {
		System.out.println("quit");

	}

	

}
