package basicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollMethod {

	public static void main(String[] args) {
		
	WebDriver driver=Browser.launchBrowser("https://www.amazon.in");
	WebElement signInScroll = driver.findElement(By.xpath("//div[text()='Connect with Us']"));
		
	// here arguments[0] means the pase scroll is always in on top
	// scrollIntoView(true) means it be gett scrolldown until it find the webelement 
	// signInscroll is a webelemenet finded first and then asigned in executeScript()method
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", signInScroll);
		
	}
}
