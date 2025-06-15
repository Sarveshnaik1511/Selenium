package udemyCource;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import basicAutomation.Browser;

public class BrokenLink {
	@Test
	public void automateBrokenLink() throws IOException, URISyntaxException {
		WebDriver driver = Browser.launchBrowser("https://rahulshettyacademy.com/AutomationPractice/#/");
		
		// broken link means the link which are not working, or when we click on link, its not getting open and throwing an error
		// we will get all the link and get their status code, if its in series of 200, this means its working
		// if its greater then 400 than its broken and not working
		
		String link= driver.findElement(By.xpath("//a[text()='SoapUI']")).getDomAttribute("href");
		
		System.out.println(link);
		
	
		// There is one method called openConnection from URL class of java
		// And openConnection method of URL class returns URLConnection
		// here we have converted the URI to url to use its methods
		// then we casted the HttpURLConnection
		
		  HttpURLConnection conn = (HttpURLConnection) new URI(link).toURL().openConnection();
		  conn.setRequestMethod("HEAD");
		  
		  // when we connect, we get the response
		  conn.connect();
		  
		  // here we have stored the specific response as status code
		  int responceCode=  conn.getResponseCode();
		  System.out.println(responceCode);
		  
		  // By using this methods, we can get the status response of all the links without clicking on it
		  
		
	}
	
	@Test
	public void getAllLinksAndValidate() throws MalformedURLException, IOException, URISyntaxException {
		WebDriver driver = Browser.launchBrowser("https://rahulshettyacademy.com/AutomationPractice/#/");
		List<WebElement> allIteams = driver.findElements(By.xpath("//li[@class='gf-li']//a"));
		
		// here we are getting the current url for base example, like http://website name
		// any href has only /contack or / name of endpoint or path parameter we can add the baseuri to it and perform further action
		String baseUrl =driver.getCurrentUrl();
        SoftAssert sf = new SoftAssert();
        
        
        
		for (int i = 0; i < allIteams.size(); i++) {
			String link = allIteams.get(i).getDomAttribute("href");
			
			//here we are validating then if the link doesnt contain http, i.e only end points or path parameters will be there
			// then we have added the http to the link we found
			if(!link.contains("http")) {
				link = new URI(baseUrl).resolve(link).toString();
			}

			HttpURLConnection conn = (HttpURLConnection) new URI(link).toURL().openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responceCode = conn.getResponseCode();
			System.out.println(responceCode);
			
			

			if (responceCode >= 400) {
				System.out.println("The link with text " + allIteams.get(i).getText()+ " is broken with code "+responceCode);
				sf.assertTrue(false);
			}
		}
		sf.assertAll();
	}

}
