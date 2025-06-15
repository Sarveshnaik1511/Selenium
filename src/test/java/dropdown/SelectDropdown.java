package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basicAutomation.Browser;


public class SelectDropdown {
//	public static void main(String[] args) throws InterruptedException {
//	WebDriver driver=	Browser.launchBrowser("https://www.facebook.com");
//	
//	 WebElement createNewAccount= driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
//	
//	 createNewAccount.click();
//	 
//	// here we have used the Thread.sleep method to slow doen the exicution of selenium, mut there are other methods as well
//			Thread.sleep(3000);
//	 
//	 WebElement birthday = driver.findElement(By.xpath("//select[@id='day']"));
//	 
//	    // As the date of birth field has dropdowns, we have to use methods of select class 
//	    // Select class will accepts element of particular field as an argument in a constructor
//	    // and after that with the reference of select class, we will call the method of select class to select the dropdown options
//	    
//	 
//	 Select day= new Select(birthday);
//	 day.selectByValue("15");
//	 
//	 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//	    Select birthMonth =new Select(month);
//	    birthMonth.selectByIndex(10);
//	    
//	    WebElement year= driver.findElement(By.xpath("//select[@title='Year']"));
//	    Select birthYear =new Select(year);
//	    
//	    birthYear.selectByVisibleText("2000");
//	    driver.close();
//	   
//	}
	@Test
	public void sample() throws InterruptedException {
		WebDriver driver=	Browser.launchBrowser("https://www.facebook.com");
		
		 WebElement createNewAccount= driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		 createNewAccount.click();
		 
		// here we have used the Thread.sleep method to slow doen the exicution of selenium, mut there are other methods as well
				Thread.sleep(3000);
		 
		 WebElement birthday = driver.findElement(By.xpath("//select[@id='day']"));
		 
		    // As the date of birth field has dropdowns, we have to use methods of select class 
		    // Select class will accepts element of particular field as an argument in a constructor
		    // and after that with the reference of select class, we will call the method of select class to select the dropdown options
		    
		 
		 Select day= new Select(birthday);
		 day.selectByValue("15");
		 
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		    Select birthMonth =new Select(month);
		    birthMonth.selectByIndex(10);
		    
		    WebElement year= driver.findElement(By.xpath("//select[@title='Year']"));
		    Select birthYear =new Select(year);
		    
		    birthYear.selectByVisibleText("2000");
		    driver.close();
		   
		
	}
}
