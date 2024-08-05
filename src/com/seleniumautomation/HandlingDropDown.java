package com.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://nxtgenaiacademy.com/demo-site/";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		// Country dropdown
		WebElement countryDropDown = driver.findElement(By.id("vfb-13-country"));
		
		String ListValueCountryOne="India";
		String ListValueCountryTwo="United States of America";
		
		if(countryDropDown.isDisplayed())
		{
			System.out.println("Country dropdown is displayed");
			
			// Create the object instance for the select class
			Select cDropDown = new Select(countryDropDown);
			
			// Select using visible text
			cDropDown.selectByVisibleText(ListValueCountryOne);
			System.out.println("The Country selected is "+ListValueCountryOne);
			
			Thread.sleep(3000);
			
			// Select using value
			cDropDown.selectByValue(ListValueCountryTwo);
			System.out.println("The Country selected is "+ListValueCountryTwo);
			
			Thread.sleep(3000);
			
			// Select by index - 9 Means Australia
			cDropDown.selectByIndex(9);
			
			
		}
		else
			System.out.println("Country dropdown is not displayed");
		
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
