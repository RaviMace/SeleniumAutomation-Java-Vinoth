package com.seleniumautomation.mouseadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingRightClick {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.gecko.driver", "C:\\AtoZAutomation\\Driver\\geckodriver.exe");

		//creating instance of FireFox driver and it will launch the chrome browser
		WebDriver driver=new FirefoxDriver();

		String url="https://demo.guru99.com/test/simple_context_menu.html";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		//xpath="//*[@id="authentication"]/span"
		//xpath="//*[@id="authentication"]/ul/li[5]/span"
		//alternative way of xpath = "//span[contains(text(),'right click me')]"
		//alternative way of xpath = "//span[contains(text(),'Delete')]"
		
		WebElement rightClickMe = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		WebElement deleteOption = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
		
		Actions action = new Actions(driver);
		
		//perform right click
		//action.contextClick(rightClickMe).click(deleteOption).build().perform();
		// or
		action.contextClick(rightClickMe)
		.pause(3000)
		.click(deleteOption)
		.perform();
		
		Thread.sleep(3000);
		
		//click on ok button (this is important one)
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
