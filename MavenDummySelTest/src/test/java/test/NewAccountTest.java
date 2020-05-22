package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

import BusinessLib.Login;
import BusinessLib.Navigation;
import BusinessLib.NewAccount;
import BusinessLib.NewCustomer;
import GenericLib.Driver;
import GenericLib.GenericConstant;
import GenericLib.WebdriverCommonLib;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewAccountTest {
	
	private static final Logger log = Logger.getLogger(NewAccountTest.class.getName());	
  
/*	
@Test(priority=1)
  public void newAcct_NewCust() throws EncryptedDocumentException, IOException {
	  
	  
	  AssertJUnit.assertEquals(Navigation.navigateToNewAccount(), true);
		
		//NewCustomer.AddNewCust("Sheet1",1);
	  
	  AssertJUnit.assertEquals(NewAccount.AddNewAccount("Sheet1",1), true);
	  
	  Reporter.log("New Account created");
		
		
	  WebdriverCommonLib.CaptureScreenshot();
		
		NewAccount.setActId("Sheet1", 1);
  }
  
  */
	
  @Test(groups = { "functest"})
  public void newAcct_EditCust() throws EncryptedDocumentException, IOException, InvalidFormatException {
	  
	  
	  //AssertJUnit.assertEquals(Navigation.navigateToNewAccount(), true);
	  
	  log.info(Navigation.navigateToNewAccount()?"Successfully navigated to New Account page":"Navigation failed");
		
		//NewCustomer.AddNewCust("Sheet1",1);
	  
	  //AssertJUnit.assertEquals(NewAccount.AddNewAccount("EditCust",1), true);
	  
	  log.info(NewAccount.AddNewAccount("EditCust",1)?"Successfully entered New Account details":"Entering New Account details failed");
	  
	  Reporter.log("New Account created");
		
		
	  WebdriverCommonLib.CaptureScreenshot();
		
		NewAccount.setActId("EditCust", 1);
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	 
  }

  @AfterMethod
  public void afterMethod() {
	  //Login.logout();
	  //WebdriverCommonLib.checkAlert_Accept();
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
