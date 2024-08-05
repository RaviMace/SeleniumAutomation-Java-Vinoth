package com.introduction;

/*
 * Downloading jar files and attaching them to Java Project. (Manually)
 * 
 * - create new java project
 * - download webdriver jar(.zip) and get extracted
 * - create new JarFile folder under same project and copy those jar files to that folder
 * - open the folder and select all the jar files and right click -> build path -> add jar files to build path
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser // Up-casting
		WebDriver driver=new ChromeDriver();

		String url="https://vinothqaacademy.com/demo-site/";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();

		// wait statement to wait for 1 min 
		Thread.sleep(10000);
		
		// Close the browser
		driver.close();
	}

}
