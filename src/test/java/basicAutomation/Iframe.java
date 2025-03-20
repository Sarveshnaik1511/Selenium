package basicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe {
	public static void main(String[] args) {
	WebDriver driver=	Browser.launchBrowser("https://demo.automationtesting.in/Frames.html");
	
	// iframe is an HTML element used to embed another HTML document within the current document.
	// It allows you to display content from another source (like a webpage or a video) directly within your webpage.
	// external ads of another website in current website 
	
	// Selenium cannot directly focus on iframes, so we cannot directly perform action on the elements present on the iframe.
	// So we have to switch the focus of selenium to the frame.

	// we can switch the focus by this methods
	  //driver.switchTo().frame("singleframe");   // by ID argument
	
	// driver.switchTo().frame(0);   // by  Index Argument. Index means index of iframe . search //Iframe and we will have to select the index
	
	
	// WebElement argument, so we have to create a webElement by findElement mentod and using Xpath of it
	// and then add the referance of it in frame method a an argument
	
	WebElement frames = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
	
	 driver.switchTo().frame(frames);  // By WebElement argument
	 //SwitchTo() method returns TargetLocator Interface, which has method called frame.
	 // into the frame method we give id or index or webElement as an argument.
	 
	WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
	input.sendKeys("Sarvesh");
	
	//defaultContent method will switch the focus of selenium from iframe to main page
	driver.switchTo().defaultContent();
	
	
	// we can have multiple iframes, So we have to switch the focus of selenium to main iframe,
	// then from main iframe to sub iframe and then sub iFrame to its sub iframe and it goes on to the final element.
	
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	//without saving the webElement we can perform the action as we did above.
	
	WebElement mainIFrame = driver.findElement(By.xpath("(//iframe)[2]"));
	driver.switchTo().frame(mainIFrame);
	
	WebElement innerFrame =driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	
	
	driver.switchTo().frame(innerFrame);
	
	WebElement text =driver.findElement(By.xpath("//input[@type='text']"));
	text.sendKeys("Sarvesh naik");
	
	
	
	}

}
