package com.seleniumautomation.dateselection;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDatesWithMouseAndKeyboard {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		//creating instance of chorme driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://www.makemytrip.com";
		String year = "2023";
		String month = "March";
		String day = "4";
		
		// Implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		// Click on popup
		WebElement popup = driver.findElement(By.className("langCardClose"));
		popup.click();

		//Year -> Month -> Day
		
		// Click on clendar link
		// Xpath = //*[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span
		WebElement departureLink = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span"));
		departureLink.click();
		
		// Click on Next Arrow
		WebElement next = driver.findElement(By.xpath("//*[@aria-label='Next Month']"));
		
		// Retrieve the month and year text
		WebElement date = driver.findElement(By.className("DayPicker-Caption"));
		String currentYear = date.getText();
		System.out.println(currentYear);
		
		// Click on next arrow until we get the desired year
		if(!currentYear.contains(year))
		{
			do {
				next.click();
			} while (!date.getText().contains(year));
		}
		
		// Click on  next arrow until we get the required month
		String currentMonth = date.getText();
		if(!currentMonth.contains(month))
		{
			do {
				next.click();
			} while (!date.getText().contains(month));
		}
		WebElement selectDay = driver.findElement(By.xpath("//p[contains(text(),'"+day+"')]"));
		selectDay.click(); 
	}

}
