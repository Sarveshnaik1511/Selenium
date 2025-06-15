package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicAutomation.Browser;

public class ActionClassMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.launchBrowser("https://demo.guru99.com/test/simple_context_menu.html");

		// To performs actions from mouse and keyboard we use methods of action class
		// Firstly we have to create reference of Actions class 
		// and into its constructor, Pass the reference of webdriver
		Actions actions = new Actions(driver);

		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		// contextClick() Method is used to click right button of mouse
		// We have to pass the webelement of the particular field as an argument
		actions.contextClick(rightClick);

		// to perform the methods of actions class we use perform method after the
		// actions method
		actions.perform();
		
		Thread.sleep(2000);
		
		
		//this will click the element from right click and popup will appear
		WebElement clickOnrightClickOptions = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-cut']"));
		clickOnrightClickOptions.click();

		// Code to perform action on alert popup
		Alert a = driver.switchTo().alert();
		a.accept();

		Thread.sleep(3000);

		WebElement dClick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

		// its like perform doubleClick action dclick webElement
		actions.doubleClick(dClick);
		actions.perform();
		Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
		a1.accept();

	}

}
