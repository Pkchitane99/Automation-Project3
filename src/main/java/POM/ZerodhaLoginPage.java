package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	
		@FindBy(xpath="//input[@id='userid']") private WebElement userid;
		@FindBy(xpath="//input[@id='password']") private WebElement password;
		@FindBy(xpath="//button[@type='submit']") private WebElement submitbutton;
		@FindBy(xpath="//a[text()='Forgot user ID or password?']") private WebElement forget;
		@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signup;
		@FindBy(xpath="//img[@alt='Kite Android']") private WebElement playstorelogo;
		@FindBy(xpath="//img[@alt='Kite iOS']") private WebElement applestorelogo;
		@FindBy(xpath="//img[@alt='Zerodha']") private WebElement zerodhalogo;
		
		public ZerodhaLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void enterUserId(String id1) {
			userid.sendKeys(id1);
		}
		public void enterPassword(String pas) {
			password.sendKeys(pas);
		}
		public void submit() {
			submitbutton.click();
		}
		public void forgetPassword() {
			forget.click();
		}
		public void signup() {
		  signup.click();
		}
		public void playstoreButton() {
			playstorelogo.click();
		}
		public void applestoreButton() {
			applestorelogo.click();
		}
		public void zerodhaButton() {
			zerodhalogo.click();
		}
	}


