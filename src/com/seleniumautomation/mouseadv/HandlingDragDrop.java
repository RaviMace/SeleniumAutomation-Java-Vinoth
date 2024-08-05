package com.seleniumautomation.mouseadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragDrop {

	public static void main(String[] args) {
		//set the system property for the chorme driver
		System.setProperty("webdriver.gecko.driver", "C:\\AtoZAutomation\\Driver\\geckodriver.exe");

		//creating instance of FireFox driver and it will launch the chrome browser
		WebDriver driver=new FirefoxDriver();

		String url="https://demoqa.com/droppable";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		//id=draggable
		//id=droppable
		
		// Drag and Drop Methods
		WebElement dragMe = driver.findElement(By.id("draggable"));
		WebElement dropHere = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		// perform drag and drop
		action.dragAndDrop(dragMe, dropHere).perform();
		
		
	}

}
