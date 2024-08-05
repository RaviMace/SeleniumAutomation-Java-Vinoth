package com.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox 
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

		// TestNG Check box
		WebElement testNG = driver.findElement(By.id("vfb-20-2"));

		// Verify the first name is displayed or not
		if(testNG.isDisplayed())
			System.out.println("TestNG is Displayed");
		else
			System.out.println("TestNG is not Displayed");

		// Verify the first name is enabled or not
		if(testNG.isEnabled())
			System.out.println("TestNG is Enabled");
		else
			System.out.println("TestNG is not Enabled");

		//Selected or not
		if(testNG.isSelected())
			System.out.println("TestNG is Selected");
		else
		{
			System.out.println("TestNG is not Selected");

			//To check to testing
			testNG.click();
		}

		Thread.sleep(3000);

		//Re-Check Selected or not if selected unselect
		if(testNG.isSelected())
		{
			System.out.println("TestNG is Selected");

			//To check to testing
			testNG.click();
		}
		else
			System.out.println("TestNG is not Selected");
		
		driver.close();
	}
}