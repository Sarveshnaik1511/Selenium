package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicAutomation.Browser;

public class DynamicWebTableGetTableData {
	public static void main(String[] args) {
		WebDriver driver = Browser.launchBrowser("https://demo.guru99.com/test/web-table-element.php");
		WebElement tableBody = driver.findElement(By.xpath("//table//tbody//tr//td[1]"));

		String value = tableBody.getText();
		System.out.println(value);

		List<WebElement> currentPriseColumn = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		for (int i = 0; i < currentPriseColumn.size(); i++) {
			String values = currentPriseColumn.get(i).getText();
			System.out.println(values);
		}
	}

}
