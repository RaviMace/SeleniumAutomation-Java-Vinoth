package com.seleniumautomation.waitstatements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitStatements {

	public static void main(String[] args) {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://www.goibibo.com/";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		//Page load time out
		/* 1. This sets the time to wait for a page to load
		 *    completely before throwing an error.
		 * 2. This timeout is applicable only to driver.manage()
		 * 	  and driver.navigage.to() methods.
		 * syntax: driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		 */
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}

}
