package com.seleniumautomation.webtable;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		//set the system property for the chorme driver
		System.setProperty("webdriver.chrome.driver", "C:\\AtoZAutomation\\Driver\\chromedriver.exe");

		//creating instance of FireFox driver and it will launch the chrome browser
		WebDriver driver=new ChromeDriver();

		String url="https://money.rediff.com/gainers/bse/daily/groupa";
		String companyName = "IDFC First Bank";

		//launch the application and open the site
		driver.get(url);

		//Maximize
		driver.manage().window().maximize();
		
		// Step 1&2 : Identity the table 
		//xpath r1-c1 = "//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a"
		//xpath r1-c2 = "//*[@id="leftcontainer"]/table/tbody/tr[1]/td[2]"
		String tableXpath = "//*[@id=\"leftcontainer\"]/table";
		WebElement companyTable = driver.findElement(By.xpath(tableXpath));
		
		// Step 3 : To locate the rows of the table
		List<WebElement> rowsTable = companyTable.findElements(By.tagName("tr"));
		
		// Step 4 : Find the total count of the rows
		int rowCount = rowsTable.size();
		System.out.println(rowCount);
		
		// Step 5 : For loop - loop will be executed till the last row of the table
		outerloop:
		for(int row=0; row<rowCount;row++)
		{
			// Step 6 : To locate the columns of the specified row
			List<WebElement> columnsRow = rowsTable.get(row).findElements(By.tagName("td"));
			
			// Step 7 : Find the total count of the columns
			int colCount = columnsRow.size();
			//System.out.println(colCount);
			
			// Step 8 : Nested for loop - loop will be executed till the last coulmn of the table
			for (int col = 0; col < colCount; col++) 
			{
				// Step 9 : To retrieve all the cell test
				String cellText = columnsRow.get(col).getText();
				//System.out.println(cellText);
				
				// Step 10 : Retriving the company details based on company name
				if (cellText.equals(companyName)) 
				{
					// Company Name
					WebElement companyNameObj = driver.findElement(By.xpath(tableXpath+"/tbody/tr["+row+"]/td[1]/a"));
					String companyNameValue = companyNameObj.getText();
					System.out.println("The company name is "+companyNameValue);
					
					// Group
					String groupValue = driver.findElement(By.xpath(tableXpath+"/tbody/tr["+row+"]/td[2]")).getText();
					System.out.println("The company group is "+groupValue);
					
					// Previous closeing price
					String prevPrivceValue = driver.findElement(By.xpath(tableXpath+"/tbody/tr["+row+"]/td[3]")).getText();
					System.out.println("The company previous closing price is "+prevPrivceValue);
					
					// Current price
					String currectPriceValue = driver.findElement(By.xpath(tableXpath+"/tbody/tr["+row+"]/td[4]")).getText();
					System.out.println("The company current price is "+currectPriceValue);
					
					// % Change
					String change = driver.findElement(By.xpath(tableXpath+"/tbody/tr["+row+"]/td[5]/font")).getText();
					System.out.println("The company percentage change is "+change);
					
					if(cellText.equals(companyName)) {
						// click on the company name
						companyNameObj.click();
						break outerloop;
					}
				}
			}
		}
		Thread.sleep(1500);
		driver.close();
	}

}
