package basicAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
	
	@FindBy (xpath = "//input[@placeholder='Username']") private WebElement userName;
	@FindBy (xpath = "//input[@placeholder='Password']") private WebElement password;
	@FindBy (xpath = "//input[@id='login-button']") private WebElement loginButton;
	
	public SwagLabLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUserName(String name) {
		userName.sendKeys(name);
	}
	
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	

}
