package printDropdownAndSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrintAllValuesFromAmazonAllList {
	public static void main(String[] args) {
		WebDriver driver = Browser.lounchBrowser("https://www.amazon.in");

		WebElement all = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select selectList = new Select(all);
		 
		List<WebElement> listOfAll=selectList.getOptions();
		

		for (int i = 0; i < listOfAll.size(); i++) {
			String print = listOfAll.get(i).getText();
			System.out.println(print);
		}

	}

}
