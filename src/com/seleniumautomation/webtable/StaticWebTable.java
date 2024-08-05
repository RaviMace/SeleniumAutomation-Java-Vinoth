package com.seleniumautomation.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class StaticWebTable {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

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

		//Thread.sleep(1500);
		//driver.findElement(By.xpath("/html/body/div/div/header/div[1]/div[2]/nav/ul/li[3]/ul/li[2]/a/span")).click();

		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();

		// Click on Web Table
		//Thread.sleep(1500);
		WebElement webTable = driver.findElement(By.partialLinkText("WebTable"));
		webTable.click();

		//Thread.sleep(1500);

		//xpath for sundar - //*/tbody/tr[1]/td[2]
		String startXpath = "//*/tbody/";
		
		//First Name
		WebElement firstName = driver.findElement(By.xpath(startXpath+"tr[1]/td[2]"));
		String fNameValue = firstName.getText();
		System.out.println("Employer First Name is "+fNameValue);

		//Emp ID
		WebElement empID = driver.findElement(By.xpath(startXpath+"tr[7]/td[2]"));
		String empIDValue = empID.getText();
		System.out.println("Employer ID is "+empIDValue);
		
		//Email ID
		WebElement emailID = driver.findElement(By.xpath(startXpath+"tr[9]/td[2]"));
		String emailIDValue = emailID.getText();
		System.out.println("Employer Email ID is "+emailIDValue);
		
		//For Example to print all table using for loop
		System.out.println();
		System.out.println("For Example to print all table using for loop");
		for (int i = 1; i <= 9 ; i++) 
		  { 
			  int a=1,b=2; 
			  String td1="td["+a+"]"; 
			  String td2="td["+b+"]"; 
			  String tr="tr["+i+"]/"; 
			  WebElement empTableC1 = driver.findElement(By.xpath(startXpath+tr+td1)); 
			  String empValueC1 = empTableC1.getText(); 
			  WebElement empTableC2 = driver.findElement(By.xpath(startXpath+tr+td2)); 
			  String empValueC2 = empTableC2.getText(); 
			  System.out.println("Employer "+empValueC1+" is "+empValueC2); 
		  }
		 
		driver.close();
	}

}
