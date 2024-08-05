package com.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingImage {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://nxtgenaiacademy.com/demo-site/";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();

		// Robot Image(Static Image)
		WebElement robotImage = driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div[2]/div/div/div[2]/div/div/img"));

		// Displayed or Not
		if(robotImage.isDisplayed())
		{
			System.out.println("Robot image is displayed");

			// Get the image text - Automation
			//System.out.println(robotImage.getAttribute("alt"));
			//System.out.println(robotImage.getAttribute("src"));
			//System.out.println(robotImage.getAttribute("sizes"));

			String robotText=robotImage.getAttribute("alt");
			System.out.println("The text of the robot image is "+robotText);

		}
		else 
			System.out.println("Robot image is not displayed");

		//Logo Image
		WebElement logoImage=driver.findElement(By.xpath("//*[@id=\"site-logo-inner\"]/a/img"));
		if(logoImage.isDisplayed())
		{
			System.out.println("Logo image is displayed");

			String actLogoText = logoImage.getAttribute("alt");
			String expLogoText = "NxtGen A.I Academy";
			if(actLogoText.equals(expLogoText))
			{
				System.out.println("Both actual and expected logo text are same");
				System.out.println("The logo text is "+actLogoText);	
				
				//Click on logo
				logoImage.click();
				
				//close it after the some delay
				Thread.sleep(3000);
				driver.close();
			}
			else
			{
				System.out.println("Both actual and expected logo text are not same");
				System.out.println("The Actual log text is "+actLogoText);
				System.out.println("The Expected logo text is "+expLogoText);
			}
		}	
		else
			System.out.println("Logo image is not displayed");



	}

}
