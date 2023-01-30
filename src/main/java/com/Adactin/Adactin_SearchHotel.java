package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_SearchHotel {
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
    @FindBy(id = "room_type")
	private WebElement room_type;
	
	@FindBy(id = "room_nos")
	private WebElement room_nos;
	
	@FindBy(id = "datepick_in")
	private WebElement datein;
	
	@FindBy(id = "datepick_out")
	private WebElement dateout;
	
	@FindBy(id = "adult_room")
	private WebElement adult_room;
	
	@FindBy(id = "child_room")
	private WebElement child_room;
	
	@FindBy(id = "Submit")
	private WebElement Submit;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(id = "continue")
	private WebElement continuee;
	
	public Adactin_SearchHotel (WebDriver driver1) {
		this.driver= driver1;
		PageFactory.initElements(driver1, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinuee() {
		return continuee;
	}

	
		
	
		
	

}
