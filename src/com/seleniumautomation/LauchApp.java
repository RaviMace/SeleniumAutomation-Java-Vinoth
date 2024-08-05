package com.seleniumautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchApp {

	public static void main(String[] args) {

		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://nxtgenaiacademy.com/demo-site/";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();

		// Close the browser
		driver.close();

	}

}
