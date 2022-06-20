package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	public static WebDriver openBrowser()    // parameterized method to get dynamic url 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SoftwareTesting\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting chrome driver class to webdriver
		driver.get("https://kite.zerodha.com/"); // method of webdriver interface
		driver.manage().window().maximize();
		//ChromeOptions options =new ChromeOptions();
		//options.addArguments("--disable-notifications");
		return driver;
	}

}
