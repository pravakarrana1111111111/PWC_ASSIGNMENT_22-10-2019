package COM.OYE.GENERIC_lib;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import COM.OYE.ObjectRepository.HomePage_Test;
 
public class Baseclass_lib 
{
	
	public static WebDriver driver;
	public static fileutil2 flib=new fileutil2();
	
	@BeforeClass 
	public void configBc() throws IOException
	{
		System.out.println("========Lunch browser========");
		Properties pobj=flib.getpropertiesfileobject();
		String browsername=pobj.getProperty("BROWSER");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "‪./Data/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
 		}
		else if(browsername.equals("IE"))
		{
			System.setProperty("webdriver.IE.driver", "");
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@BeforeMethod 
	public void configBm() throws IOException
	{
		System.out.println("ENTER TO OYE");
    	Properties pobj=flib.getpropertiesfileobject();
		driver.get(pobj.getProperty("URL"));
    }
	
	 @AfterMethod 
	 public void configAm()
	{
			System.out.println("CLOSE OYE APP");
	}
 
	 
		@AfterClass 
		public void configAc()
		{
			System.out.println("========close browser=========");
        driver.close();
        driver.quit();
		
	 }	
}
