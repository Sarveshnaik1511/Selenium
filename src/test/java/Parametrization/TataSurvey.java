package Parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basicAutomation.Browser;

public class TataSurvey {
	
	public static String getTataSurvey(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		
	 FileInputStream file = new FileInputStream("G:\\Arise Software Testing\\Practice & HomeWork\\Parameterization.xlsx");
	 
	String value = WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	 
	return value;
	
	
	
	
		
		
	}
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver= 	Browser.launchBrowser("https://www.tatacapital.com/campaign/customer-survey.html");
		WebElement name = driver.findElement(By.xpath("//input[@class='input-text-name name']"));
		
	String nameValue =	getTataSurvey("Tata Survey", 5, 2);
		name.sendKeys(nameValue);
		
	WebElement number=	driver.findElement(By.xpath("//input[contains(@class,'input-text only-numeric-input sub')]"));
	
	String numberValue = getTataSurvey("Tata Survey", 5, 3);
	 number.sendKeys(numberValue);
	 
    WebElement products=	 driver.findElement(By.xpath("(//div[text()='Select Product*'])[1]"));
    products.click();
    
   WebElement productElement = driver.findElement(By.xpath("//div[text()='Insurance']"));
   productElement.click();
		
	}

}
