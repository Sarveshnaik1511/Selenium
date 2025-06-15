package POM_SwagLab;

import org.openqa.selenium.WebDriver;

public class AddToCartTest {
	public static void main(String[] args) {
	WebDriver driver =	Browser.lounchBrowser("https://www.saucedemo.com/");
	
	SwagLabLoginPage swagLabLoginPage =new SwagLabLoginPage(driver);
	
	swagLabLoginPage.enterUserName("performance_glitch_user");
	swagLabLoginPage.enterpassword("secret_sauce");
	swagLabLoginPage.clickOnLoginButton();
	swagLabLoginPage.clickOnAddToCartButton();
		
	}

}
