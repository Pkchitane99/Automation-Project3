package Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

//import POM.ZerodhaHomePage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import POM.ZerodhaSignUpPage;

import Utility.Parameterization;
import Utility.Reports;
import POJO.Browser;
@Listeners(UseOfListeners.class)

public class ZerodhaLoginPageTests extends BaseTest  {

		ExtentReports report;
		ExtentTest test;
		@BeforeTest 
		public void extendReports() {
			report = Reports.createStandardReports();
		}
		@BeforeMethod
		public void start() {
			driver = Browser.openBrowser();
		}		  
		
		
	   @Test 
	   public void sumbmitWithValidCredentialTest() throws EncryptedDocumentException, IOException, InterruptedException {
		  
		   test = report.createTest("sumbmitWithValidCredentialTest");
		   ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		   String userid = Parameterization.getData(0, 1);
		   String password = Parameterization.getData(1, 1);
		   String pin = Parameterization.getData(2, 1);
		   zerodhaLoginPage.enterUserId(userid);
		   zerodhaLoginPage.enterPassword(password);
		   zerodhaLoginPage.submit();
		   Thread.sleep(1000);
		   
		   ZerodhaPinPage zerodhapinpage = new ZerodhaPinPage(driver);	   
		   zerodhapinpage.Pin1(pin);
		   zerodhapinpage.ClickOnContinue();
		  // ZerodhaHomePage zhp1 = new ZerodhaHomePage(driver);
		   //zhp1.searchShare("HDFC");
		   //zhp1.clickOnBuy(driver);
	    Thread.sleep(20000);
	   }
	  
	  
		   @Test
		   public void signUpTest() throws InterruptedException {
			
		      test = report.createTest("signUpTest");
			  ZerodhaLoginPage z4 = new ZerodhaLoginPage(driver);
		   z4.signup();
		   ZerodhaSignUpPage zerodhasignup = new ZerodhaSignUpPage(driver);
		   zerodhasignup.buttonClick();
		   driver.switchTo().window("SignUp");	   
	      
		  }

	   @Test
	   public void submitWithoutPasswordTest() throws InterruptedException {
		  
		   test = report.createTest("submitWithoutPasswordTest");
		   ZerodhaLoginPage z2 = new ZerodhaLoginPage(driver);
		   z2.enterUserId("ABC123");
		   z2.submit();	
		   
	  }
	    
	   
	   @Test
	   public void submitWithInvalidCredentialTest() throws InterruptedException {
		 
		 test =report.createTest("submitWithInvalidCredentialTest");
		  ZerodhaLoginPage z3 = new ZerodhaLoginPage(driver);
		  z3.enterUserId("xyz123");
		  z3.enterPassword("12345678");
		  z3.submit();
		  
	   }
	   
	
	   @Test
	   public void clickOnSignUp() throws InterruptedException {
		   
		  test =report.createTest("clickOnSignUp");
		  ZerodhaLoginPage z4 = new ZerodhaLoginPage(driver);
		  z4.signup();
	      
	   } 
	  
	  @AfterMethod
	  public void closeBrowser(ITestResult result) {
		  if(result.getStatus()==ITestResult.FAILURE) {
			  test.log(Status.FAIL, result.getName());
		  }else
		   if(result.getStatus()==ITestResult.SUCCESS) {
			 test.log(Status.PASS, result.getName());
		   } else
			  test.log(Status.SKIP, result.getName());
		  }
	 
	 @AfterTest
	 public void flushResult(){
		 report.flush();
	 }
}
	
	











/*@DataProvider(name="multipleuser")
public Object[][] multipleTestData(){
	   return new Object[][] {{"ABC123","123456"}};  
}


// NO : 2
@Test(dataProvider ="multipleuser")
public void multipleTests(String id,String pwd) throws InterruptedException {
	   
	   ZerodhaLoginPage p1 = new ZerodhaLoginPage(driver);
	   p1.enterUserId(id);
	   p1.enterPassword(pwd);
	   p1.submit();
	
   
}
@Test
public void submitWithoutCredentialTest() throws InterruptedException {
	     
	   ZerodhaLoginPage z1 = new ZerodhaLoginPage(driver);
	   z1.submit();
}*/


