package testNgFacebookAccountCreate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookRagesterPage {
	
	@FindBy (xpath = "//input[@placeholder='First name']") private WebElement firstname;
	@FindBy (xpath = "//input[@aria-label='Surname']") private WebElement lastname;
	@FindBy (xpath = "//input[@aria-label='Mobile number or email address']") private WebElement email;
	@FindBy (xpath = "//input[@aria-label='Re-enter email address']") private WebElement reEnterEmail;
	@FindBy (xpath = "//input[@aria-label='New password']") private WebElement password;
	@FindBy (xpath = "//select[@aria-label='Day']") private WebElement birthdate;
	@FindBy (xpath = "//select[@aria-label='Month']") private WebElement birthmonth;
	@FindBy (xpath = "//select[@aria-label='Year']") private WebElement birthyear;
	@FindBy (xpath = "//label[text()='Male']") private WebElement maleGender;
	@FindBy (xpath = "//label[text()='Female']") private WebElement femaleGender;
	@FindBy (xpath = "//label[text()='Custom']") private WebElement custom;
	@FindBy (xpath = "//select[@name='preferred_pronoun']") private WebElement selectPronoun;
	@FindBy (xpath = "//button[@name='websubmit']") private WebElement signUp;
	
	
	 public FacebookRagesterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	 }
	 public void enterFirstName(String name) {
		 firstname.sendKeys(name);
	 }
	 public void enterLastName(String lName) {
		 lastname.sendKeys(lName);
	 }
	 public void enterEmail(String emailId) {
		 email.sendKeys(emailId);
	 }
	 public void reEnterEmailId(String reEmail) {
		 reEnterEmail.sendKeys(reEmail);
	 }
	 public void enterPassword(String pass) {
		 password.sendKeys(pass);
	 }
	public void selectBirthdate(String day) {
		Select birthday =new Select(birthdate);
		birthday.selectByValue(day);
	}
	public void selectBirthMonth(String month ) {
		Select birthMonth =new Select(birthmonth);
		birthMonth.selectByValue(month);
	}
	public void selectBirthYear(String year) {
		Select birthYear =new Select(birthyear);
		birthYear.selectByValue(year);
	}
	public void selectGenderMale() {
		maleGender.click();
	}
	public void SelectGenderFemail() {
		femaleGender.click();
	}
	public void selectCustom() {
		custom.click();
	}
	public void clickOnSignUp() {
		signUp.click();
	}
	public void selectPronounOption(String pronounValue) {
		Select pronoun =new Select(selectPronoun);
		pronoun.selectByValue(pronounValue);
	}
}
