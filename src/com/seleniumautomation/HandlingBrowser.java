package com.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowser {

	public static void main(String[] args) {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://nxtgenaiacademy.com/demo-site/";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		//Validation the title
		//System.out.println(driver.getTitle());
		String actTitle = driver.getTitle();
		String expTitle = "Demo Site – Registration Form – NxtGen A.I Academy";
		if(actTitle.equals(expTitle))
		{
			System.out.println("Bothe the actual and expected titles are same");
			System.out.println("The title of the page is "+actTitle);
		}
		else
		{
			System.out.println("Bothe the actual and expected titles are not same");
			System.out.println("Actual title is "+actTitle);
			System.out.println("Expected title is "+expTitle);
		}
		
		//click on python for data science link
		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();
		
		//Validating the current url
		String actCurrentUrl = driver.getCurrentUrl();
		String expCurrentUrl = "https://nxtgenaiacademy.com/python/";
		
		if(actCurrentUrl.equals(expCurrentUrl))
		{
			System.out.println("Bothe the actual and expected current url are same");
			System.out.println("The current url is "+actCurrentUrl);
		}
		else
		{
			System.out.println("Bothe the actual and expected current url are not same");
			System.out.println("Actual current url is "+actCurrentUrl);
			System.out.println("Expected current url is "+expCurrentUrl);
		}
		
		//System.out.println(driver.getPageSource());
		
		String pageSource = driver.getPageSource();
		
		// Page source length
		int pageSourceLength = pageSource.length();
		System.out.println("Total length of the page source is "+pageSourceLength);
		
		//close the application
		driver.close();

	}

}
