package udemyCource;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basicAutomation.Browser;





public class ScrollInWindowAndTable {
	@Test (enabled = false)
	public void scroll() {
		WebDriver driver = Browser.launchBrowser("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.xpath("(//table[@id='product'])[2]"));
		
		// below this is one method of scroll which i used to do earlier 
		// ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", table);
		
		// this is new think i learn
		
		// firstly, initilize javascript ececuter with reference of driver
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// below method accepts two arguments but 2nd arguments is optional
		// to write a script inside it as an argument, we can firstly try the script in console of website
		// window.scrollBy(0,500)  - here we can try the coordinate according to the match
		
		// so this method will scroll the screen to the coordinate you provided
		js.executeScript("window.scrollBy(0,400)");
		
			
		
	}
	
	@Test(enabled = false)
	public void scrollIntoTheTable() {
		WebDriver driver = Browser.launchBrowser("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		// to get into the table, we need to call DOM object
		// Document.querySelector()  - this is the method that we will require to get into the particular element
		// like xpath or css selecter, in javascript we have QuerySelector.
		// into it we have to pass the the locator of element where we have to focus (can use class in double cote)
		
		
		 // Note use . to select class
		// document.querySelector('.tableFixHead').scrollTop=1000    -- for vertical scroll
		// document.querySelector('.tableFixHead').scrollLeft=1000   -- for horizontal scroll
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=1000 ");   
				
		
	}
	
	@Test
	public void countSumOfNumbersFromScrollableTable() {
		
		WebDriver driver = Browser.launchBrowser("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,400)");
		List<WebElement> amounts =driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		
		// to get the sum of all the amounts
		int sum=0;
		
		for(int i=0;i<amounts.size();i++) {
			
			sum=sum+Integer.parseInt(amounts.get(i).getText());
		}
		System.out.println(sum);
		
		//assertion to validate the total amount
		
		int totalValue =Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum,totalValue);

		
		
	}

}
