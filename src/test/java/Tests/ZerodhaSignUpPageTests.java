package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import POM.ZerodhaSignUpPage;

public class ZerodhaSignUpPageTests {
	
	  public WebDriver driver ;
	@Test
	   public void signUpTest() throws InterruptedException {
		

	  
	   ZerodhaSignUpPage zerodhasignup = new ZerodhaSignUpPage(driver);
	   zerodhasignup.MobileNoFill();
	   zerodhasignup.buttonClick();
  }

}
