package printDropdownAndSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintValuesOfCreateGmailAccount {
	public static void main(String[] args) {
		WebDriver driver = Browser.lounchBrowser(
				"https://accounts.google.com/v3/signin/identifier?continue=https://mail.google.com/mail/&service=mail&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@jsname='DRCaZb']"));

		for (int i = 0; i < list.size(); i++) {
			String listValues = list.get(i).getText();
			System.out.println(listValues);
		}
		
	
	
	}

}
