package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_SwagLab.Browser;
import POM_SwagLab.SwagLabLoginPage;

public class AddToCart {
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void openSwagLab() {
		driver = Browser.lounchBrowser("https://www.saucedemo.com/");
	}

	@Test
	public void AddtoCart() {

		SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);

		swagLabLoginPage.enterUserName("performance_glitch_user");
		swagLabLoginPage.enterpassword("secret_sauce");
		swagLabLoginPage.clickOnLoginButton();
		swagLabLoginPage.clickOnAddToCartButton();

	}

	@AfterMethod
	public void close() {
		driver.close();
	}
}
