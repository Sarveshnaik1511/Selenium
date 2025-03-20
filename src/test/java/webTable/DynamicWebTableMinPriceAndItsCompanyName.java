package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicAutomation.Browser;

public class DynamicWebTableMinPriceAndItsCompanyName {
	public static void main(String[] args) {

		WebDriver driver = Browser.launchBrowser("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement> currentPrice = driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[4]"));
		List<WebElement> companyName = driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[1]"));

		double max = 0;

		for (int i = 0; i < currentPrice.size(); i++) {
			String price = currentPrice.get(i).getText();
			double prices = Double.parseDouble(price);

			if (prices > max) {
				max = prices;
			}

		}
		double min = max;
		int index = 0;
		for (int i = 0; i < currentPrice.size(); i++) {
			String pricesForMin = currentPrice.get(i).getText();
			double price1 = Double.parseDouble(pricesForMin);
			if (price1 < min) {
				min = price1;
				index = i;
			}
		}
		String nameOfCompany = companyName.get(index).getText();
		System.out.println("Minimum current price is :"+min+" and its company name is: "+nameOfCompany);

	}

}
