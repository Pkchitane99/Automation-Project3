package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {

	public static String getData(int row,int column) throws EncryptedDocumentException, IOException {
		
		//FileInputStream file = new FileInputStream("C:\\Users\\Chitane Pravin\\eclipse-workspace\\KiteZerodha\\src\\main\\resources\\UserData.xlsx");
        
		DataFormatter format = new DataFormatter();
		
		String value ;
		try
		{
			FileInputStream file = new FileInputStream("C:\\Users\\Chitane Pravin\\eclipse-workspace\\KiteZerodha\\src\\main\\resources\\UserData.xlsx");
			Cell cell = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(column);
			value= format.formatCellValue(cell);
		}  
	    catch(Exception e) {
            value="";
	    	System.out.print(e);
	    }
	 return value;
	}

}
