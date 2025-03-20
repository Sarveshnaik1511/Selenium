package printDropdownAndSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GetAndPrintValuesFromDropdown {
	public static void main(String[] args) {

		WebDriver driver = Browser
				.lounchBrowser("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		WebElement select = driver.findElement(By.xpath("//select[@id='first']"));

		Select dropdownValues = new Select(select);
		// get values from dropdown
		List<WebElement> values = dropdownValues.getOptions();

		// print values from dropdown from last to first
		for (int i = values.size() - 1; i >= 0; i--) {
			WebElement options = values.get(i);
			System.out.println(options.getText());

			// or
//	String print =	values.get(i).getText();
//	System.out.println(print);
		}

	}

}
