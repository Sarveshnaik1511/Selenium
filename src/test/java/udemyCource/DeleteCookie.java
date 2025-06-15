package udemyCource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCookie {
	
	@Test
	public void deleteCookies() {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); // this will delete all cookies
		driver.manage().deleteCookieNamed("cookie name"); // this will delete specific mentioned cookie
		driver.get("https://www.google.co.in/");
		driver.quit();
		
	}

}
