 package com.seleniumautomation.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIFrameIndex {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();

		//Frame Names
		//1. packageListFrame - 0
		//2. packageFrame - 1
		//3. classFrame - 2

		// Activate the list frame index
		driver.switchTo().frame(0);

		// Click on org.openqa.selenium.chrome
		driver.findElement(By.xpath("/html/body/main/ul/li[4]/a")).click();
		System.out.println("Selenium chrome link is clicked");

		// Mandatory step - switch back to default content
		// from previous frame to next frame
		driver.switchTo().defaultContent();

		// Activate the package frame index
		driver.switchTo().frame(1);

		// Click on chrome option link
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[7]/a")).click();
		System.out.println("Selenium chrome option link is clicked");

		// from previous frame to next frame
		driver.switchTo().defaultContent();

		// Activate the class frame index
		driver.switchTo().frame(2);

		// Click on chrome option link
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
		System.out.println("help link is clicked");
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
