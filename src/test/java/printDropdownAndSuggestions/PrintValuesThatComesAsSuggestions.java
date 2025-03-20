package printDropdownAndSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintValuesThatComesAsSuggestions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.lounchBrowser("https://www.amazon.in");

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("gifts");
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofMillis(5000));
		
		// wait applied as element appears a bit late here
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='s-suggestion-container']")));

		List<WebElement> listOfSearch = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));

		for (int i = 0; i < listOfSearch.size(); i++) {
			// this will print values from 4th suggestion as index starts from 0
			if(i>=3 ) {
			String getValues = listOfSearch.get(i).getText();
			System.out.println(getValues);
		}
		}
	}

}
