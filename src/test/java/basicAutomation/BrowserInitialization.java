package basicAutomation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserInitialization {
	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdriver.chrome.driver", "G:\\Automation softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		 
		WebDriver driver = new ChromeDriver();   //upcasting  
		
		driver.get("https://www.amazon.com");    // To open url in browser
		
		//Navigation nav = driver.navigate();    // navigate method returns Navigation Interface
		                                         // this is lengthy process so we  will use method chaining
		
		
		//nav.to("https://www.amazon.com");      // to method is used to open the url in browser same as get method.
		
	//	nav.back();        //helps to click back button present on browser
	//	nav.forward();     //helps to click on forward button present in browser
	//	nav.refresh();     // helps to click on refresh button on browser
		
		
		 // Method chaining
		//  if a method returns an interface then we can directly call the method of interface using method chaining 
		 
		// driver.navigate().to("https://www.flipkart.com");
		
		Thread.sleep(500);
		
		// used to stop the java execution for mentioned time
		// accepts sleep time in milliseconds. 1sec = 1000 millisecond
		// Thread means one execution
		// Sleep method will sleep java execution
		// we are slowing down the java process that's we are Interrupting the execution, so we need to throw InterruptedException  
		
		driver.navigate().back();
		
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(500);
		driver.navigate().refresh();
		
		
		String title  =driver.getTitle(); // getTitle method is used to get the title of the webpage
		System.out.println(title);
		
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.manage().window().maximize();
		
		// driver is a webdriver which has manage() method,
		// manage method returns Option interface,
		// Option Interface has method called window, which will return Window Interface
		// In window interface, we have method Maximize();
		
		driver.manage().window().minimize();
		driver.quit();
		
		}

}
