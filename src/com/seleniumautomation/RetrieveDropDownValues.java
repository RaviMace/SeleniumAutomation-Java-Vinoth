package com.seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RetrieveDropDownValues {

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
		
		WebElement countryDropDown = driver.findElement(By.id("vfb-13-country"));
		
		Select cDropDown = new Select(countryDropDown);
		
		List<WebElement> value = cDropDown.getOptions();
		int ddcount = value.size();
		for(int i=0;i<ddcount;i++)
		{
			String options = value.get(i).getText();
			System.out.println(options);
		}
		driver.close();
	}

}
