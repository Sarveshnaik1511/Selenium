package popups;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicAutomation.Browser;

public class AlertPopup {
	
	public static void main(String[] args) {
	
		WebDriver driver = Browser.launchBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		
		WebElement jsAlert =driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		jsAlert.click();
		
		
		// As selenium focus will be on Main page, we have to switch the focus of selenium to popup
		// for that we are using switchTo() method of webdriver interface
		// switchTo() method will return TargetLocator interface 
		// from targetlocator interface we have to use alert() method which will return alert interface.
		
		Alert a=driver.switchTo().alert();
		
		
		// we use accept() method of alert interface with the help of its reference to select Ok or confirm buttons on alert popups
		a.accept();
		
		WebElement jsconfirm= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		jsconfirm.click();
		
		//getText() method is used to get the text in the popup
		
		String jsConfirm =a.getText();	
		System.out.println(jsConfirm);
		
		
		// dismiss() method is used to select cancel button on popup
		a.dismiss();
		
		WebElement jsPrompt =driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		jsPrompt.click();
		
		//sendkeys() method of alert interface is used to send the inout to the prompt of popup
		a.sendKeys("sarvesh naik");
		a.accept();
		
		
}
}
