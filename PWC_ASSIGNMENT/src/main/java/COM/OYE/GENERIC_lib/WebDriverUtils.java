package COM.OYE.GENERIC_lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	/**
	 * 
	 * @ wait for page to load
	 */
   public void waitforpageToload(WebDriver driver)
   {
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   }
/**
 * @ wait for any element is available in gui
 */
   public void waitforElementpresent(WebDriver driver,WebElement wb)
   {
	   WebDriverWait wait=new WebDriverWait(driver, 20);
	   wait.until(ExpectedConditions.visibilityOf(wb));
   }
   /**customwait
 * @throws InterruptedException 
    * @ wait for element complete element to load & available in gui
    */
   public void waitforcompleteelementtoload(WebElement wb) throws InterruptedException
   {
	   int count=0;
	   while(count<20)
	   {
		   try
		   {
			   wb.isDisplayed();
			   break;
		   }
		   catch(Throwable t)
		   {
			   System.out.println("handle the exception & continue..");
			   Thread.sleep(2000);
			   count++;
		   }
	   }
   }
}
