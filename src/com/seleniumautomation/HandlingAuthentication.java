package com.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthentication {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		//Sytax to authenticate in popup sign in
		//String url="http://username:password@the....

		String url="https://admin:admin@the-internet.herokuapp.com/basic_auth";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();

		//After the sign in checking the message
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p"));
		
		//Validate the successful message
		String actGreetMsg = msg.getText();
		String extGreetMsg = "Congratulations! You must have the proper credentials.";
		
		if(actGreetMsg.equals(extGreetMsg))
		{
			System.out.println("Both the actual and expected greeting messages are same");
			System.out.println("The greeting message is "+actGreetMsg);
		}
		else
		{
			System.out.println("Both the actual and expected greeting messages are not same");
			System.out.println("The actual greeting message is "+actGreetMsg);
			System.out.println("The expected greeting message is "+extGreetMsg);
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
