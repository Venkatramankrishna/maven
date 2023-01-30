package com.Testng;

import org.testng.annotations.Test;

public class Dependencytest {
@Test
	private void propertySetting() {
		System.out.println("property Setting");
	}
@Test(dependsOnMethods = "urlLaunch")
	private void browserLaunch() {
		System.out.println("Browser launch");
	}
@Test(dependsOnMethods = "propertySetting")
	public void urlLaunch() {
		System.out.println("url launch");
	}
@Test
	public void login() {
		System.out.println("login");
	}

}
