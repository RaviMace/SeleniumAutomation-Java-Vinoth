package com.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingBrowsers 
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

		//Click on data science link
		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();

		//Passing the execution in nano seconds
		Thread.sleep(3000);

		//Click on Back button
		driver.navigate().back();

		//Passing the execution in nano seconds
		Thread.sleep(3000);

		//Click on Back button
		driver.navigate().forward();

		//Navigate to home page
		driver.navigate().to("https://nxtgenaiacademy.com/");

		//Passing the execution in nano seconds
		Thread.sleep(3000);

		//Click on Back button
		driver.navigate().refresh();

		//Passing the execution in nano seconds
		Thread.sleep(3000);

		//Click on Back button
		driver.close();
	}

}
