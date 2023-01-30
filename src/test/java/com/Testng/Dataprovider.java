package com.Testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataprovider {
	@Test(dataProvider = "data")
	public void credentials(String username, String password) {
		System.out.println("Username is :" + username);
		System.out.println("Password is :" + password);
	}
	
	@DataProvider
	public Object[][] data() {
		
		return new Object [][] { 
			
			{"abc" , "123"}, {"xyz" , "321"},{"rty" , "456"}
			
		};

	}
}