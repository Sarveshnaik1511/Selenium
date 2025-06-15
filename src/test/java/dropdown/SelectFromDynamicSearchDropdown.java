package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basicAutomation.Browser;

public class SelectFromDynamicSearchDropdown {
	@Test
	public void selectFromDynamicSearchDropdown() throws InterruptedException {
		WebDriver driver = Browser.launchBrowser("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("table");
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='left-pane-results-container']//div[@class='s-suggestion-container']")));
		
		List<WebElement> suggestion= driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[@class='s-suggestion-container']"));
		
		for(int i=0;i<suggestion.size();i++) {
			if(suggestion.get(i).getText().equalsIgnoreCase("table fan for home"))
			suggestion.get(i).click();
		}
		
		
	}

}
