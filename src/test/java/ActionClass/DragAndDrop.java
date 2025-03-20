package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicAutomation.Browser;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.launchBrowser("https://www.globalsqa.com/demo-site/draganddrop/");

		Actions actions = new Actions(driver);

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		driver.switchTo().frame(iframe);

		Thread.sleep(2000);

		WebElement DragImg1 = driver.findElement(
				By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
		WebElement DropImg = driver.findElement(By.xpath("//div[@id='trash']"));

		actions.dragAndDrop(DragImg1, DropImg);
		actions.perform();

		WebElement DragImg2 = driver.findElement(
				By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[2]"));
		WebElement DrafImg3 = driver.findElement(
				By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[3]"));
		WebElement DragImg4 = driver.findElement(
				By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[4]"));

		actions.dragAndDrop(DragImg2, DropImg);
		actions.perform();

		actions.dragAndDrop(DrafImg3, DropImg);
		actions.perform();

		actions.dragAndDrop(DragImg4, DropImg);
		actions.perform();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[@class='ui-icon ui-icon-refresh'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='ui-icon ui-icon-refresh'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='ui-icon ui-icon-refresh'])[3]")).click();
		driver.findElement(By.xpath("(//a[@class='ui-icon ui-icon-refresh'])[4]")).click();
	}

}
