package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {

	@FindBy(xpath ="//input[@type='text']") private WebElement mobileno;
	@FindBy(xpath="//button[@type='submit']") private WebElement register ;
	@FindBy(xpath="//a[text()='Want to open an NRI account?']") private WebElement nriaccount;

	public ZerodhaSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
   
	public void MobileNoFill() {
		mobileno.sendKeys("1234567890");
		
	}
    public void buttonClick() {
		register.click();
	}
    public void nriAccount() {
    	nriaccount.click();
    }
    
}
