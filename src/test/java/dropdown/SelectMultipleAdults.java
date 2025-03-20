package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basicAutomation.Browser;

public class SelectMultipleAdults {
	
	@Test
	public void selectMultipleAdultsFromDropdown() {
		WebDriver driver = Browser.launchBrowser("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		
		int adult=1;
		while(adult<=3) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			adult++;	
		}
		int child=0;
		while(child<=3) {
			driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();
			child++;
		}
			
	}

}
