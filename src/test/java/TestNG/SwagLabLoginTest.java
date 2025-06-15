package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabLoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openSwagLab() {
		driver= Browser.launchBrowser("https://www.saucedemo.com/");
	}
	
	@Test
	public void loginWithstandard_user() {
		SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
		swagLabLoginPage.enterUsername("standard_user");
		swagLabLoginPage.enterPassword("secret_sauce");
		swagLabLoginPage.clickLogin();
		
	}
	@Test
	public void loginWithlocked_out_user() {
		
		SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
		swagLabLoginPage.enterUsername("locked_out_user");
		swagLabLoginPage.enterPassword("secret_sauce");
		swagLabLoginPage.clickLogin();
	}
    public void loginWithperformance_glitch_user() {
		
		SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
		swagLabLoginPage.enterUsername("performance_glitch_user");
		swagLabLoginPage.enterPassword("secret_sauce");
		swagLabLoginPage.clickLogin();
	}
    @AfterMethod
    public void close() {
    	driver.close();
    }
    


}
