package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicAutomation.Browser;

public class ChildBrowserPopup {

	public static void main(String[] args) {
	WebDriver driver=	Browser.launchBrowser("https://www.naukri.com/");
	
	
	// child browser means when we give action or click any function from main page and it get open in new Tab.
	// That tab is known as child browser and it is same like any other tabs of browser
	
	WebElement services = driver.findElement(By.xpath("//div[text()='Services']"));
	services.click();
	
	String getTitle =driver.getTitle();  
	System.out.println(getTitle);
	// here we will get the title of main page because the focus of selenium has not shifted to child browser
	// we have to shift the focus of selenium  from main page to child browser page
	// for that we have method called getWindowsHandles of webdriver which will store the addresses of all tabs in set of String set<String>
	
	
	String handle = driver.getWindowHandle();
	// getWindowHandle() method is is used to get the address of current webpage
	// getWindowHandles() method is used to get the address of every opened webpage in different Tabs
	
	Set<String> handles = driver.getWindowHandles(); 
	// set is an collection interface
	// set stores heterogeneous data. i.e, it store data of multiple datatypes
	// we need to define generic to make it homogeneous . eg. set<String>. here we have made it store String data. 
	// set only allows unique values
	// set doesn't maintain insertion order. i.e value stored inside set are not maintained in sequence or order.
	// Set doesn't have Index value. set stores data randomly 
	
	Iterator<String> i= handles.iterator();
	System.out.println(i.next());
	System.out.println(i.hasNext());
	System.out.println(i.next());
	
	// To extract the data from the set we have a method called iterator() which will return Iterator interface
	// then we use one method from Iterator interface called next(); which give us data from the set
	// we have String generic data, so next method will give String type data
	// Scene set doen't follow sequence and it doesn't have sequence so to check whether set has more data we use one method,
	// it called hasNext() method, so it will check that the set has data or not
	// hasNext() method return boolean value, so if the data is available in set, it will return true and the next() method will get execute.
	
	// we use loop to get the address of webpage;
	
	while(i.hasNext()) {
		System.out.println(i.next());
	} 
	
	}
	
		
}
