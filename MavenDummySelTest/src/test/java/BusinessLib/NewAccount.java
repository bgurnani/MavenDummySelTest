package BusinessLib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import GenericLib.WebdriverCommonLib;
import PageObjectRepo.NewAccountObj;
import PageObjectRepo.NewCustomerObj;

public class NewAccount {
	
	public static NewAccountObj getObj() {
		
		return PageFactory.initElements(Driver.driver, NewAccountObj.class);
		
	}
	
	
public static boolean AddNewAccount(String Sheet,int row) throws EncryptedDocumentException, IOException,InvalidFormatException {
	
	getObj().getcustomId().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 11));
	
	WebdriverCommonLib.selectByVisibleText(getObj().getaccountType(), WebdriverCommonLib.getexdata(Sheet, row, 12));
	
	getObj().getinitdeposite().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 13));
	
	getObj().getsubmitbtn().click();
	
	//boolean AddNewAccountsuccess=getObj().getNewActid().isDisplayed();
	
	return getObj().getNewActid().isDisplayed();
	
	
	
	
	
}

public static void setActId(String Sheet,int row) throws InvalidFormatException  {
	
	
	
	String s2=WebdriverCommonLib.getTextProp(getObj().getNewActid());
	
	System.out.println(s2);
	
	try {
		WebdriverCommonLib.setexdata(Sheet,row,14,s2);
	} catch (EncryptedDocumentException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static String getNewAcctid() {
	
	return getObj().getNewActid().getText();
	
}


}
