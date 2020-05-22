package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.AssertJUnit;
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
import BusinessLib.EditCustomer;
import BusinessLib.Login;
import BusinessLib.Navigation;
import BusinessLib.NewAccount;
import BusinessLib.NewCustomer;
import GenericLib.Driver;
import GenericLib.GenericConstant;
import GenericLib.WebdriverCommonLib;

public class IntegrationEditCustTest {

	@Test(priority = 1)
	  public void NewCustomer() throws EncryptedDocumentException, IOException, InvalidFormatException {
		  
		  
		  
		  AssertJUnit.assertEquals(Navigation.NavigateToNewCustomer(), true);
		  
		  AssertJUnit.assertEquals(NewCustomer.AddNewCust("NewCust",1), true);
		  
		  Reporter.log("New Customer id:"+NewCustomer.getNewCustid() +" created ");
			
			
			
			NewCustomer.setNewCustId("NewCust",1);
			
			NewCustomer.setNewCustId("EditCust",1);
			
			 NewCustomer.setNewCustId("DeleteCust",1);
			
		//	WebdriverCommonLib.CaptureScreenshot();
			
			//Assert.fail("Bye Bye");
			
			
			
	  }
	
	
	@Test(priority = 2,dependsOnMethods = { "NewCustomer" })
	  public void EditCustomer() throws EncryptedDocumentException, IOException, InvalidFormatException {
		  
		  
		 
		  
	      System.out.println("Inside Edit Cust  method");
	      
	     
		  
		  AssertJUnit.assertEquals(Navigation.navigateToEditCustomer(), true);
		  
		  
		  EditCustomer.EditCustForm("EditCust",1);
		  
		//  EditCustomer.EditCust("sheet1", 2);
		  
		  EditCustomer.clearCustForm();
		  
		  AssertJUnit.assertEquals(EditCustomer.EditCust("EditCust", 1), true);
		
		  Reporter.log("Customer id:"+EditCustomer.getUpdatedCustid() +" updated ");
		  
		  EditCustomer.setEditCustId("EditCust", 1);
		  
			
			//WebdriverCommonLib.CaptureScreenshot();
			
			
			
			
			
	  }

	  
	  @Test(priority = 3,dependsOnMethods = { "NewCustomer" })
	  public void NewAccount() throws EncryptedDocumentException, IOException, InvalidFormatException {
		  
		  
		  AssertJUnit.assertEquals(Navigation.navigateToNewAccount(), true);
			
			//NewCustomer.AddNewCust("Sheet1",1);
		  
		  AssertJUnit.assertEquals(NewAccount.AddNewAccount("EditCust",1), true);
			
			
		 // WebdriverCommonLib.CaptureScreenshot();
		  
		  Reporter.log("Account id:"+NewAccount.getNewAcctid() +" created ");
			
			NewAccount.setActId("EditCust", 1);
	  }

	  
	  @Test(priority = 4,dependsOnMethods = { "NewCustomer" })
	   public void Deposit() throws EncryptedDocumentException, IOException, InvalidFormatException {
		  
		  AssertJUnit.assertEquals(Navigation.NavigateToDepositAccount(), true); 
		  
		  AssertJUnit.assertEquals(Deposit.DepositAmt("EditCust", 1), true);
		  
		  Reporter.log("Transaction :"+Deposit.getTransactiontext() +" done successfully ");
		  
		  
			
			//WebdriverCommonLib.CaptureScreenshot();
		  
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  
		  
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
		  if (WebdriverCommonLib.getexdata("EditCust", 1, 0).equalsIgnoreCase("YES"))
			  
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
