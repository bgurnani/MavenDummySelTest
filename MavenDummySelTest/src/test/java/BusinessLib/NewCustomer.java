package BusinessLib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import GenericLib.WebdriverCommonLib;
import PageObjectRepo.HomeObj;
import PageObjectRepo.NewCustomerObj;

public class NewCustomer {
	
public static void navigateToNewCustomer() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		
	
		ho.getNewCustomer().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
	}

public static NewCustomerObj getObj() {
	
	return PageFactory.initElements(Driver.driver, NewCustomerObj.class);
	
}


public static boolean AddNewCust(String Sheet,int row) throws EncryptedDocumentException, IOException, InvalidFormatException {
	
	
	getObj().getcustomName().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 2));
	
	getObj().getDateOfBirth().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 3));
	
	getObj().getAddress().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 4));
	
	getObj().getCity().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 5));
	
	getObj().getState().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 6));
	
	getObj().getPin().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 7));
	
	getObj().getTelephoneno().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 8));
	
	//String s1 =WebdriverCommonLib.getexdata("Sheet1", row, 7)) WebdriverCommonLib.getRandomString(2);
	
	String s1=WebdriverCommonLib.getexdata(Sheet, row, 9)+WebdriverCommonLib.getRandomString(10);
	
	getObj().getEmailId().sendKeys(s1);
	
	getObj().getpassword().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 10));
	
	getObj().getSubmitbtn().click();
	
	//boolean custsuccess=getObj().getNewcustid().isDisplayed();
	
	return getObj().getNewcustid().isDisplayed();

	
	
	

	
	
}




public static void setNewCustId(String Sheet,int row) throws InvalidFormatException, EncryptedDocumentException, IOException  {
	
	
	
	String s2=WebdriverCommonLib.getTextProp(getObj().getNewcustid());
	
	System.out.println(s2);
	
	
		WebdriverCommonLib.setexdata(Sheet,row,11,s2);
	
	
}

public static String getNewCustid() {
	
	return getObj().getNewcustid().getText();
	
}

  

}
