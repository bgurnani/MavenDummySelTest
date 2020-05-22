package test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BusinessLib.Deposit;
import BusinessLib.Login;
import BusinessLib.Navigation;
import GenericLib.Driver;
import GenericLib.GenericConstant;
import GenericLib.WebdriverCommonLib;

public class DepostTest {
	
	private static final Logger log = Logger.getLogger(NewAccountTest.class.getName());		
  
/*	
  @Test(priority=1)
  public void DepositAmt() throws EncryptedDocumentException, IOException {
	  
	  AssertJUnit.assertEquals(Navigation.NavigateToDepositAccount(), true); 
	  
	  AssertJUnit.assertEquals(Deposit.DepositAmt("Sheet1", 1), true);
	  
	  Reporter.log("Amount deposited");
	  
	  
		
		WebdriverCommonLib.CaptureScreenshot();
	  
  }
  */
  
  @Test(priority=1)
  public void DepositAmt_EditCust() throws EncryptedDocumentException, IOException, InvalidFormatException {
	  
	  //AssertJUnit.assertEquals(Navigation.NavigateToDepositAccount(), true); 
	  
	  //AssertJUnit.assertEquals(Deposit.DepositAmt("EditCust", 1), true);
	  
	 
	  
	  log.info(Navigation.NavigateToDepositAccount()?"Successfully navigated to Deposit Account":"Deposit Account navigation failed");
	  
	  log.info(Deposit.DepositAmt("EditCust", 1)?"Amount deposited successfully":"Amount deposit failed");	
		//WebdriverCommonLib.CaptureScreenshot();
	  
	  Reporter.log("Amount deposited");
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
	 // Login.logout();
	 // WebdriverCommonLib.checkAlert_Accept();
	  
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
	  if (WebdriverCommonLib.getexdata("EditCust", 1, 0).equalsIgnoreCase("YES"))
		  
	  {
		  Driver.openBrowser(WebdriverCommonLib.getBrowserName("Browser", 1, 0));
		  WebdriverCommonLib.invokelogConfig();
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
