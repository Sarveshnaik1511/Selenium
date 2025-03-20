package basicAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterized_UserDefined {
	
	public static String getData(String sheetName, int row, int column) throws EncryptedDocumentException, IOException {
		
		FileInputStream file =new  FileInputStream("G:\\Arise Software Testing\\Practice & HomeWork\\Facebook Data.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
		return value;
		
	}
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String value1= getData("practice",0,0);
		
		String value2 =getData("practice", 1, 0);
		
		System.out.println("username is: "+value1);
		System.out.println("password is: "+value2);
		
	}
}
