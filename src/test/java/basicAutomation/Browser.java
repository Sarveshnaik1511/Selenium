package basicAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
//	public static WebDriver launchBrowser(String url) {
//		
//	//	System.setProperty("webdriver.chrome.driver", "G:\\Automation softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//	
//		WebDriver driver = new ChromeDriver();     	
//		driver.get(url);
//		driver.manage().window().maximize();
//		return driver;
//		
//	}
	
	public static  WebDriver launchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		 
		WebDriver driver = new ChromeDriver();   //upcasting  
		
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	}
	

}
