package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://salesforce.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.dropdown-toggle.disabled")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("userName");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("userName");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[type='password'")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='Login'")).click();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		// //tagName[@attribute='value']  -  xpath
		// tagName[attribute='value']  -  cssselector - [attribute='value'] - can be also formed this way, or
		//	tagName#id - also css if there are these parameters present (only if you have id)
		// tagName.classname - also one more for css - also works without tagName f/e input#password -> #password
		// xpath - regular expression (when attributes change, must find a constant in a attribute) - //tagName[contains(@attribute,'value')]
		// tagName[attribute*='value'] - css regular expression - input[name*='username']
		// xpath can also be written based on parent tag - when you dont have any unique attributes to identify the object
		// parent - child - define xpath for parent uniquely, then traverse to child via hiararchy with the help of / and tag names
	}

}
