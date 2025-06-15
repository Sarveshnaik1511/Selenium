package udemyCource;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HandleHttpsCertification {
	@Test
	public void handleHttpsCertification() {
		
		// to handle https certification, we need to create object of options class 
		// we have to all its method called setAcceptInsecureCerts and pass boolean value as true into its arguments
		// also pass the reference of options to the Browser driver argument
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
		
	}

}
