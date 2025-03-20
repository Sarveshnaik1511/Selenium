package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicAutomation.Browser;

public class DynamicWebTableMaxPriceCompanyName {

	public static void main(String[] args) {
		WebDriver driver = Browser.launchBrowser("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement> currentPrice = driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[4]"));
		List<WebElement> companyName  = driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[1]"));
		
		double max=0;
		int index =0;
		for (int i = 0; i < currentPrice.size(); i++) {
			String prices = currentPrice.get(i).getText();
			double price = Double.parseDouble(prices);
			if(price>max) {
				max=price;
				index=i;
			}
		}
		System.out.println("Max price is: "+max);
		String name =companyName.get(index).getText();
		System.out.println("And name of the company is: "+name);
	}

}
