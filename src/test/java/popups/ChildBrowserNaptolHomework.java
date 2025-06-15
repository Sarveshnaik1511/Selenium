package popups;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import basicAutomation.Browser;

public class ChildBrowserNaptolHomework {
	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=	Browser.launchBrowser("https://www.naaptol.com");
		
		WebElement search = driver.findElement(By.xpath("(//input[@placeholder='Find your favourite brand, product, model and many more'])[2]"));
		search.sendKeys("cooker");
		
		WebElement searchClick =driver.findElement(By.xpath("(//div/form/div//a)[2]"));
		searchClick.click();
		
		WebElement product1 = driver.findElement(By.xpath("//div[@id='productItem1']"));
		product1.click();
		WebElement product2 = driver.findElement(By.xpath("//div[@id='productItem2']"));
		product2.click();
		WebElement product3 = driver.findElement(By.xpath("//div[@id='productItem3']"));
		product3.click();
		
		
		Set<String> handles =  driver.getWindowHandles();
		
	    Iterator<String> i = handles.iterator();
	    
	    while(i.hasNext()) {
	    	// so until set has address of tabs, while condition will execute 
	    	String handle=i.next();
	    	// switchTo() method will switch the focus of selenium to different tabs.
	    	driver.switchTo().window(handle);  
	    	
//	    	System.out.println(driver.getTitle());
//	    	System.out.println(handle);
//	    	System.out.println(" ");
	    	
	    	// when we want specific address we use if condition and contains some part of the tab, here we used title name
	    	// so when selenuim gets specific title of particular address, loop will get break with help of break statement
	    	if(driver.getTitle().contains("Buy 5 + 3 Ltr Pressure")) {
	    		System.out.println("entered");
	    		WebElement shoping = driver.findElement(By.xpath("//span[@class='arrowNav'] "));
	    		
		    	shoping.click();
		    	
		    	Thread.sleep(1000);
		    	
		    	WebElement mobile =driver.findElement(By.xpath("//span[@class='catIconMenu mobile']"));
		    	mobile.click();
		    	Thread.sleep(1000);
		    	
		    	WebElement smartphone =driver.findElement(By.xpath("//a[@title='Smartphones']"));
		    	smartphone.click();
		    	
		    	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	
		    	File destination =new File("C:\\Users\\123\\Desktop\\Selenium ScreenShots\\naaptol.png");
		    	
		    	FileHandler.copy(source, destination);
		    	
		    	
	    	}
	    	Thread.sleep(2000);
	    	
	    	if(driver.getTitle().contains("Buy 4L + 3L + 2L + 1L ")) {
	    		System.out.println("entered");
	    		WebElement shoping = driver.findElement(By.xpath("//span[@class='arrowNav'] "));
	    		
		    	shoping.click();
		    	
		    	Thread.sleep(1000);
		    	
		    	WebElement mobile =driver.findElement(By.xpath("//span[@class='catIconMenu mobile']"));
		    	mobile.click();
		    	Thread.sleep(1000);
		    	
		    	WebElement smartphone =driver.findElement(By.xpath("//a[@title='Smartphones']"));
		    	smartphone.click();
		    	
		    	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	
		    	File destination =new File("C:\\Users\\123\\Desktop\\Selenium ScreenShots\\naaptol.png");
		    	
		    	FileHandler.copy(source, destination);
		    	
		    	break;
		    	
		    	
		    	
	    	}
	   
   	
	    
	    }
		
	}
}
