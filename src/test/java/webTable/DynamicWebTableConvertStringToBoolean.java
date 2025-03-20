package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicAutomation.Browser;

public class DynamicWebTableConvertStringToBoolean {
	public static void main(String[] args) {
	WebDriver driver =	Browser.launchBrowser("https://demo.guru99.com/test/web-table-element.php");
	
	List<WebElement> prices =driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[4]"));
	for (int i=0;i<prices.size();i++) {
	String values =	prices.get(i).getText();
	
     double price =	Double.parseDouble(values);
     System.out.println(price);
   
	}
	
	
	
	
	}

}
