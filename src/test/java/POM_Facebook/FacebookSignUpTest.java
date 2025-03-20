package POM_Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookSignUpTest {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.launchBrowser("https://www.facebook.com");
	
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(3000);
		
		FacebookSignUpPage facebookSignUpPage =new FacebookSignUpPage(driver);
		facebookSignUpPage.enterFirstname("sarvesh");
		facebookSignUpPage.enterSurname("naik");
		facebookSignUpPage.enterEmailAddress("sarvesh@gmai");
		facebookSignUpPage.enterNewPassword("password123");
		facebookSignUpPage.selectBirthDate("15");
		facebookSignUpPage.selectBirthMonth(10);
		facebookSignUpPage.selectBirthYear("2000");
		facebookSignUpPage.selectYourGender();
	
	}
}
