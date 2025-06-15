package udemyCource;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basicAutomation.Browser;

public class ChildBrowserToParentBrowser {

	@Test
	public void childBrowserToParentBrowser() {
		// here i will switch to anther tab and copy the email id from that tab
		// then come back to main page and paste the email id
		
		WebDriver driver = Browser.launchBrowser("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		
		// switching from parent to child browser
		
		Set<String> windows = driver.getWindowHandles();   // [Parent, Child]
		
			Iterator<String> it=	windows.iterator();
			// first we will get address if parent browser
			String parent = it.next();
			// secondly we will get address of child browser
			String child = it.next();
			
			
			// using this methpd, we have switched from parent to child browser
			
			driver.switchTo().window(child);
			
			// here we have trimmed the email address from whole string and saved it in one variable
			// to fetch the email from whole string, first add the break point to the line where the xpath is available to fetch the string value
			// then run the script in debug mode
			// then right click once the script stoped to the break poing and click on watch
			// click on add new expression and add the xpath directly anc click enter
			// if its already available, then we can try directly there
			// then edit the xpath according to the need
			
			
			String email= driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0].trim();
			
			// we have switched back to parent browser and sended the email id into the input field
			
			driver.switchTo().window(parent);
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		
		
	}
}
