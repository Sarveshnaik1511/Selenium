package udemyCource;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basicAutomation.Browser;

public class WebTableSorting {
	@Test
	public void sortWebTableAndCompare() {
		
		WebDriver driver = Browser.launchBrowser("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on fruit name header to sort the items
		driver.findElement(By.xpath("(//thead//tr//th)[1]")).click();
		
		// capture all webelements to a list
	List<WebElement> listOfItems=	driver.findElements(By.xpath("//tbody//tr//td[1]"));
	
	// capture the text of all the webelements  (this will be the original list from the website)
	// this will be a sorted list as we clicked on the fruit name header to sort it
	
	List<String> originalSortedList=	listOfItems.stream().map(i->i.getText()).collect(Collectors.toList());
	
	// again we will sort with the help of java to check our sorted list and the website sorted list matching or not
	
	List<String> sortedList= originalSortedList.stream().sorted().collect(Collectors.toList());
	
	
	// using assertions we are checking their sorted list vs our sorted list
	Assert.assertTrue(originalSortedList.equals(sortedList));
	
	
	}

}
