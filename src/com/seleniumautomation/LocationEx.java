package com.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationEx {

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

		//id locator
		//Enter the first name
		driver.findElement(By.id("vfb-5")).sendKeys("Ravi");

		//Enter the last name
		driver.findElement(By.id("vfb-7")).sendKeys("Shankaran");

		//name locator
		//Enter the street address
		driver.findElement(By.name("vfb-13[address]")).sendKeys("Gandhi Street");

		//Enter the apartment number
		driver.findElement(By.name("vfb-13[address-2]")).sendKeys("S1");

		//linkText locator
		// click on home link
		//driver.findElement(By.linkText("HOME")).click();
		
		//partiallinkText locator-used when the link is lengthy
		//driver.findElement(By.partialLinkText("DATA SCIENCE")).click();
		
		//xpath locator
		driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("Tamil Nadu");
		
		//css locator
		driver.findElement(By.cssSelector("#vfb-13-zip")).sendKeys("637502");
		
		driver.findElement(By.cssSelector("#vfb-14")).sendKeys("ravishankaran.v@gmail.com");
		
		//
		
	}

}
