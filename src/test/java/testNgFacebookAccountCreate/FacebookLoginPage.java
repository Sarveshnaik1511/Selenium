package testNgFacebookAccountCreate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	@FindBy (xpath = "//a[@rel='async']") private WebElement createAccountButton;
	
	
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCreateNewAccount() {
		createAccountButton.click();
	}

}
