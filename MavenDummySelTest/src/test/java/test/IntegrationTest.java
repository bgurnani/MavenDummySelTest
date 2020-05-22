package test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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
import BusinessLib.NewAccount;
import BusinessLib.NewCustomer;
import GenericLib.Driver;
import GenericLib.GenericConstant;
import GenericLib.WebdriverCommonLib;

public class IntegrationTest {
	
	private static final Logger log = Logger.getLogger(IntegrationTest.class.getName());	
	
  @Test(priority = 1)
  public void NewCustomer() throws EncryptedDocumentException, IOException, InvalidFormatException {
	  
	  
	  
	  //AssertJUnit.assertEquals(Navigation.NavigateToNewCustomer(), true);
	  
	  log.info(Navigation.NavigateToNewCustomer()?"Successfully navigated to customer page":"Customer page navigation failed");
	  
	  //AssertJUnit.assertEquals(NewCustomer.AddNewCust("NewCust",1), true);
	
	  log.info(NewCustomer.AddNewCust("NewCust",1)?"Successfully entered customer details":"Entering Customer page details failed"); 
		
		
		//NewCustomer.setNewCustId("NewCust",1);
		
		NewCustomer.setNewCustId("EditCust",1);
		
		//NewCustomer.setNewCustId("DeleteCust",1);
		
		//WebdriverCommonLib.CaptureScreenshot();
		
		
		
  }

  
  @Test(priority = 2,dependsOnMethods = {"NewCustomer"})
  public void NewAccount() throws EncryptedDocumentException, IOException ,InvalidFormatException{
	  
	  
	  //AssertJUnit.assertEquals(Navigation.navigateToNewAccount(), true);
		
		//NewCustomer.AddNewCust("Sheet1",1);
	  
	  //AssertJUnit.assertEquals(NewAccount.AddNewAccount("NewCust",1), true);
	  
	  log.info(Navigation.navigateToNewAccount()?"Successfully navigated to New Account page":"Navigation failed");

	  log.info(NewAccount.AddNewAccount("EditCust",1)?"Successfully entered New Account details":"Entering New Account details failed");
		
		
	 // WebdriverCommonLib.CaptureScreenshot();
		
		NewAccount.setActId("EditCust", 1);
  }

  
  @Test(priority = 3,dependsOnMethods = {"NewAccount"})
   public void Deposit() throws EncryptedDocumentException, IOException, InvalidFormatException {
	  
	 // AssertJUnit.assertEquals(Navigation.NavigateToDepositAccount(), true); 
	  
	 // AssertJUnit.assertEquals(Deposit.DepositAmt("EditCust", 1), true);
	  
	  log.info(Navigation.NavigateToDepositAccount()?"Successfully navigated to Deposit Amount page":"Deposit Amount navigation failed");

	  log.info(Deposit.DepositAmt("EditCust", 1)?"Successfully entered  Deposit Amount page details":"Entering Deposit Amount page details failed");
		
		//WebdriverCommonLib.CaptureScreenshot();
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
	  
	  Login.login();
	 
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
	  Login.logout();
	  WebdriverCommonLib.checkAlert_Accept();
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");

	  Driver.hitURL(GenericConstant.Url);
	  
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() throws EncryptedDocumentException, IOException, InvalidFormatException {
	  if (WebdriverCommonLib.getexdata("Newcust", 1, 0).equalsIgnoreCase("YES"))
		  
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
