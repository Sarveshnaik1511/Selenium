package basicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementsMethods {
	
	public static void main(String[] args) throws InterruptedException {
		// we have created a user defined method named launchBrowser in browser class and we have used that here to initialization browser directly
//		WebDriver driver = Browser.launchBrowser("https://demo.guru99.com/test/radio.html");
//		
//		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));		
//		radio.click();
//		
//		boolean b=radio.isSelected();
//		System.out.println(b);
//		
//		boolean b1=radio.isDisplayed();
//		System.out.println(b1);
//		
//		
//		WebElement checkbox = driver.findElement(By.xpath("(//strong)[2]"));
//		String checkBox =checkbox.getText();
//		System.out.println(checkBox);
		
		
		
		
		
		// WebElement dropdown Methods
		
		WebDriver driver2=Browser.launchBrowser("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement products =driver2.findElement(By.xpath("//select[@id='first']"));
		Thread.sleep(2000);
		Select s =new Select(products);
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		s.selectByValue("Microsoft");
		
		Thread.sleep(2000);
		s.selectByVisibleText("Yahoo"); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.close();
		
//		// check for isEnabled Method
//		
//		WebDriver driver1=Browser.launchBrowser("https://www.redbus.in/");
//		
//		WebElement account = driver1.findElement(By.xpath("(//span[@class='name_rb_secondary_item'])[2]"));
//		account.click();
//		
//		WebElement loginSignup = driver1.findElement(By.xpath("//span[text()='Login/ Sign Up']"));
//		loginSignup.click();
//		
//		WebElement mobileField =driver1.findElement(By.xpath("//div[@class='mobileInputContainer clearfix contact-box']"));
//		mobileField.sendKeys("1231231231");
//		
//		WebElement robot =driver1.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])[2]"));
//		robot.click();
//		
//		WebElement generateOtp =driver1.findElement(By.xpath("//div[@id='otp-container']"));
//		boolean result=generateOtp.isEnabled();
//		System.out.println(result);
	}
}
