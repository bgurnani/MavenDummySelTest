package BusinessLib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import GenericLib.WebdriverCommonLib;
import PageObjectRepo.EditCustomerObj;
import PageObjectRepo.HomeObj;
import PageObjectRepo.NewCustomerObj;

public class EditCustomer {
	
public static void navigateToEditCustomer() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getEditCustomer().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
	}

public static NewCustomerObj getNewObj() {
	
	return PageFactory.initElements(Driver.driver, NewCustomerObj.class);
	
}

public static EditCustomerObj getEditObj() {
	
	return PageFactory.initElements(Driver.driver, EditCustomerObj.class);
	
}

public static boolean EditCustForm(String Sheet,int row) throws EncryptedDocumentException, IOException, InvalidFormatException
{
	getEditObj().getcustomId().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 11));
	getNewObj().getSubmitbtn().click();
	
	return getNewObj().getAddress().isDisplayed();
	

}



public static void clearCustForm() {
	
	WebdriverCommonLib.clearTextField(getNewObj().getAddress());
	
	WebdriverCommonLib.clearTextField(getNewObj().getCity());
	
	WebdriverCommonLib.clearTextField(getNewObj().getState());
	
	WebdriverCommonLib.clearTextField(getNewObj().getPin());
	
	WebdriverCommonLib.clearTextField(getNewObj().getTelephoneno());
	
	
	
	
}


public static boolean EditCust(String Sheet,int row) throws EncryptedDocumentException, IOException ,InvalidFormatException{
	
	
	

	
	
	
	
	
	
	
	getNewObj().getAddress().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 4));
	
	getNewObj().getCity().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 5));
	
	getNewObj().getState().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 6));
	
	getNewObj().getPin().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 7));
	
	getNewObj().getTelephoneno().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 8));
	
	//String s1 =WebdriverCommonLib.getexdata("Sheet1", row, 7)) WebdriverCommonLib.getRandomString(2);
	
	String s1=WebdriverCommonLib.getexdata(Sheet, row, 9)+WebdriverCommonLib.getRandomString(10);
	
	getNewObj().getEmailId().sendKeys(s1);
	
	//getNewObj().getpassword().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 8));
	
	getNewObj().getSubmitbtn().click();
	
	//boolean custsuccess=getObj().getNewcustid().isDisplayed();
	
	return getNewObj().getNewcustid().isDisplayed();

	
	
	

	
	
}




public static void setEditCustId(String Sheet,int row) throws InvalidFormatException  {
	
	
	
	String s2=WebdriverCommonLib.getTextProp(getNewObj().getNewcustid());
	
	//WebdriverCommonLib.getexdata(sheet, row, column)
	
	System.out.println(s2);
	
	try {
		WebdriverCommonLib.setexdata(Sheet,row,10,s2);
	} catch (EncryptedDocumentException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static String getUpdatedCustid() {
	
	return getNewObj().getNewcustid().getText();
	
}

  

}


