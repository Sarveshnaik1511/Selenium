package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicAutomation.Browser;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.launchBrowser("https://www.globalsqa.com/demo-site/draganddrop/");


		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		
		// findelements method is used to find multiple paths of similar type
		// and after finding, It will get stored in List
		// list is a collection interface
		// List store both homogeneous and heterogeneous data
		// List follows insertion order
		// we can get side of list using size() method
		// we can get data from list by using its Index with help of method called get()
		List<WebElement> dragImg = driver.findElements(By.xpath("//li[contains(@class,'i-widget-content ui-corner-')]"));
		
		WebElement dropImg = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions actions = new Actions(driver);
		
		for(int i=0;i<dragImg.size();i++) {
			Thread.sleep(500);
			
			// here get() method will get the value of ith index and it will drop into the DropImg
			actions.dragAndDrop(dragImg.get(i), dropImg);
			actions.perform();
		}
		Thread.sleep(2000);
		
	List<WebElement> recycle =	driver.findElements(By.xpath("//a[@title='Recycle this image']"));
	
	for(int i=0;i<recycle.size();i++) {
		
		Thread.sleep(500);
		
		//here get method will get the image of ith index and it will click on it
		recycle.get(i).click();
		
	}
	
	}
}
