package basicAutomation;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionPointClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chrome.driver", "G:\\Automation softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Dimension d =new Dimension(400,900);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		
		Point p =new Point(120,250);
		
		driver.manage().window().setPosition(p);
		
		Thread.sleep(1000);
		
		Point p1 =new Point(500,650);
		driver.manage().window().setPosition(p1);
		
		
		
	}
	
	
}
