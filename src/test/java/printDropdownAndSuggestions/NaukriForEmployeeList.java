package printDropdownAndSuggestions;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukriForEmployeeList {
	public static void main(String[] args)   {
		WebDriver driver = Browser.lounchBrowser("https://www.naukri.com");
		Actions actions =new Actions(driver);

		WebElement hoverToEmployee = driver.findElement(By.xpath("//div//li[@class='nI-gNb-foremp nI-gNb-menuItems']//a[@class='nI-gNb-menuItems__anchorDropdown']"));
		actions.moveToElement(hoverToEmployee);
		actions.perform();
		
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nI-gNb-dropdown undefined nI-gNb-dropdown--expand nI-gNb-For employers']//ul//li//a//div")));
		
		List<WebElement> forEmployeeList = driver.findElements(By.xpath("//div[@class='nI-gNb-dropdown undefined nI-gNb-dropdown--expand nI-gNb-For employers']//ul//li//a//div"));
		
	
		
		for (int i = 0; i < forEmployeeList.size(); i++) 
		{
			String print = forEmployeeList.get(i).getText();
			System.out.println(print);
		}

	}

}
