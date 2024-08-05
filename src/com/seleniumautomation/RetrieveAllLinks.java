package com.seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrieveAllLinks {

	public static void main(String[] args) {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of FireFox driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://nxtgenaiacademy.com/python/";
		
		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
		// print all the link
		for (WebElement link : allLink) {
			System.out.println(link.getText() +" - " + link.getAttribute("href"));
		}
		
		driver.close();
	}

}
