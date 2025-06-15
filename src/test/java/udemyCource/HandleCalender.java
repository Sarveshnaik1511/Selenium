package udemyCource;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import basicAutomation.Browser;

public class HandleCalender {
	@Test
	public void selectDateAndVerify() {
		
		String monthNumber= "6";
		String date ="15";
		String year ="2027";
		
		String[] dataForAsertion = {monthNumber,date,year};
		
		WebDriver driver= Browser.launchBrowser("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		// here we have taken the year, date and month number from the given variable
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
	
		
		// compare the results with expected result
		
	List<WebElement> finalDate=	driver.findElements(By.xpath("//input[@inputmode=\"numeric\"]"));
	
	for(int i=0;i<finalDate.size();i++) {
		
		// bacically, into this web element, Value attribute has the date
		// it was divided into three elements for month, date and year
		// so this for loop will get all dates and compare
		String fdate =finalDate.get(i).getDomAttribute("value");
		System.out.println(fdate);
		
		
		// so to add assertions, i have assign the above date variable into one array called dataforassertion
		// and then i have compared
		
		Assert.assertEquals(fdate, dataForAsertion[i]);
	}
	
		
	}

}
