package basicAutomation;
import java.io.File; 
import java.io.IOException; 

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot {
	
	@Test
	
	public void screenShot ()throws IOException {
		
	WebDriver driver=	Browser.launchBrowser("https://www.facebook.com");
		
				
				// getScreenShot method is not complete in TakesScreenshot interface
				// so we have to complete the method in the TakesScreenShot interface by upcasting with the help of reference of webDeiver Interface
				// OutputType.FILE argument will set the captured Screenshot as file Format which means raw format. 
				// We have file class where we can save the captured screenshot with the help of its reference.
	
	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	
	
				// As after the execution get over, the captured Screenshot will be vanished
				// So we have to save the captured screenshot in our permanent system location
				// for that we have to create a object of File class
				// and have to pass into the constructor the path of system folder where we want to save the captured screenshot
				// at the end of path we have to give the name and extension of captured screenshot
	
	File destination= new File("C:\\Users\\123\\Desktop\\Selenium ScreenShots\\facebook.png");
				
				
				// Now we have to copy the captured screenshot from the java memory
				// and have to save to the permanent memory
				// for this we have method as copy() of FileHandler class
				// this method will accept 2 arguments in it
				// That will be From where to copy and where to store. i.e source and destination 

	
	
	
	
	
	
	FileHandler.copy(source, destination);
	
	driver.navigate().to("https://www.amazon.com");
	
	File source2 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination2 = new File("C:\\\\Users\\\\123\\\\Desktop\\\\Selenium ScreenShots\\\\amazon.png");

	FileHandler.copy(source2, destination2);
	driver.close();
	
	}

}   
