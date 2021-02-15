package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("user01");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("pass01");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		// //tagname[@attribute='value']	xpath
		//	tagname[attribute='value']		css

	}

}
