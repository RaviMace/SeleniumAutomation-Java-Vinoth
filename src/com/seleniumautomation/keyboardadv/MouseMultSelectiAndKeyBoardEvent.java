package com.seleniumautomation.keyboardadv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMultSelectiAndKeyBoardEvent {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of FireFox driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://demoqa.com/selectable/";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		// Click on grid
		WebElement clickOnGrid = driver.findElement(By.id("demo-tab-grid"));
		clickOnGrid.click();
		
		WebElement one = driver.findElement(By.xpath("//*[@id=\"row1\"]/li[1]"));
		WebElement four = driver.findElement(By.xpath("//*[@id=\"row2\"]/li[1]"));
		WebElement six = driver.findElement(By.xpath("//*[@id=\"row2\"]/li[3]"));
		WebElement nine = driver.findElement(By.xpath("//*[@id=\"row3\"]/li[3]"));
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL)
			.click(one)
			.pause(1000)
			.click(four)
			.pause(1000)
			.click(six)
			.pause(1000)
			.click(nine)
			.keyUp(Keys.CONTROL)
			.perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}
