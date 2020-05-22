package test;

import java.io.IOException;

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

import BusinessLib.EditCustomer;
import BusinessLib.Login;
import BusinessLib.Navigation;
import BusinessLib.NewCustomer;
import GenericLib.Driver;
import GenericLib.GenericConstant;
import GenericLib.WebdriverCommonLib;
import resources.Log;

public class EditCustomerTest {
	
	//private static final Logger log = Logger.getLogger(EditCustomerTest.class.getName()); 
	
	@Test(groups = { "functest"})
	  public void EditCustomer() throws EncryptedDocumentException, IOException, InvalidFormatException {
		  
		  
		 
		  
	      System.out.println("Inside Test method");
	      
	     
		  
		  //AssertJUnit.assertEquals(Navigation.navigateToEditCustomer(), true);
		  
		  
		 // EditCustomer.EditCustForm("EditCust",1);
		  
		//  EditCustomer.EditCust("sheet1", 2);
		  
		 
		  
		 // AssertJUnit.assertEquals(EditCustomer.EditCust("EditCust", 1), true);
		  
		  Log.info(Navigation.navigateToEditCustomer()?"Successfully navigated to Edit customer form":"Edit customer form navigation failed");
		  
		  //AssertJUnit.assertEquals(NewCustomer.AddNewCust("NewCust",1), true);
		  
		  Log.info(EditCustomer.EditCustForm("EditCust",1)?"Successfully navigated to Edit customer page":"Edit customer page navigation failed");
		  
		  EditCustomer.clearCustForm();
		  
		  Log.info(EditCustomer.EditCust("EditCust", 1)?"Successfully edited customer details":"Entering Edit Customer page details failed"); 
		
		
		  Log.info("Customer id:"+EditCustomer.getUpdatedCustid() +" updated ");
		  
		
		  Reporter.log("Customer id:"+EditCustomer.getUpdatedCustid() +" updated ");
		  
		  EditCustomer.setEditCustId("EditCust", 1);
		  
		  NewCustomer.setNewCustId("DeleteCust",1);
		  
			
			//WebdriverCommonLib.CaptureScreenshot();
			
			
			
			
			
	  }

	
	/*@Test()
	  public void EditCustomer2() throws EncryptedDocumentException, IOException {
		  
		  
		 
		  
	      System.out.println("Inside Test method");
	      
	     
		  
		  AssertJUnit.assertEquals(Navigation.navigateToEditCustomer(), true);
		  
		  
		  EditCustomer.EditCustForm("EditCust",2);
		  
		//  EditCustomer.EditCust("sheet1", 2);
		  
		  EditCustomer.clearCustForm();
		  
		  AssertJUnit.assertEquals(EditCustomer.EditCust("sheet1", 2), true);
		
		  Reporter.log("Customer id:"+EditCustomer.getUpdatedCustid() +" updated ");
		  
		  EditCustomer.setEditCustId("EditCust", 2);
		  
			
			WebdriverCommonLib.CaptureScreenshot();
			
			
			
			
			
	  }


	@Test()
	  public void EditCustomer3() throws EncryptedDocumentException, IOException {
		  
		  
		 
		  
	      System.out.println("Inside Test method");
	      
	     
		  
		  AssertJUnit.assertEquals(Navigation.navigateToEditCustomer(), true);
		  
		  
		  EditCustomer.EditCustForm("EditCust",3);
		  
		//  EditCustomer.EditCust("sheet1", 2);
		  
		  EditCustomer.clearCustForm();
		  
		  AssertJUnit.assertEquals(EditCustomer.EditCust("sheet1", 2), true);
		
		  Reporter.log("Customer id:"+EditCustomer.getUpdatedCustid() +" updated ");
		  
		  EditCustomer.setEditCustId("EditCust",3);
		  
			
			WebdriverCommonLib.CaptureScreenshot();
			
			
			
			
			
	  }
*/

	  
	  	
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
	if (WebdriverCommonLib.getexdata("EditCust", 1, 0).equalsIgnoreCase("YES"))
		  
	  {
		  Driver.openBrowser(WebdriverCommonLib.getBrowserName("Browser", 1, 0));
		  //WebdriverCommonLib.invokelogConfig();
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
