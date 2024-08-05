package com.introduction;

/*
 * have to write a program in java Selenium using this URL "https://testautomationpractice.blogspot.com". 
 * 1) there will be search bar, provide some string search for it. 
 * 2) after clicking search button, you find links in bottom, count the number of links. 
 * 3) click on each link using for loop. 
 * 4) after clicking each link, it will open number of tabs, you have get window id's for every browser window/tab. 
 * 5) close any of the specific window 
 */

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		 // 1) There will be search bar, provide some string search for it.
        WebElement searchBar = driver.findElement(By.xpath("//*[@id='Wikipedia1_wikipedia-search-input']"));
        searchBar.sendKeys("Selenium");

        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();

        // 2) After clicking search button, you find links in bottom, count the number of links.
        List<WebElement> links = driver.findElements(By.xpath("//*[@id='wikipedia-search-result-link']/a"));
        int numberOfLinks = links.size();
        System.out.println("Number of links: " + numberOfLinks);

        // 3) Click on each link using a for loop
        for (WebElement link : links) {
            link.click();
            //Thread.sleep(2000); // Consider using WebDriverWait instead of Thread.sleep for better practice
        }

        // 4) After clicking each link, it will open number of tabs, you have get window id's for every browser window/tab.
        // Get window handles for each tab
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window Handles:");
        for (String handle : windowHandles) {
            System.out.println(handle);
        }

        // 5) Close a specific window, for example the second window if it exists
        String currentWindow = driver.getWindowHandle();
        for (String handle : windowHandles) {
            if (!handle.equals(currentWindow)) {
                driver.switchTo().window(handle);
                driver.close();
                break; // Exit after closing one specific window
            }
        }

        // Switch back to the original window
        driver.switchTo().window(currentWindow);
        
        
	}

}
