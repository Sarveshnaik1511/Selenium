package udemyCource;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotAndDelete {
	
	@Test
	public void takeScreenShot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); // this will delete all cookies
		driver.manage().deleteCookieNamed("cookie name"); // this will delete specific mentioned cookie
		driver.get("https://www.google.co.in/");
		
	File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File("/Users/sarveshnaik/Documents/sarvesh cource/sarvesh naik - Copy/Selenium/Screenshots/screenshot.png"));
		
	}

}
