package com.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiDropDown {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://nxtgenaiacademy.com/webtable/";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		//Multi Select values in drop down - Programming Knoledge
		WebElement multiSelect = driver.findElement(By.name("programming"));
		
		if(multiSelect.isDisplayed())
		{
			Select languages = new Select(multiSelect);
			
			//Visible text
			languages.selectByVisibleText("Java");
			languages.selectByVisibleText("Python");
			
			//Value
			languages.selectByValue("PHP");;
			
			//Index
			languages.selectByIndex(5);
			
			Thread.sleep(3000);
			
			//Deselecting
			languages.deselectByVisibleText("PHP");
			
			languages.deselectAll();
			
			//for desktop application testing - AutoIT,Robot class & % Sikuli Tool %
						
			System.out.println("Programming Knowledge option is displayed");
		}
		else
			System.out.println("Programming Knowledge option is not displayed");
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
