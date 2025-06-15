package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicAutomation.Browser;

public class MoveToElement {
	public static void main(String[] args) {
		WebDriver driver = Browser.launchBrowser("https://www.amazon.in");
		Actions actions = new Actions(driver);

		WebElement hello = driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
		
		
		// moveToElement will move the courser to the particular element that we have passed
		actions.moveToElement(hello);
		actions.perform();

		driver.findElement(By.xpath("//span[text()='Create a Wish List']")).click();

		WebElement hello1 = driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));

		actions.moveToElement(hello1);
		actions.perform();
		WebElement prime = driver.findElement(By.xpath("//span[text()='Your Prime Video']"));

		actions.moveToElement(prime);
		actions.perform();

	}
}
