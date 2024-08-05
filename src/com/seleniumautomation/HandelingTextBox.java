package com.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingTextBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://nxtgenaiacademy.com/demo-site/";
		String firstNameValue="Ravi Shankaran";
		
		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		//First Name
		WebElement firstName=driver.findElement(By.id("vfb-5")); 
		
		// Verify the first name is displayed or not
		if(firstName.isDisplayed())
			System.out.println("First Name is Displayed");
		else
			System.out.println("First Name is not Displayed");
		
		// Verify the first name is enabled or not
		if(firstName.isEnabled())
		{
			System.out.println("First Name is Enabled");
			
			//Enter the value
			firstName.sendKeys(firstNameValue);
		}
		else
			System.out.println("First Name is not Enabled");
		
		Thread.sleep(3000);
		// Clear the value
		firstName.clear();
		
		Thread.sleep(3000);
		// Close
		driver.close();
		
	}

}
