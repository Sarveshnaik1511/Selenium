package printDropdownAndSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSearchSuggestions {
	public static void main(String[] args) {
		WebDriver driver = Browser.lounchBrowser("https://www.flipkart.com");

		Actions actions = new Actions(driver);

		WebElement loginButton = driver.findElement(By.xpath("//span[text()='Login']"));
		actions.moveToElement(loginButton);
		actions.perform();

		// if we take the locator or xpath of whole container, then we can only print in
		// straight order and cannot print in reverse
		// List<WebElement> valuesDiv =
		// driver.findElements(By.xpath("//ul[@class='_3YjYK7 ecs1XG']"));

		List<WebElement> values = driver.findElements(By.xpath("//ul[@class='_3YjYK7 ecs1XG']//li"));

		// we can also print in this by defining calue of get as 0
//		String print = values.get(0).getText();
//		System.out.println(print);

		System.out.println(" ");

		for (int i = values.size() - 1; i >= 0; i--) {
			String printinReverse = values.get(i).getText();
			System.out.println(printinReverse);
		}
	}

}
