package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://salesforce.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		// class names should not have spaces - if there are spaces, selenium will not accept the name
		driver.findElement(By.id("username")).sendKeys("myUsername");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		//driver.findElement(By.cssSelector("#forgot_password_link")).click();
		Thread.sleep(2000);
		driver.close();
		
		// selenium scans from top left to the right, moving on down scanning all objects, if there are two objects
		// with f/e same id, it will select the first one it finds
		// generate xpath from browser tools
		// double quotes inside double quotes is not accepted in Java, xpath can be defined in a number of ways
		// xpath starting from /html/... is usually not good, switch browser to get correct one?
		// css is easily found in firefox, but can also be manually selected in chrome
		// $x("<xpathhere>") - for validating xpaths in browser console - use ' or \"
		// $("<csshere>") - for validating css in browser console
		// xpath - path from top most element <html> on the page to the currently selected element
		// <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Е-адреса или број телефона" autofocus="1" aria-label="Е-адреса или број телефона">
		// input element with multiple attributes
		// attribute class with a value of "inputtext _55r1 _6luy"
		// custom xpath - //tagname[@attribute='value'] - general instruction for making custom xpaths
		// <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" data-testid="royal_login_button" type="submit" id="u_0_h">Пријавите се</button>
		// //button[@name='login']
		// you can use * to select any element with a defined attribute and value f/e //*[@name='login']
		// tagname[attribute='value'] - for css
	}

}
