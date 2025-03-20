package testNGPersonalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	
	@FindBy (xpath="//input[@id='email']") private WebElement emailId;
	@FindBy (xpath = "//input[@id='pass']") private WebElement password;
	@FindBy (xpath = "//button[@name='login']") private WebElement logIn;
	
	
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailId(String email) {
		emailId.sendKeys(email);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLolginButton() {
		logIn.click();
	}

}
