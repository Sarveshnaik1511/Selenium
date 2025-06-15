package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
	
	@FindBy (xpath ="//input[@placeholder='Username']") private WebElement username;
	@FindBy (xpath ="//input[@placeholder='Password']") private WebElement password;
	@FindBy (xpath = "//input[@id='login-button']") private WebElement loginButton;
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement addToCart;
	
	
	public SwagLabLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String name) {
		username.sendKeys(name);
	}
	
	public void enterPassword(String pass) {
		
		password.sendKeys(pass);
	}
	public void clickLogin() {
		loginButton.click();
	}
	public void clickAddtocart() {
		addToCart.click();
	}
	

}
