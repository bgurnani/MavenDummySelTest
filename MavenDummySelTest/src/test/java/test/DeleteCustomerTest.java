package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BusinessLib.DeleteCustomer;
import BusinessLib.Login;
import BusinessLib.Navigation;
import GenericLib.Driver;
import GenericLib.GenericConstant;
import GenericLib.WebdriverCommonLib;
import resources.Log;

public class DeleteCustomerTest {
	
	//private static final Logger log = Logger.getLogger(DeleteCustomerTest.class.getName());	
  
  @Test
  public void deleteCustomer() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException {
	  
	 
	 Log.info(Navigation.navigateToDeleteCustomer()?"Successfully navigated to Delete Customer page":"Delete Customer page navigation failed"); 
	 //AssertJUnit.assertEquals(Navigation.navigateToDeleteCustomer(), true);
	  
     DeleteCustomer.DeleteCust("EditCust", 1);
     
     WebdriverCommonLib.checkAlert_Accept();
     
     Thread.sleep(1000);
	  
     WebdriverCommonLib.checkAlert_Accept();
     
     Thread.sleep(1000);
     
    // Navigation.NavigateToNewCustomer();
     
	 Reporter.log("Customer deleted");
	  
	  
	  
  }
 
  @BeforeClass
  public void beforeClass() {
	  Driver.hitURL(GenericConstant.Url);
	  Login.login();
  }

  @AfterClass
  public void afterClass() {
	  
  }

  @BeforeTest
  public void beforeTest() throws EncryptedDocumentException, IOException, InvalidFormatException {
	  //Driver.openChromeBrowser();
	  if (WebdriverCommonLib.getexdata("DeleteCust", 1, 0).equalsIgnoreCase("YES"))
		  
	  {
		  Driver.openBrowser(WebdriverCommonLib.getBrowserName("Browser", 1, 0));
		
	  }
	  else
	  {
		  throw new SkipException("Skipping the test case as Runmode for the data is set as NO");
	}	
  }

  @AfterTest
  public void afterTest() {
	  Driver.driver.quit();
	  
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
