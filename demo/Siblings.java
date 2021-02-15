package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement practice = driver.findElement(By.xpath("//body/header/div/button"));
		System.out.println(practice.getText());
		WebElement login = driver.findElement(By.xpath("//body/header/div/button/following-sibling::button[1]"));
		System.out.println(login.getText());
		WebElement signup = driver.findElement(By.xpath("//body/header/div/button/following-sibling::button[2]"));
		System.out.println(signup.getText());
		driver.findElement(By.xpath("//body/header/div/button/parent::div")).click(); // not the best example but parent
		
		// you can only traverse back via xpath, not css - and this is the only difference
		
		driver.close();

	}

}
