package COM.OYE.RoomBookTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import COM.OYE.GENERIC_lib.Baseclass_lib;
import COM.OYE.ObjectRepository.AllHotelSearchPage_Test;
import COM.OYE.ObjectRepository.HomePage_Test;

public class RoomBookTest extends Baseclass_lib {
	
	

	@Test
	public void RoomBook() throws Throwable {
		
 		String place        =flib.getexcelData("Sheet1", 0, 1);
 		String username     =flib.getexcelData("Sheet1", 0, 3);
 		String email        =flib.getexcelData("Sheet1", 0, 5);
 		String phonenum     =flib.getexcelData("Sheet1", 0, 7);
 		String ExPaymentMode=flib.getexcelData("Sheet1", 0, 9);
 		
 		
		/*open Home page*/
 		
        HomePage_Test placeadd=PageFactory.initElements(driver, HomePage_Test.class);
        placeadd.searchplace(place);
        
        HomePage_Test dateadd=PageFactory.initElements(driver, HomePage_Test.class);
        dateadd.EnterDate();
        
        HomePage_Test guestadd=PageFactory.initElements(driver, HomePage_Test.class);
        guestadd.AddNoOfGuest();
        
        HomePage_Test roomsearch=PageFactory.initElements(driver, HomePage_Test.class);
        roomsearch.searchroom();
        
        /*Book Hotel*/
        
        AllHotelSearchPage_Test clickbook=PageFactory.initElements(driver, AllHotelSearchPage_Test.class);
        clickbook.clickBookroom();
        
        AllHotelSearchPage_Test enterdetails=PageFactory.initElements(driver, AllHotelSearchPage_Test.class);
        enterdetails.EnterCustmerdetails(username, email, phonenum);
        
        AllHotelSearchPage_Test pay=PageFactory.initElements(driver, AllHotelSearchPage_Test.class);
        pay.clickpaynow();
        
        AllHotelSearchPage_Test paymentmode=PageFactory.initElements(driver, AllHotelSearchPage_Test.class);
        paymentmode.paymentOnDebitCard();
        
        Assert.assertEquals(paymentmode, ExPaymentMode);
        Reporter.log(paymentmode + " PAYMENT ON DEBIT CARD ",true); 
 
        
	  

}
}
