package com.Testng;

import org.testng.annotations.Test;

import com.New.BaseNew;

public class Parallel_Task extends BaseNew {
	

	
	@Test
	public void facebook() {
		browserLaunch("chrome");
		getUrl("https://www.facebook.com/");
System.out.println("ID = " + Thread.currentThread().getId());
	}
	@Test
	public void youtube() {
		browserLaunch("chrome");
		getUrl("https://www.google.com/");
		System.out.println("ID = " + Thread.currentThread().getId());
	}

}
