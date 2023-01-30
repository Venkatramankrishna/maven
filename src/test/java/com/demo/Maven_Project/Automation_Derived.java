package com.demo.Maven_Project;

import org.openqa.selenium.WebElement;

import com.Automation_Testing.Billing;
import com.Automation_Testing.Login;
import com.Automation_Testing.Shop;

public class Automation_Derived extends BaseClass {
	
	public static void main(String[] args) {
		browserLaunch();
		urlLaunch("https://practice.automationtesting.in/my-account/");
		Login at=new Login(driver);
		
		WebElement usernameElement = at.getUsernameElement();
		passInput(usernameElement, "venkatvr95@gmail.com");
		
		WebElement password = at.getPassword();
		passInput(password, "Venkat@123%");
		
		WebElement login = at.getLogin();
		clickOnElement(login);
		
		
		Shop sh = new Shop(driver);
		WebElement shop = sh.getShop();
		clickOnElement(shop);
		
		WebElement js = sh.getJs();
		clickOnElement(js);
		
		WebElement add = sh.getAdd();
		clickOnElement(add);
		
		WebElement viewbasket = sh.getViewbasket();
		clickOnElement(viewbasket);
		
		WebElement checkout = sh.getCheckout();
		clickOnElement(checkout);
		
		Billing b = new Billing(driver);
		WebElement firstname = b.getFirstname();
		passInput(firstname, "venkat");
		
		WebElement lastname = b.getLastname();
		passInput(lastname, "K");
		
		WebElement companyname = b.getCompanyname();
		passInput(companyname, "GREENS ENTERPRISES");
		
		WebElement email = b.getEmail();
		passInput(email, "venkatvr95@gmail.com");
		
		WebElement phone = b.getPhone();
		passInput(phone, "9962574327");
		
		WebElement country = b.getCountry();
		DropDown_SelectbyValue(country, "India");
		
		WebElement address = b.getAddress();
		passInput(address, "No.7 Radha Nagar, Chrompet");
		
		WebElement address2 = b.getAddress2();
		passInput(address2, "Royal Apartment");
		
		WebElement city = b.getCity();
		passInput(city, "Chennai");
		
		WebElement state = b.getState();
		DropDown_SelectbyValue(state, "Tamil Nadu");
		
		WebElement pincode = b.getPincode();
		passInput(pincode, "600044");
		
		WebElement cod = b.getCod();
		clickOnElement(cod);
		
		WebElement place_order = b.getPlace_order();
		clickOnElement(place_order);
		
				
	}
	

}
