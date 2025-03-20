package basicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver =	Browser.launchBrowser("https://www.google.com");
	Thread.sleep(1000);
	driver.findElement(By.id("inputWrapper")).sendKeys("sarvesh");
	}

}
