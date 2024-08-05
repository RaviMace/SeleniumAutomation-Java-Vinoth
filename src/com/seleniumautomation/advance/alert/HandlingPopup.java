package com.seleniumautomation.advance.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingPopup {

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
		WebElement alertAndPopup = driver.findElement(By.partialLinkText("Popup"));
		alertAndPopup.click();

		// 1. Handling alert box
		// Click on Alert Box
		WebElement alertBox = driver.findElement(By.name("alertbox"));
		alertBox.click();

		Thread.sleep(1500);

		// Capture the message
		String alertBoxMsg = driver.switchTo().alert().getText();
		System.out.println(alertBoxMsg);

		// Click on ok button
		driver.switchTo().alert().accept();
		
		Thread.sleep(1500);

		// 2. Confirming alert box
		// Click on Confirming Alert Box
		WebElement confirmBox = driver.findElement(By.name("confirmalertbox"));
		confirmBox.click();

		Thread.sleep(1500);

		//Capture the message
		String confirmBoxMsg = driver.switchTo().alert().getText();
		System.out.println(confirmBoxMsg);

		// Click on ok button
		driver.switchTo().alert().accept();

		Thread.sleep(1500);
		
		confirmBox.click();
		
		Thread.sleep(1500); 

		// Click on cancel button
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(1500);

		// 3. Prompt alert box
		// Click on Prompt Alert Box
		WebElement promptBox = driver.findElement(By.name("promptalertbox1234"));
		promptBox.click();
		
		// Activating the alert popup - important
		Alert alert = driver.switchTo().alert();

		Thread.sleep(1500);

		//Capture the message
		String promptBoxMsg = alert.getText();
		System.out.println(promptBoxMsg);
		
		// Type Yes and Click on ok button
		String yes="Yes", no="No";
		alert.sendKeys(yes);
		Thread.sleep(1500);
		alert.accept();
		
		Thread.sleep(1500);
		
		promptBox.click();
		
		Thread.sleep(1500);

		// Type No and Click on ok button
		alert.sendKeys(no);
		Thread.sleep(1500);
		alert.accept();

		Thread.sleep(1500);
		
		promptBox.click();

		// Click on cancel button
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(1500);
		driver.close();

	}

}
