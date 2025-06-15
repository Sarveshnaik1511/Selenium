package udemyCource;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basicAutomation.Browser;

public class GetAllpresentLinksFromTheWebpage {

	@Test(enabled = false)
	public void getAllLinks() {
		WebDriver driver = Browser.launchBrowser("https://www.amazon.in/");

		// Give me the count of all the links available in webpage
		// we can do that by using tagname locator
		// all links will be available in HTML tag called "a"
		// we can target that "a" and can get all the links
		int allLinks = driver.findElements(By.tagName("a")).size();

		System.out.println(allLinks);
	}

	@Test(enabled = false)
	public void getLinksFromFooter() {
		WebDriver driver = Browser.launchBrowser("https://www.amazon.in/");
		// give me count of links present in footer
		WebElement footer = driver.findElement(By.xpath("//div[@id='navFooter']"));
		int footerLinks = footer.findElements(By.tagName("a")).size();
		System.out.println(footerLinks);

	}

	@Test(enabled = false)
	public void getLinkOfPerticularSectionFromFooter() {
		WebDriver driver = Browser.launchBrowser("https://www.amazon.in/");
		WebElement footer = driver.findElement(By.xpath("//div[@id='navFooter']"));
		WebElement links = footer.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[1]//ul"));
		int sizeOfLinks = links.findElements(By.tagName("a")).size();
		System.out.println(sizeOfLinks);

//		WebDriver driver = Browser.launchBrowser("https://www.amazon.in/");
//		WebElement footer =driver.findElement(By.xpath("//div[@id='navFooter']"));
//		WebElement column= footer.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[1]//ul"));
//		List<WebElement> links=column.findElements(By.tagName("a"));
//		int sizeOfLinks=links.size();
	}

	@Test(enabled = false)
	public void clickOnEachLink() throws InterruptedException {
		WebDriver driver = Browser.launchBrowser("https://www.amazon.in/");
		WebElement footer = driver.findElement(By.xpath("//div[@id='navFooter']"));
		WebElement column = footer.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[1]//ul"));
		List<WebElement> links = column.findElements(By.tagName("a"));
		int sizeOfLinks = links.size();

		// firstly, we have finded the count of link
		// then we have clicked on each link and opened it on seperate tab
		// Keys.chord(); is used to make multiple actions with keys as a time

		for (int i = 0; i < sizeOfLinks; i++) {

			String commandClick = Keys.chord(Keys.COMMAND, Keys.ENTER);
			links.get(i).sendKeys(commandClick);
			Thread.sleep(6000);
		}

	}

	@Test
	public void openEachLickAndGetTitle() throws InterruptedException {
		WebDriver driver = Browser.launchBrowser("https://www.amazon.in/");
		WebElement footer = driver.findElement(By.xpath("//div[@id='navFooter']"));
		WebElement column = footer.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[1]//ul"));
		List<WebElement> links = column.findElements(By.tagName("a"));
		int sizeOfLinks = links.size();

		for (int i = 0; i < sizeOfLinks; i++) {

			String commandClick = Keys.chord(Keys.COMMAND, Keys.ENTER);
			links.get(i).sendKeys(commandClick);
			Thread.sleep(6000);
		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i = windows.iterator();

		while (i.hasNext()) {
			driver.switchTo().window(i.next());
			String title = driver.getTitle();
			System.out.println(title);
		}

	}
	
	

}
