package basicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpath {

	public static void main(String[] args) {
		
		System.setProperty("driver.chrome.driver", "G:\\Automation softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com");
		
		WebElement email =driver.findElement(By.xpath("//input[@type='text']"));   // Xpath by attribute 
		email.sendKeys("sarvesh@1234");
		
		WebElement password =driver.findElement(By.xpath("( //input[contains(@class,'_55r1')])[2]"));      //Xpath By index
		password.sendKeys("1234@123");
		
//		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));   // Xpath by text
//		login.click();
//		
//		WebElement ForgotPassword = driver.findElement(By.xpath("(//a[contains(@href,zODE2NDc5LCJj)])[2]")); // Xpath By Contains and index
//		ForgotPassword.click();
		
		WebElement CreateNewAccount =driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		CreateNewAccount.click();
		
		
		
	}
	
}
