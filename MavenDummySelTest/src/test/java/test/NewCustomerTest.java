package test;

//import static org.slf4j.LoggerFactory.getLogger;

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

import BusinessLib.Login;
import BusinessLib.Navigation;
import BusinessLib.NewCustomer;
import GenericLib.Driver;
import GenericLib.GenericConstant;
import GenericLib.WebdriverCommonLib;
import resources.Log;


public class NewCustomerTest {
  
	//private static final Logger log = Logger.getLogger(NewCustomerTest.class.getName());
	
	//private static final Logger log=LogManager.getLogger(NewCustomerTest.class.getName());
	
	//Logger.getLogger(CustomListeners.class.getName());
	
	  @Test(groups = { "functest"}) 
	  public void NewCustomer() throws EncryptedDocumentException, IOException, InvalidFormatException {
		  
		  
		 
		  
	      System.out.println("Inside Test method");
	      
	     
	     
		  
		 // AssertJUnit.assertEquals(Navigation.NavigateToNewCustomer(), true);
		  
		  Log.info(Navigation.NavigateToNewCustomer()?"Successfully navigated to customer page":"Customer page navigation failed");
		  
		 // AssertJUnit.assertEquals(NewCustomer.AddNewCust("NewCust",1), true);
		  
		  Log.info(NewCustomer.AddNewCust("NewCust",1)? "Customer details entered successfully": "Entering customer details failed ");
		  
		
		  Reporter.log("New Customer id:"+NewCustomer.getNewCustid() +"created ");
		  
          //log.info("New Customer id:"+NewCustomer.getNewCustid() +"created ");
          
       //  log.info(AssertJUnit.assertEquals(NewCustomer.AddNewCust("NewCust",1), true));
         
         //log.assertLog((AssertJUnit.assertEquals(NewCustomer.AddNewCust("NewCust",1), true)), "New Customer created ");
         
       //  log.ass
         
		  
		  
		  NewCustomer.setNewCustId("NewCust",1);
		  
		  NewCustomer.setNewCustId("EditCust",1);
		  
		  NewCustomer.setNewCustId("DeleteCust",1);
		  
		  //String s1= System.getProperty("user.dir")+"/Screenshots/snaperror.png";
		  
		  //System.out.println(s1);
		  
		  
		//  LOGGER.info("New Customer created");
		  //file:///Users/bharatgurnani/eclipse-workspace/Dummy_Test/test-output/html/s1
		  
		  
			
			
		 // WebdriverCommonLib.getTextProp(getObj().getNewcustid())
			
			//WebdriverCommonLib.CaptureScreenshot();
			
			
			
			
			
	  }

	  /*
	  @Test()
	  public void NewCustomer2() throws EncryptedDocumentException, IOException {
		  
		
	      AssertJUnit.assertEquals(Navigation.NavigateToNewCustomer(), true);
		  
		  AssertJUnit.assertEquals(NewCustomer.AddNewCust("Sheet1",2), true);
		
		  Reporter.log("New Customer id:"+NewCustomer.getNewCustid() +"created ");
		 // LOGGER.info("New Customer created");
			
			
          NewCustomer.setNewCustId("Sheet1",2);
		  
		  NewCustomer.setNewCustId("EditCust",2);
			
			//Assert.fail("Customer not added");
			
			//WebdriverCommonLib.CaptureScreenshot();
	  }

	  
	  @Test()
	   public void NewCustomer3() throws EncryptedDocumentException, IOException {
		  
		  
	      AssertJUnit.assertEquals(Navigation.NavigateToNewCustomer(), true);
		  
		  AssertJUnit.assertEquals(NewCustomer.AddNewCust("Sheet1",3), true);
		
		  Reporter.log("New Customer id:"+NewCustomer.getNewCustid() +"created ");
		  //LOGGER.info("New Customer created");
			
			
          NewCustomer.setNewCustId("Sheet1",3);
		  
		  NewCustomer.setNewCustId("EditCust",3);
			
			//Assert.fail("Customer not added");
			
			//WebdriverCommonLib.CaptureScreenshot();	  
	  }
	  */

	
	@BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
	  //Login.logout();
	  //WebdriverCommonLib.checkAlert_Accept();
	 // Driver.driver.quit();
	  
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
	  
	 
	  
	  if (WebdriverCommonLib.getexdata("Newcust", 1, 0).equalsIgnoreCase("YES") )
	  
	  {
		  Driver.openBrowser(WebdriverCommonLib.getBrowserName("Browser", 1, 0));
		 
		  //BasicConfigurator.configure();
		  
		 /* if (WebdriverCommonLib.getexdata("Newcust", 1, 1).equalsIgnoreCase("YES")) 
		  {
		  WebdriverCommonLib.invoke_VideoRecording();
		  }*/
	  }
	  else
	  {
		  throw new SkipException("Skipping the test case as Runmode for the data is set as NO"); 
	}	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest()   {
	  Driver.driver.quit();
	  
	  /*if (WebdriverCommonLib.getexdata("Newcust", 1, 1).equalsIgnoreCase("YES")) 
	  {
		  WebdriverCommonLib.stop_recording();
	  }*/
	  
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
