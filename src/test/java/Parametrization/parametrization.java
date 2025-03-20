package Parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametrization {
	
	
	public static String getData(String sheetName, int row, int column) throws EncryptedDocumentException, IOException {
		
		
		//FileInputStream Class will have the path of Excel file from our system and that file will get stored in object of FileInputStream
	  	FileInputStream file = new FileInputStream("G:\\Arise Software Testing\\Practice & HomeWork\\Parameterization.xlsx");
		
	  					//create method of Workbookfactory class which is from Apache Poi library, Will make a copy of the file 
	  					//File means whatever the path we have given in FileInputStream
	  					//Then using method like getSheet, getRow, GetCell and getStringValue will return the value in particular cell
	  					//We give Column value in getCell method
		 String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
		
		return value;
		
		
	}

}
