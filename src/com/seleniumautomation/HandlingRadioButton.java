package com.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButton 
{
	public static void main(String[] args) 
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

		//Female Radio Button
		WebElement femaleRadioBtn = driver.findElement(By.id("vfb-8-2"));

		// Verify the first name is displayed or not
		if(femaleRadioBtn.isDisplayed())
			System.out.println("Female Radio button is Displayed");
		else
			System.out.println("Female Radio button is not Displayed");

		// Verify the first name is enabled or not
		if(femaleRadioBtn.isEnabled())
			System.out.println("Female Radio button is Enabled");
		else
			System.out.println("Female Radio button is not Enabled");

		//Selected or not
		if(femaleRadioBtn.isSelected())
			System.out.println("Female Radio button is Selected");
		else
		{
			System.out.println("Female Radio button is not Selected");

			// To Select the female radio button
			femaleRadioBtn.click();
		}

		//Re-check Selected or not
		if(femaleRadioBtn.isSelected())
			System.out.println("Female Radio button is Selected");
		
		driver.close();
		
	}

}
