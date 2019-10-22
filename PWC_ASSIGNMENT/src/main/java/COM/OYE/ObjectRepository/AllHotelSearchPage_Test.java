package COM.OYE.ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AllHotelSearchPage_Test {
	
	@FindBy(xpath="//span[text()='Book Now']")
	private WebElement BookRoom;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement CustmerName;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement CustmerEmail;
	
	@FindBy(xpath="//input[@type='number']")
	private WebElement CustmerPhoneNum;
	
	@FindBy(xpath="//span[contains(text(),'Pay Now')]")
	private WebElement paynow;
	
	@FindBy(xpath="//div[text()='Debit Card']")
	private WebElement paymentmode;
	
	
	
	
	
	
    public void clickBookroom()   {
	    BookRoom.click();	 	
	}
    public void EnterCustmerdetails(String username,String email,String phonenum){
    	CustmerName.sendKeys(username);
    	CustmerEmail.sendKeys(email);
    	CustmerEmail.sendKeys(phonenum);
	 }
    public void clickpaynow()   {	
	    paynow.click();	 	
	}
    public void paymentOnDebitCard()   {	
    	paymentmode.getText();	 	
	}
    

}
