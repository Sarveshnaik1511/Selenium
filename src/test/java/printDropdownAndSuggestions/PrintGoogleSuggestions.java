package printDropdownAndSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintGoogleSuggestions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.lounchBrowser("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("best cars");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000)) ;
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='mkHrUc']//div//div//ul//li")));
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='mkHrUc']//div//div//ul//li"));

		for (int i = 0; i < suggestions.size(); i++) {
			String print = suggestions.get(i).getText();
			System.out.println(print);
		}
		
		System.out.println(" ");
		
		for(int i=suggestions.size()-1;i>=0;i--) {
	String reversePrint =		suggestions.get(i).getText();
	System.out.println(reversePrint);
		}
	}

}
