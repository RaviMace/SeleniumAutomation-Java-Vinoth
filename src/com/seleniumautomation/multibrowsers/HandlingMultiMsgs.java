package com.seleniumautomation.multibrowsers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMultiMsgs {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		//creating instance of FireFox driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://nxtgenaiacademy.com/";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));

		action.moveToElement(qaAutomation).perform();

		Thread.sleep(1500);
		//driver.findElement(By.xpath("/html/body/div/div/header/div[1]/div[2]/nav/ul/li[3]/ul/li[2]/a/span")).click();

		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();

		// Click on registration form
		Thread.sleep(1500);
		WebElement muliWindows = driver.findElement(By.partialLinkText("Multiple Windows"));
		muliWindows.click();

		Thread.sleep(1500);

		// Click on new browser message button
		WebElement newBrowserTab = driver.findElement(By.name("newmessagewindow321"));
		newBrowserTab.click();

		// Retrieve the id of each browser opened by the chrome driver
		System.out.println(driver.getWindowHandles());

		// Get the window's id - important one using iterator
		// To get multi window id
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator = windowId.iterator();

		//Storing each windows id to respective variables
		String parentWindowMsg = iterator.next();
		System.out.println("Parent window id is "+parentWindowMsg);
		String childWindowMsg = iterator.next();
		System.out.println("Child window id is "+childWindowMsg);

		// Activate the child browser
		driver.switchTo().window(childWindowMsg);

		Thread.sleep(1500);

		// Maximize the child browser
		//driver.manage().window().maximize();

		Thread.sleep(1500);

		// click on data science - child window tab
		//driver.findElement(By.partialLinkText("DATA SCIENCE")).click();

		Thread.sleep(1500);
		driver.close();

		// Activate the parent browser tab
		driver.switchTo().window(parentWindowMsg);

		// Click on Home link in the parent window tab
		driver.findElement(By.partialLinkText("HOME")).click();

		Thread.sleep(1500);
		driver.close();

	}

}
