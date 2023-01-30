package com.AutomationPageObjectManager;

import org.openqa.selenium.WebDriver;

import com.Automation_Testing.Billing;
import com.Automation_Testing.Login;
import com.Automation_Testing.Shop;

public class Automation_Base {
	
	public WebDriver driver;
	
	private Login x;
	private Shop y;
	private Billing z;
	
	public Automation_Base(WebDriver driver1) {
		this.driver=driver1;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public Login getX() {
		if (x==null) {
			x=new Login(driver);
			
		}
		return x;
	}

	public Shop getY() {
		if (y==null) {
			y=new Shop(driver);
			
		}
		return y;
	}

	public Billing getZ() {
		if (z==null) {
			z=new Billing(driver);
			
		}
		return z;
	}
	
	
	
	
	

}
