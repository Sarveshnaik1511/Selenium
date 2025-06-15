package basicAutomation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Automation softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// to open link in browser
		driver.get("https://www.youtube.com/");
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		//after that i want to get to this url which will open video
		driver.get("https://www.youtube.com/watch?v=fGAW3gt_2CU");
		
		
		// this will stop java execution for 2 second
		Thread.sleep(2000);
		
		//  navigate back method will get me back from the video
		driver.navigate().back();
		
		
		// this will stop java execution for 2 second
		        Thread.sleep(2000);
				driver.navigate().refresh();
				
		// navigate to another video in youtube
				driver.navigate().to("https://www.youtube.com/watch?v=vtEssHoKBDk");
				
				Thread.sleep(2000);
		
		// navigate forward mathod will take me again to the video 
		driver.navigate().back();
		driver.navigate().forward();
		
		// this will stop java execution for 2 second
				Thread.sleep(2000);
			driver.navigate().refresh();
			
		// this will print the current page url
		String url =driver.getTitle();
		System.out.println(url);
		
		
		
		
		
		
		
		
		
		
		}

}
