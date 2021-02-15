package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//li[text()=' Appium ']")).click();
		driver.findElement(By.xpath("//ul[class='responsive-tabs__list']/li[1]/following-sibling::li[1]")).click();
		driver.findElement(By.xpath("//*[@id='tablist1-tab3']/parent::ul")).getAttribute("role");
		

	}

}
