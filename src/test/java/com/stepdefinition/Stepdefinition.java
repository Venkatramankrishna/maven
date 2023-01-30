package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Cucumber.Test_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	public static WebDriver driver = Test_Runner.driver;

	@Given("user Must Launch The Url")
	public void user_must_launch_the_url() {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("user Enter The Username In The Username Field")
	public void user_enter_the_username_in_the_username_field() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("venkat07");
	}

	@When("user Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Abcd@1234");
		
	}

	@Then("user Click The Login Button And It Navigates To Search Hotel Pages")
	public void user_click_the_login_button_and_it_navigates_to_search_hotel_pages() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@When("user Select The Location From Location Field")
	public void user_select_the_location_from_location_field() {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(6);
	}

	@When("user Select The Hotel From Hotel Field")
	public void user_select_the_hotel_from_hotel_field() {
		WebElement hotels= driver.findElement(By.id("hotels"));
		Select s1 =new Select(hotels);
		s1.selectByVisibleText("Hotel Sunshine");
		
	}

	@When("user Select The Room Type From Room Type Field")
	public void user_select_the_room_type_from_room_type_field() {
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByValue("Deluxe");
	}

	@When("user Select The Number of Rooms From Number of Rooms Field")
	public void user_select_the_number_of_rooms_from_number_of_rooms_field() {
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(roomno);
		s3.selectByIndex(1);
		
	}

	@When("user Select CheckIn Date  From CheckIn Date Field")
	public void user_select_check_in_date_from_check_in_date_field() {
		WebElement in = driver.findElement(By.id("datepick_in"));
		in.sendKeys("10/01/2023");
	}

	@When("user Select CheckOut Date  From CheckOut Date Field")
	public void user_select_check_out_date_from_check_out_date_field() {
		WebElement out = driver.findElement(By.id("datepick_out"));
		out.sendKeys("12/01/2023");
	}

	@When("user Select Number Of Adult From Number Of Adult Field")
	public void user_select_number_of_adult_from_number_of_adult_field() {
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(1);
	}

	@When("user Select Number Of Children From Number Of Children Field")
	public void user_select_number_of_children_from_number_of_children_field() {
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select s5 =new Select(childroom);
		s5.selectByIndex(0);
	}

	@Then("user Click The Search Button And It Navigates To The Select Hotel Page")
	public void user_click_the_search_button_and_it_navigates_to_the_select_hotel_page() {
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
	}
	
	@When("user Click The Check Box In Check Box Field")
	public void user_click_the_check_box_in_check_box_field() {
		WebElement button = driver.findElement(By.id("radiobutton_0"));
		button.click();
	}
	@Then("user Click The Continue Button And It Navigates To The Book Hotel Page")
	public void user_click_the_continue_button_and_it_navigates_to_the_book_hotel_page() {
		WebElement b2 = driver.findElement(By.id("continue"));
		b2.click();
	}
	@When("user Enter First Name In First Name Field")
	public void user_enter_first_name_in_first_name_field() {
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Venkat");
	}
	@When("user Enter Last Name In Last Name Field")
	public void user_enter_last_name_in_last_name_field() {
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("K");
	
	}
	@When("user Enter Billing Address In Billing Address Field")
	public void user_enter_billing_address_in_billing_address_field() {
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("no.1 doctor colony, chrompet");
	}
	@When("user Enter CCNumber In CCNumber Field")
	public void user_enter_cc_number_in_cc_number_field() {
		WebElement cardnumber = driver.findElement(By.id("cc_num"));
		cardnumber.sendKeys("1234567898765432");
	}
	@When("user Select CCType From CCType Field")
	public void user_select_cc_type_from_cc_type_field() {
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cardtype);
		s6.selectByIndex(3);
	}
	@When("user Select Expiry Date From Date Field")
	public void user_select_expiry_date_from_date_field() {
		WebElement exp_month = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(exp_month);
		s7.selectByIndex(7);
	}
	@When("user Select Expiry Year From Year Field")
	public void user_select_expiry_year_from_year_field() {
		WebElement exp_year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(exp_year);
		s8.selectByIndex(7);
	}
	@When("user Enter Cvvno In Cvvno Field")
	public void user_enter_cvvno_in_cvvno_field() {
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("789");
	}
	@Then("user Click Book Now Button And It Navigates To Booking Confiramtion page")
	public void user_click_book_now_button_and_it_navigates_to_booking_confiramtion_page() {
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		
	}
}






