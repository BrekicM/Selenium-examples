package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeAbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//app-root/div/header/div/div/div/div[2]/div[2]/a")).click();	// absolute path
		
		// relative path - from the current element
		
		// relative path is more preffered because if developer changes something on the page your absolute xpath might break
		
		
		
		
		
		//app-root/div/header/div/div/div/div[2]/div[2]/a
	}

}
