package com.seleniumautomation.mouseadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingToolTip {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://www.google.co.in/";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement googleSearchBox = driver.findElement(By.name("q"));
		
		// Create an object instance in Actions class by passing the webdriver instance
		Actions action = new Actions(driver);
		
		// Movetoelement - tooltip
		action.moveToElement(googleSearchBox).perform();
		
		//Validae the tool tip message
		String actToolTipMsg = googleSearchBox.getAttribute("title");
		String extToolTipMsg = "Search";
		
		if(actToolTipMsg.equals(extToolTipMsg))
		{
			System.out.println("Both the actual and expected tool tip messages are same");
			System.out.println("The tool tip message is "+actToolTipMsg);
			
			// Movetoelement - tooltip
			action.moveToElement(googleSearchBox).perform();
			
		}
		else
		{
			System.out.println("Both the actual and expected tool tip messages are not same");
			System.out.println("The actual tool tip message is "+actToolTipMsg);
			System.out.println("The expected tool tip message is "+extToolTipMsg);
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
