package com.Testng;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = "gadgets")
	public void monitor() {
		System.out.println("monitor");

	}
	@Test(groups = "gadgets")
	public void cpu() {
		System.out.println("cpu");

	}
	@Test(groups = "gadgets")
	public void keyboard() {
		System.out.println("keyboard");
	}
	@Test(groups = "dress")
	public void shirt() {
		System.out.println("shirt");
	}
	@Test(groups = "dress")
	public void jeans() {
		System.out.println("Jeans");

	}



}
