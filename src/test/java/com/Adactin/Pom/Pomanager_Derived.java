package com.Adactin.Pom;

import org.openqa.selenium.WebElement;

import com.AdactinPageObjectManager.Pomanager_Base;
import com.demo.Maven_Project.BaseClass;

public class Pomanager_Derived extends BaseClass{
	
	public static void main(String[] args) {
		browserLaunch();
		urlLaunch("https://adactinhotelapp.com/");
		
		Pomanager_Base apom = new Pomanager_Base(driver);
		
		WebElement username = apom.getA().getusername();
		passInput(username, "venkat07");
		WebElement password = apom.getA().getpassword();
		passInput(password, "Abcd@1234");
		WebElement login = apom.getA().getlogin();
		clickOnElement(login);
		
		WebElement location = apom.getB().getLocation();
		DropDown_SelectbyValue(location, "Paris");
		WebElement gethotels = apom.getB().getHotels();
		DropDown_SelectbyIndex(gethotels, 4);
		WebElement room_type = apom.getB().getRoom_type();
		DropDown_SelectbyIndex(room_type, 3);
		WebElement room = apom.getB().getRoom_nos();
		DropDown_SelectbyIndex(room, 2);
		WebElement date_in = apom.getB().getDatein();
		passInput(date_in, "06/11/2022");
		WebElement date_out = apom.getB().getDateout();
		passInput(date_out, "07/11/2022");
		WebElement adult_room = apom.getB().getAdult_room();
		DropDown_SelectbyValue(adult_room, "2");
		WebElement child_room = apom.getB().getChild_room();
		DropDown_SelectbyIndex(child_room, 1);
		WebElement search = apom.getB().getSubmit();
		clickOnElement(search);
		WebElement radiobutton_0 = apom.getB().getRadiobutton_0();
		clickOnElement(radiobutton_0);
		WebElement continuee = apom.getB().getContinuee();
		clickOnElement(continuee);
		
		
		WebElement firstname = apom.getC().getfname();
		passInput(firstname, "VENKAT");
		WebElement lastname = apom.getC().getlname();
		passInput(lastname, "K");
		WebElement address = apom.getC().getaddress();
		passInput(address, "No.1, Radha Nagar, Chrompet");
		WebElement ccno = apom.getC().getcc();
		passInput(ccno, "1234567890987654");
		WebElement cardtype = apom.getC().getcardtype();
		DropDown_SelectbyValue(cardtype, "VISA");
		WebElement expmonth = apom.getC().getexpiremonth();
		DropDown_SelectbyIndex(expmonth, 12);
		WebElement expyear = apom.getC().getexpyear();
		DropDown_SelectbyIndex(expyear, 12);
		WebElement cvv = apom.getC().cvv();
		passInput(cvv, "123");
		WebElement book = apom.getC().book();
		clickOnElement(book);
		
		
		
		
		
	}

}
