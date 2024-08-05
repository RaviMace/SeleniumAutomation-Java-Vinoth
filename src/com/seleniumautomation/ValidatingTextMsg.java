package com.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTextMsg 
{
	public static void main(String[] args) 
	{
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://nxtgenaiacademy.com/demo-site/";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();

		//Positive Scenarios
		//Title
		WebElement regTitle = driver.findElement(By.xpath("//*[@id=\"item-vfb-1\"]/div/h3"));

		if(regTitle.isDisplayed())
		{
			System.out.println("Registration title is displayed");

			// Validating the registration title
			String actRegTitle = regTitle.getText();
			String expRegTitle = "Register For Demo";

			if(actRegTitle.equals(expRegTitle))
			{
				System.out.println("Both the actual and expected reg titles are same");
				System.out.println("The Reg title is "+actRegTitle);
			}
			else
			{
				System.out.println("Both the actual and expected reg titles are not same");
				System.out.println("The Act Reg title is "+actRegTitle);
				System.out.println("The Exp Reg title is "+expRegTitle);
			}

		}
		else
			System.out.println("Registration title is not displayed");

		// Click on submit button
		driver.findElement(By.id("vfb-4")).click();
		
		// Negative Scenario
		WebElement firstNameErrMsg = driver.findElement(By.xpath("//*[@id=\"item-vfb-5\"]/label[2]")); 

		if(firstNameErrMsg.isDisplayed())
		{
			System.out.println("first error msg is displayed");

			// Validating the First Error Messate title
			String actFirstNameErrMsg = firstNameErrMsg.getText();
			String expFirstNameErrMsg = "This field is required.";

			if(actFirstNameErrMsg.equals(expFirstNameErrMsg))
			{
				System.out.println("Both the actual and expected first error msg are same");
				System.out.println("The first error msg is "+actFirstNameErrMsg);
			}
			else
			{
				System.out.println("Both the actual and expected first error msg are not same");
				System.out.println("The Act first error msg is "+actFirstNameErrMsg);
				System.out.println("The Exp first error msg is "+expFirstNameErrMsg);
			}

		}
		else
			System.out.println("First name error message is not displayed");
		
		driver.close();
	}

}
