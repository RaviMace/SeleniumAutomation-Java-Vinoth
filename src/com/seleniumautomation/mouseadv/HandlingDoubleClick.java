package com.seleniumautomation.mouseadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class HandlingDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.gecko.driver", "C:\\AtoZAutomation\\Driver\\geckodriver.exe");

		//creating instance of FireFox driver and it will launch the chrome browser
		WebDriver driver=new FirefoxDriver();

		String url="https://demoqa.com/buttons";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		WebElement doubleClickMe = driver.findElement(By.id("doubleClickBtn"));
		
		Actions action = new Actions(driver);
		
		// Perform double click
		// Method 1 : doubleclick() method
		action.doubleClick(doubleClickMe).perform();
		System.out.println("Button is double clicked");
		
		// Method 2 : moveToElement() method
		//action.moveToElement(doubleClickMe).doubleClick().perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}
