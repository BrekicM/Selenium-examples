package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("bm@somemail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(2000);
		// every object may not have ID, className or name - Xpath and CSS preferred
		// alphanumeric ID may vary on every refresh - check
		// confirm the link object with anchor (a)
		driver.close();

	}

}
