package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgetPasswordPage {
	
	@FindBy(xpath="//label[@for='radio-30']") private WebElement remUID;
	@FindBy(xpath="//label[@for='radio-31']") private WebElement forgetUID;
	@FindBy(xpath="//input[@placeholder='User ID']") private WebElement uid;
	@FindBy(xpath="//input[@placeholder='PAN']") private WebElement panid ;
	@FindBy(xpath="//label[@for='radio-35']") private WebElement emailbuttn;
	@FindBy(xpath="//label[@for='radio-36']") private WebElement smsbuttn;
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']") private WebElement emailfield;
	@FindBy(xpath="//button[@type='submit']") private WebElement resetbuttn;
	@FindBy(xpath="//a[@class='text-xsmall text-light reset-account-button']") private WebElement backtologin;
	@FindBy(xpath="//input[@placeholder='Mobile number (as on account)']") private WebElement mobno;
	
	public ZerodhaForgetPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   public void selectForgetUid() {
	   forgetUID.click();
   }
    public void selectRemUid() {
    	remUID.click();
   }
    public void insertUid() {
    	uid.sendKeys("DEF123");
   }


}

