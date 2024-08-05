package com.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButton 
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
		 
		/*
		 * 
		 */
		
		// Submit Button
		WebElement submitBtn = driver.findElement(By.id("vfb-4"));
		
		// Verify the first name is displayed or not
		if(submitBtn.isDisplayed())
			System.out.println("Submit button is Displayed");
		else
			System.out.println("Submit button is not Displayed");

		// Verify the first name is enabled or not
		if(submitBtn.isEnabled())
		{
			System.out.println("Submit button is Enabled");
			
			// Click on the button
			submitBtn.click();
			// or we can use this command also if the input type is submit
			//submitBtn.submit();
			System.out.println("Submit button is clicked");
		}
		else
			System.out.println("Submit button is not Enabled");

		Thread.sleep(3000);
		
		driver.close();
		
	}

}
