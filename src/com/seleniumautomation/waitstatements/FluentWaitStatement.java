package com.seleniumautomation.waitstatements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

//Fluent Wait
/*	1.	FluentWait instance defines the maximum amount of time to wait
 * 		for a condition, % as well as the frequency with which to check
 * 		the condition %.
 * 	2.	Frequency: Setting up a repeat cycle with the time frame to
 * 		verify/check the condition at the regular interval of time.
 * 	3.	The user may configure the wait to ignore specific types of 
 * 		exceptions while waiting, such as NoSuchElementExceptions when
 * 		searching for an element on the page.
 * 	4.	User can also customize the exception error message.
 * 
 * 	Syntax:
 * 		Wait wait = new FluentWait(WebDriver reference)
 * 					.withTimeout(timeout,SECONDS)
 * 					.pollingEvery(timeout,SECONDS)
 * 					.ignoring(Exception.class);
 */

public class FluentWaitStatement {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://demoqa.com/progress-bar";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();

		// startStopButton
		// click on start button
		WebElement startandstop = driver.findElement(By.id("startStopButton"));
		startandstop.click();
		Thread.sleep(3000);
		startandstop.click();
		Thread.sleep(3000);
		startandstop.click();

		// Declaring the reset button webelement
		WebElement reset;
		
		// Fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(15))
								.pollingEvery(Duration.ofSeconds(5))
								.withMessage("Fluent wait is implemented. Increase the time out duration")
								.ignoring(NoSuchElementException.class);
		
		reset = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));
		
		reset.click();
		System.out.println("Reset Button is clicked");
		
		driver.close();
	}

}
