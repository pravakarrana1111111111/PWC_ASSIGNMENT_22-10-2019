package COM.OYE.ObjectRepository;
/**
 * 
 * @author PRAVAKAR
 *store all the web element
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import COM.OYE.GENERIC_lib.Baseclass_lib;


public class HomePage_Test extends Baseclass_lib
{
	 
	
	@FindBy(xpath="//input[@placeholder='Search by city, hotel, or neighborhood']")
	private WebElement SearchPlace;
	
	@FindBy(xpath="//div[@class='oyo-row oyo-row--no-spacing datePickerDesktop datePickerDesktop--home']")
	private WebElement AddDate;
	
	@FindBy(xpath="//div[@class='oyo-row oyo-row--no-spacing guestRoomPicker guestRoomPicker--home ']")
	private WebElement clickGuestOption;
	
	@FindBy(xpath="//span[@class='guestRoomPickerPopUp__plus']")
	private WebElement AddGuest;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchRoom;
	
 
   
	
	
	
	public void searchplace(String place){
		
		 
		Actions act=new Actions(driver);
		act.moveToElement(SearchPlace);
		searchplace(place);
		act.sendKeys(Keys.ENTER).perform();
		 
	 }	
	
	public void EnterDate() throws InterruptedException{
		
		AddDate.click();
		
		SimpleDateFormat date=new SimpleDateFormat("mm/dd/yyyy");
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 10);
		cal.add(Calendar.DATE, 22);
		cal.add(Calendar.DATE, 23);
		cal.add(Calendar.YEAR, 2019);
		 	
	}
	
    public void AddNoOfGuest()   {
		
	    clickGuestOption.click();
	    AddDate.click();
		 	
	}

    public void searchroom()   {
		
	    searchRoom.click();
		 	
	}
 
	
}

