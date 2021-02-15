package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();	// Selenium goes to the page and checks all <a> elements with title attribute containing 'Sign in'
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("userName");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
	}

}
