package popups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basicAutomation.Browser;
public class HiddenDivisionPopup {
		
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.launchBrowser("https://www.facebook.com");
		WebElement create =driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
		
		create.click();
		
		// Hidden Division popups appears on screen and they have properties and features
		// we can inspect the hidden division popups
		// sometimes these popups make delay in appearing on screen 
		// selenium speed is very fast and for this reason selenium sometime doesnt detects these popups 
		// so we have to slow down the selenium speed so that it can detect the popup
		
		// here we have used the Thread.sleep method to slow doen the exicution of selenium, mut there are other methods as well
		Thread.sleep(3000);
		
	    WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First name']"));
	    firstname.sendKeys("Sarvesh");
	    
	    WebElement lastname =driver.findElement(By.xpath("//input[@aria-label='Surname']"));
	    lastname.sendKeys("Naik");
	    
	    WebElement mobile= driver.findElement(By.xpath("//input[@name='reg_email__']"));
	    mobile.sendKeys("9587456582");
	    
	    WebElement newPass= driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
	    newPass.sendKeys("facebook1234");
	    
	    
	    // As the date of birth field has dropdowns, we have to use methods of select class 
	    // Select class will accepts element of particular field as an argument in a constructor
	    // and after that with the reference of select class, we will call the method of select class to select the dropdown options
	    
	    WebElement birthday= driver.findElement(By.xpath("//select[@name='birthday_day']"));
	    
	    Select day =new Select(birthday);
	    day.selectByValue("15");
	     
	    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    Select birthMonth =new Select(month);
	    
	    birthMonth.selectByIndex(10);
	    
	    WebElement year= driver.findElement(By.xpath("//select[@title='Year']"));
	    Select birthYear =new Select(year);
	    
	    birthYear.selectByVisibleText("2000");
	    
	    WebElement gender= driver.findElement(By.xpath("//label[text()='Male']"));
	    gender.click();
	    
	    //driver.close();
	    
	}
	
}
