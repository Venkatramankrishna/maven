package com.demo.Maven_Project;

import org.openqa.selenium.WebElement;

import com.Adactin.Adactin_Booking;
import com.Adactin.Adactin_SearchHotel;
import com.Adactin.Adactin_login;

public class Adactin_Derived extends BaseClass{
	public static void main(String[] args) {
		browserLaunch();
		urlLaunch("https://adactinhotelapp.com/");
		Adactin_login v = new Adactin_login(driver);
		WebElement username = v.getusername();
		passInput(username, "venkat07");
		WebElement password = v.getpassword();
		passInput(password, "Abcd@1234");
		WebElement login = v.getlogin();
		clickOnElement(login);
	    
		
		Adactin_SearchHotel a = new Adactin_SearchHotel(driver);
		WebElement location = a.getLocation();
		DropDown_SelectbyValue(location, "Paris");
		
		WebElement hotels = a.getHotels();
		DropDown_SelectbyIndex(hotels, 3);
		
		WebElement roomtype = a.getRoom_type();
		DropDown_SelectbyIndex(roomtype, 4);
		
		WebElement roomno= a.getRoom_nos();
		DropDown_SelectbyIndex(roomno, 5);
		
		WebElement datein = a.getDatein();
		passInput(datein, "06/11/2022");
		
		WebElement dateout = a.getDateout();
		passInput(dateout, "07/11/2022");
		
		WebElement adroom = a.getAdult_room();
		DropDown_SelectbyIndex(adroom, 3);
		
		WebElement chroom = a.getChild_room();
		DropDown_SelectbyIndex(chroom, 1);
		
		WebElement search = a.getSubmit();
		clickOnElement(search);
		
		WebElement radiobutton_0 = a.getRadiobutton_0();
		clickOnElement(radiobutton_0);
		
		WebElement continuee = a.getContinuee();
		clickOnElement(continuee);
		
		Adactin_Booking b = new Adactin_Booking(driver);
		WebElement fname = b.getfname();
		passInput(fname, "venkat");
		
		WebElement lname = b.getlname();
		passInput(lname, "K");
		
		WebElement address = b.getaddress();
		passInput(address, "No.7 Radha Nagar Chromepet");
		
		WebElement cc = b.getcc();
		passInput(cc, "1234567890123456");
		
		WebElement cardtype = b.getcardtype();
		DropDown_SelectbyIndex(cardtype, 2);
		
		WebElement expiremonth = b.getexpiremonth();
		DropDown_SelectbyIndex(expiremonth, 11);
		
		WebElement getexpyear = b.getexpyear();
		DropDown_SelectbyIndex(getexpyear, 11);
		
		WebElement cvv = b.cvv();
		passInput(cvv, "483");
		
		WebElement book = b.book();
		clickOnElement(book);
		
		
		
		
	}
	    
}
