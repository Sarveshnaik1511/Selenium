package basicAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("driver.chrome.driver", "G:\\Automation softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver = new ChromeDriver(); 
			driver.get("https://www.facebook.com");
			
			WebElement email=driver.findElement(By.name("email"));    // By name
			email.sendKeys("sarvesh@gmail.com");
//			
//			WebElement password=driver.findElement(By.id("pass"));   // By id
//			password.sendKeys("1234far");
//			
//			Thread.sleep(3000);
			
//			WebElement login= driver.findElement(By.tagName("button"));  // By tagname
//			login.click();
			
//			WebElement forgotPassword =driver.findElement(By.linkText("Forgotten password?"));  // By linktext
//			forgotPassword.click();
			
//			WebElement createNewAccount=driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));   // By Css selector
//			createNewAccount.click();
//			
//			WebElement email =driver.findElement(By.className("_6lux"));  // By class Name
//			email.sendKeys("sarvesh@gmail.com");
			
			
			
	}
	
}
