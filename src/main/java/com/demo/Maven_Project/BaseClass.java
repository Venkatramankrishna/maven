package com.demo.Maven_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;

	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return null;
		
	}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void passInput(WebElement element, String input) {
		element.sendKeys(input);
		
	}
	public static void clickOnElement(WebElement element1) {
		element1.click();
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void quitBrowser() {
		driver.quit();
	}
	public static void NavigateTo(String url1) {
		driver.navigate().to(url1);
	}
	public static void NavigateBack() {
		driver.navigate().back();
	}
	public static void NavigateForward() {
		driver.navigate().forward();
	}
	public static void NavigateRefresh() {
		driver.navigate().refresh();
	}
	public static void GetTitle() {
		System.out.println(driver.getTitle());
	}
	public static void SwitchAlert() {
		driver.switchTo().alert();
		
	}
	public static void AlertSendkeys(String input1) {
		driver.switchTo().alert().sendKeys(input1);
	}
	
	public static void AlertAccept() {
		driver.switchTo().alert().accept();
		
	}
	public static void Frame(WebElement element2) {
		driver.switchTo().frame(element2);
		driver.switchTo().defaultContent();
		
	}
	public static void RobotClass(int code, int code1, int code2) throws AWTException {
		Robot r= new Robot();
		r.keyPress(code);
		r.keyRelease(code1);
		r.keyPress(code2);
	}
	public static void DropDown_SelectbyValue(WebElement element3, String value) {
		Select s = new Select(element3);
		s.selectByValue(value);
	}
	public static void DropDown_SelectbyIndex(WebElement element4, int index) {
		Select s = new Select(element4);
		s.selectByIndex(index);
	}
	public static void ScreenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace-selenium\\Maven_Project\\Screenshot\\test.png");
		FileUtils.copyDirectory(source, destination);
		
	}

}
