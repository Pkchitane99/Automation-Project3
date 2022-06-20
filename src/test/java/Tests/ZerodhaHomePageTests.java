package Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaHomePage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parameterization;
import Utility.ScreenShot;

public class ZerodhaHomePageTests extends BaseTest{

	@BeforeTest
	public void start() {
	    driver=Browser.openBrowser();
	}
	@Test
	public void searchShares() throws EncryptedDocumentException, IOException, InterruptedException {
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
	 
		  Thread.sleep(500);
		 
	      ZerodhaHomePage zhp = new ZerodhaHomePage(driver);
	      zhp.clickOnBuy(driver);
	      Thread.sleep(1000);
	      zhp.clickOnBse();
	      Thread.sleep(500);
          ScreenShot.screen(driver, "bseradio");	     
          Thread.sleep(200);
          zhp.clickOnSwitch();
          ScreenShot.screen(driver, "togglebutton");
          //zhp.clickOnNse();
         // zhp.insertQty();
          
	      
	}
	
}
