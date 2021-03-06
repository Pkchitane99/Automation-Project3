package POM;

import java.util.List;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {
	@FindBy(xpath="//span[@class='tradingsymbol']") private List<WebElement> searchtab;
	@FindBy(xpath="//input[@icon='search']") private WebElement search1;
	@FindBy(xpath="//button[@class='button-green']") private WebElement greenbuttn ;
	@FindBy(xpath="//span[text()='HDFC']") private WebElement hdfc ;
	@FindBy(xpath="//button[@class='button-blue buy']") private WebElement buybuttn;
	@FindBy(xpath="//span[@class='nice-name']") private WebElement firstitem;
	@FindBy(xpath="//button[@class='button-orange sell']") private WebElement sellbuttn;
	@FindBy(xpath="//button[@class='button-outline']") private WebElement marketd;
	@FindBy(xpath="//span[@class='icon icon-trending-up']") private WebElement chart;
	@FindBy(xpath="//span[@class='icon icon-trash']") private WebElement delete;
	@FindBy(xpath="//span[@class='icon icon-ellipsis']") private WebElement more;
	@FindBy(xpath="//label[@for='radio-114']") private WebElement bse;
	@FindBy(xpath="//label[@for='radio-157']") private WebElement nse;
    @FindBy(xpath="//label[@for='radio-179']") private WebElement intraday;
    @FindBy(xpath="//label[@for='radio-199']") private WebElement longterm;
    @FindBy(xpath="//input[@type='number']") private WebElement qty;
    @FindBy(xpath="//input[@label='Price']") private WebElement price ;
    @FindBy(xpath="//input[@for='radio-244']") private WebElement market ;
    @FindBy(xpath="//input[@for='radio-245']") private WebElement limit ;
    @FindBy(xpath="//label[@for='radio-122']") private WebElement intradaybse;
    @FindBy(xpath="//input[@label='Qty.']") private WebElement qtybse;
    @FindBy(xpath="//input[@label='Price']") private WebElement pricebse;
    @FindBy(xpath="//label[@for='switch-112']") private WebElement switchto ;
    @FindBy(xpath="//label[@for='radio-176']") private WebElement marketbse ;
    @FindBy(xpath="//label[@for='radio-177']") private WebElement limitbse ;
    @FindBy(xpath="//label[@for='radio-179']") private WebElement slbse ;
    @FindBy(xpath="//label[@for='radio-180']") private WebElement slmbse;
    @FindBy(xpath="//span[@data-balloon='More options']") private WebElement moreoptions;
    @FindBy(xpath="//label[@for='checkbox-181']") private WebElement slcheckbox ;
    @FindBy(xpath="//label[@for='checkbox-183']") private WebElement targetcheckbox;
    @FindBy(xpath="//input[@label='Trigger price']") private WebElement triggerpricebse ;
    
    public ZerodhaHomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    WebDriver driver;
   
    public void searchShare(String s1) throws InterruptedException {
    	
    	search1.sendKeys(s1);
    	
    }
	public void clickOnBuy(WebDriver driver) {
    	
		int s = searchtab.size();
		System.out.println(s);
        for(int i= 0; i<s; i++) 
        {        
        	WebElement str1 = searchtab.get(i);
        	System.out.println(str1.getText());
        	String text =str1.getText();
        	System.out.println(text);
           if(text.equals("HDFCBANK"))
            {
        	 
             Actions act4 = new Actions(driver);
             act4.moveToElement(str1).perform();
             act4.moveToElement(sellbuttn).click().build().perform();
             
            }
           }
        
	}
    
    public void clickOnSell() {
    	Actions act2 = new Actions(driver);
    	act2.moveToElement(sellbuttn);
    	act2.perform();
    }

    public void clickOnBse() {
    	
    	bse.click();
    	//Actions a1 = new Actions(driver);
    	//a1.moveToElement(bse).perform();
    	//a1.click().perform();
    }
    public void clickOnNse() {
    	
    	nse.click();
    	//Actions a2 = new Actions(driver);
    	//a2.moveToElement(nse).perform();
    	//a2.click().perform();
    	 }
    public void clickOnSwitch() {
    	//Actions a4 = new Actions(driver);
    	//a4.moveToElement(switchto).perform();
    	//a4.click().perform();
        switchto.click();
    }
    public void insertQty() {
    	qty.click();
    }
    
}
