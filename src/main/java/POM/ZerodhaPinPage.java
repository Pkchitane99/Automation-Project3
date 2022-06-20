package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinPage {
	@FindBy(xpath="//input[@id='pin']") private WebElement pin1;
	@FindBy(xpath="//button[@type='submit']") private WebElement continuebutton;
	@FindBy(xpath="//span[@class='icon icon-lock']") private WebElement icon;
	@FindBy(xpath="//a[text()='Forgot 2FA?']") private WebElement forgetpassword;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signup;
	public ZerodhaPinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Pin1(String pin) {
		pin1.sendKeys(pin);	
	}
    public void ClickOnContinue() {
	   continuebutton.click();
   }
    public void iconClick()
   {
	  icon.click();
  }
   public void forgetPassword()
  {
	  forgetpassword.click();
  }
   public void signUp1() {
	  signup.click();
  }
}
