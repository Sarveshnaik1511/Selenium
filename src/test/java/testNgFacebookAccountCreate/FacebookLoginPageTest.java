package testNgFacebookAccountCreate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class FacebookLoginPageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openFacebook() {
	 driver=	Browser.lounchBrowser("https://www.facebook.com");	
	}
	
	@Test
	public void loginTest() {
		FacebookLoginPage facebookLoginPage =new FacebookLoginPage(driver);
		facebookLoginPage.clickOnCreateNewAccount();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
