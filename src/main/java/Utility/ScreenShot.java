package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot  {

	
		public static void screen(WebDriver driver,String name) throws IOException {
		
        ScreenShot.getDateForFile();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Chitane Pravin\\eclipse-workspace\\KiteZerodha\\"+name+".jpeg");
		FileHandler.copy(source, destination); 	
        }
		public static String getDateForFile() {
			
			DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss");
			LocalDateTime localtime = LocalDateTime.now(); 
			String details = dtformat.format(localtime);
			return details;
		}
	}


