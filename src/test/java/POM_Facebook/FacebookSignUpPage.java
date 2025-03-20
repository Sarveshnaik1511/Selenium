package POM_Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpPage {
	
	@FindBy (xpath = "//input[@placeholder='First name']") private WebElement firstname;
	@FindBy (xpath = " //input[@aria-label='Surname']") private WebElement surname;
	@FindBy (xpath = "//input[@name='reg_email__']") private WebElement emailAddress;
	@FindBy (xpath = "//input[@autocomplete='new-password']") private WebElement newPassword;
	@FindBy (xpath = "//select[@name='birthday_day']") private WebElement birthDate;
	@FindBy (xpath = "//select[@id='month']") private WebElement birthMonth;
	@FindBy (xpath = "//select[@title='Year']") private WebElement birthyear;
	@FindBy (xpath = "//label[text()='Male']") private WebElement selectGender;
	
	
	public FacebookSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterFirstname(String name) {
		firstname.sendKeys(name);
	}
	
	public void enterSurname(String Surname) {
		surname.sendKeys(Surname);
	}
	public void enterEmailAddress(String email) {
		emailAddress.sendKeys(email);
	}
	public void enterNewPassword(String pass) {
		newPassword.sendKeys(pass);
	}
	
	public void selectBirthDate(String bDate) {
		Select date =new Select(birthDate);
		date.selectByValue(bDate);
	}
	public void selectBirthMonth(int bMonth) {
		Select month =new Select(birthMonth);
		month.selectByIndex(bMonth);
	}
	public void selectBirthYear(String byear) {
		Select year =new Select(birthyear);
		year.selectByVisibleText(byear);
	}
	public void selectYourGender() {
		selectGender.click();
	}
	
	
	
}
