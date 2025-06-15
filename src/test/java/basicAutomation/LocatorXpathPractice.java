package basicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathPractice {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Automation softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		WebElement grocery=driver.findElement(By.xpath("(//div[@class='YBLJE4'])[1]"));
		
		grocery.click();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		
		WebElement pincode = driver.findElement(By.xpath("//input[@title=\"Enter pincode\"]"));
		pincode.sendKeys("416512");
		
//		WebElement location =driver.findElement(By.xpath("//button[@class='QqFHMw UhdyNX M5XAsp']"));
//		location.click();
		
		WebElement login =driver.findElement(By.xpath("//a[contains(@href,'/account/login?ret=/grocer')]"));
		login.click();
		
		Dimension d= new Dimension(1200,720);
		driver.manage().window().setSize(d);
		
		Thread.sleep(1000);
		
		Point p =new Point(120, 560);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(1000);
		
		Point p1 =new Point(120, 160);
		driver.manage().window().setPosition(p1);
		
		
		
		
	}
}
