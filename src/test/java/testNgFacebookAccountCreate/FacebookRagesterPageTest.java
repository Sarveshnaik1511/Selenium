package testNgFacebookAccountCreate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookRagesterPageTest {
	
WebDriver driver;
	
	@BeforeTest
	public void openFacebook() {
	 driver=Browser.lounchBrowser("https://www.facebook.com");	
	}
	
	@Test
	public void loginTest() {
		FacebookLoginPage facebookLoginPage =new FacebookLoginPage(driver);
		facebookLoginPage.clickOnCreateNewAccount();
	}
	
	@Test
	public void regesterTest() throws InterruptedException {
		Thread.sleep(2000);
		FacebookRagesterPage facebookRagesterPage =new FacebookRagesterPage(driver);
		facebookRagesterPage.enterFirstName("rohit");
		facebookRagesterPage.enterLastName("sharma");
		facebookRagesterPage.enterEmail("rohitsharma45@gmail.com");
		facebookRagesterPage.reEnterEmailId("rohitsharma45@gmail.com");
		facebookRagesterPage.enterPassword("rohit@123");
		
		facebookRagesterPage.selectBirthdate("15");
		facebookRagesterPage.selectBirthMonth("11");
		facebookRagesterPage.selectBirthYear("2000");
		facebookRagesterPage.selectGenderMale();
		//facebookRagesterPage.clickOnSignUp();
	}

}
