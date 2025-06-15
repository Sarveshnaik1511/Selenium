package printDropdownAndSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintListOfSearchSuggestionsOfYoutube {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.lounchBrowser("https://www.youtube.com");
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));

		search.sendKeys("bikes under 1 lakh");
		Thread.sleep(2000);
		List<WebElement> listOfSearch = driver.findElements(By.xpath("//ul[@role='listbox']//li//yt-formatted-string[@id='text']"));

		for (int i = 0; i < listOfSearch.size(); i++) {
			String print = listOfSearch.get(i).getText();
			System.out.println(print);
		}
	}

}
