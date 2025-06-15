package Parametrization;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicAutomation.Browser;

public class FacebookLogin {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		WebDriver driver= Browser.launchBrowser("https://www.facebook.com");
		
		WebElement create = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		create.click();
		
		Thread.sleep(5000);
	
	    WebElement firstname =	driver.findElement(By.xpath("//input[@aria-label='First name']"));
	    WebElement surname = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
	    WebElement email = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
	    WebElement password = driver.findElement(By.xpath("//input[@aria-label='New password']"));
	    
	    String firstNameEntered = parametrization.getData("facebook", 1, 0);
	    firstname.sendKeys(firstNameEntered);
	    
	    String surnameEntered= parametrization.getData("facebook", 1, 1);
	    surname.sendKeys(surnameEntered);
	    
	    String emailEntered= parametrization.getData("facebook", 1, 2);
	    email.sendKeys(emailEntered);
	    
	    String passwordEntered = parametrization.getData("facebook", 1, 3);
	    password.sendKeys(passwordEntered);
	    
	    
	}

}
