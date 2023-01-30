package com.Testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Test
	public void monitor() {
		System.out.println("monitor");

	}
	@Test(enabled = false)
	public void cpu() {
		System.out.println("cpu");

	}
	@Test@Ignore
	public void keyboard() {
		System.out.println("keyboard");
	}
	@Test
	public void shirt() {
		System.out.println("shirt");
	}
	@Test
	public void jeans() {
		System.out.println("Jeans");

	}

}
