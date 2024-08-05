package com.seleniumautomation.waitstatements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Eplicit Wait
/*	1. The explicit wait is used to tell the web driver to wait for
 * 	   certain conditions (expected conditions) or the maximum time
 * 	   exceeded before throwing an "ElementNotVisibleException"
 * 	   exception.
 * 
 * 	Syntax:
 * 		WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
 * 		wait.until(ExpectedConditions.visibilityOf(WebElement));
 */

public class ExplicityWaitStatement {

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
		
		WebElement reset;
		
		//Explicity Wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(8));
		
		// resetButton
		reset = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));
		
		// click on reset button
		reset.click();
		
		// Expected conditions for Explicit wait
		/*	1. alertlsPresen()
		 * 	2. elementSelectionStateToBe()
		 *	3. elementToBeClickable()
		 *	4. elementToBeSelected();
		 *	5. frameToBeAvaliableAndSwitchTolt()
		 *	6. invisibilityOfTheElementLocated()
		 *	7. invisibilityOfElementWWithText()
		 *	8. presenceOfAllElementsLocatedBy()
		 *	9. presenceOfElementLocated()
		 *	10.textToBePresentElement()
		 *	11.textToBePresentInElementLocated()
		 *	12.textToBePresentInElementValue()
		 *	13.titleIs()
		 *	14.titleContains()
		 *	15.visibilityOf()
		 *	16.visibilityOfAllElements()
		 *	17.visibilityOfAllElementsLocatedBy()
		 *	18.visibilityOfElementsLocated()
		 */
		
		driver.close();
	}

}
