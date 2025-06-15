package basicAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FreeEbooksDemoSite {
	public static void main(String[] args) {
	WebDriver driver =	Browser.launchBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
	
	driver.findElement(By.xpath("(//a[text()='Free Ebooks'])[1]")).click();
	
List<WebElement> ebookList =	driver.findElements(By.xpath("(//div//div//div//div[@class='sixteen columns'])[3]//ul//li"));

  for(int i=0;i<ebookList.size();i++) {
String list =	  ebookList.get(i).getText();
System.out.println(list);
  }
	}

}
