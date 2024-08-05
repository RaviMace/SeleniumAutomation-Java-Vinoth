package com.seleniumautomation.keyboardadv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of FireFox driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://www.google.com/";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		
		Actions action = new Actions(driver);
		
		// Method 1 : using actions calls
	/*	action.moveToElement(searchBox)
			.keyDown(searchBox, Keys.SHIFT)
			.sendKeys(searchBox, "selenium")
			.keyUp(searchBox, Keys.SHIFT)
			.pause(3000)
			.sendKeys(Keys.ENTER)
			.perform();*/
		
		// Method 2 : Using Action Interface
		Action seriesOfActions = action
				.moveToElement(searchBox)
				.keyDown(searchBox, Keys.SHIFT)
				.sendKeys(searchBox, "selenium")
				.keyUp(searchBox, Keys.SHIFT)
				.pause(3000)
				.sendKeys(Keys.ENTER)
				.build();
		
		seriesOfActions.perform();
		
		
	}

}
