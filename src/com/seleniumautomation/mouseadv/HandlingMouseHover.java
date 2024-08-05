package com.seleniumautomation.mouseadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.gecko.driver", "C:\\AtoZAutomation\\Driver\\geckodriver.exe");

		//creating instance of FireFox driver and it will launch the chrome browser
		WebDriver driver=new FirefoxDriver();

		String url="https://nxtgenaiacademy.com/";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		
		action.moveToElement(qaAutomation).perform();
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div/div/header/div[1]/div[2]/nav/ul/li[3]/ul/li[2]/a/span")).click();
		
		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();
		
		// Click on registration form
		Thread.sleep(3000);
		WebElement registrationForm = driver.findElement(By.partialLinkText("Registration Form"));
		registrationForm.click();
		
		driver.close();

	}

}
