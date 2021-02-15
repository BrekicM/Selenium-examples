package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// Selenium code
		
		// Create Driver object for Chrome browser
		
		// We will strictly implement methods of webdriver
		// import libraries are coming from .jar files we imported
		
		// webdriver.chrome.driver // driver-lib\\chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();		// invoking the browser, and setting the driver
													// mentor@rahulshettyacademy.com
		
		driver.get("http://google.com");				// open url in browser
		System.out.println(driver.getTitle());			// validate if page title is correct
		System.out.println(driver.getCurrentUrl());		// validate if you landed on correct url
		
		//System.out.println(driver.getPageSource());			// print page source
		
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();	// it closes current browser
		//driver.quit(); // closes all browsers (tabs) open by selenium
	}

}
