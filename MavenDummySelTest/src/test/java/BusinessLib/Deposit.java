package BusinessLib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import GenericLib.GenericConstant;
//import GenericLib.Transaction;
import GenericLib.WebdriverCommonLib;
//import GenericLib.of;
import PageObjectRepo.DepositObj;
import PageObjectRepo.LoginObj;
import PageObjectRepo.NewAccountObj;
import junit.framework.Assert;

public class Deposit {
	
public static DepositObj getObj() {
		
		return PageFactory.initElements(Driver.driver, DepositObj.class);
		
}

public static boolean DepositAmt(String Sheet,int row) throws EncryptedDocumentException, IOException, InvalidFormatException {
	
	
	System.out.println(WebdriverCommonLib.getexdata(Sheet, row, 14));
	
	System.out.println(WebdriverCommonLib.getexdata(Sheet, row, 15));
	
	System.out.println(WebdriverCommonLib.getexdata(Sheet, row, 16));
	
	getObj().getAcctNo().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 14));
	
	getObj().getAmount().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 15));
	
	getObj().getDescription().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 16));
	
	getObj().getSubmitbtn().click();
	
	//String Deptxt=GenericConstant.Depositxt+WebdriverCommonLib.getTextProp(getObj().getTransactionId());
	
	//Assert.assertEquals(Deptxt, WebdriverCommonLib.getTextProp(getObj().getTransactionText()));
	
	//Assert.assertNotNull(getObj().getTransactionId());
	
	//boolean DepositAccountsuccess=;
	
	return getObj().getTransactionId().isDisplayed();
	

	
	
	
}

public static String getTransactiontext() {
	
	return getObj().getTransactionId().getText();
	
}



}
