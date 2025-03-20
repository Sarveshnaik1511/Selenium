package webTable;

import basicAutomation.Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicWebTableGetHeaders {
	public static void main(String[] args) {

		WebDriver driver = Browser.launchBrowser("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement> tableHeaders = driver.findElements(By.xpath("//table//thead//tr//th"));

		for (int i = 0; i < tableHeaders.size(); i++) {

			String headers = tableHeaders.get(i).getText();
			System.out.println(headers);
		}

	}

}
