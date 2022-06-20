package Tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;


public class ZerodhaPinPageTests {

		
		public WebDriver driver;
		@BeforeTest
		public void browser() {
			
			driver = Browser.openBrowser();
			System.out.println("Test Cases Execution Started for Zeroda Login Page....");
		}	
		
		@Test 
		public void submitWithValidCredential() {
			ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
			zerodhaloginpage.enterUserId(null);
		}
	   @Test
	   public void submitWithoutCredential() {
		    
		  
		   ZerodhaLoginPage z1 = new ZerodhaLoginPage(driver);
		   z1.submit();
		   driver.quit();
	   }
	   @Test(priority=1)
	   public void submitWithoutPassword() {
		   
		   ZerodhaLoginPage z2 = new ZerodhaLoginPage(driver);
		   z2.enterUserId("abc123@gmail.com");
		   z2.submit();
		   driver.quit();
	  }
	  
	   @Test(priority=2,timeOut=300)
	   public void submitWithInvalidCredential() {
		   
		  ZerodhaLoginPage z3 = new ZerodhaLoginPage(driver);
		  z3.enterUserId("xyz123gmail.com");
		  z3.enterPassword("12345678");
		  z3.submit();
		  driver.quit();
	   }
	   
	   @Test(priority=3, dependsOnMethods= {"submitWithInvalidCredential"})
	   public void clickOnSignUp() {
		  
		  ZerodhaLoginPage z4 = new ZerodhaLoginPage(driver);
		  z4.signup();
		  driver.quit();
	  }
	   
	   @Test
	   public void clickOnForgetPassword() {
		  System.out.println("Check for forget password");
	  }
	   @AfterTest
	   public void allPass() {
		 
		   System.out.println("All Test Executed...");
	  }
	}
	  

