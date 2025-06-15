package testNGPersonalProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLoginTest {
	WebDriver driver;
	
	@BeforeMethod
	public void runBrowser() {
		driver= Browser.lounchBrowser("https://www.facebook.com/");
	}
	
	
	@Test
	public void testLogin() {
		FacebookLoginPage facebookLoginPage =new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailId("khannakaran1233@gmail.com");
		facebookLoginPage.enterPassword("Karan@123");
		facebookLoginPage.clickOnLolginButton();
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
	
	

}
