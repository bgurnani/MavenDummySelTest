package BusinessLib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import GenericLib.WebdriverCommonLib;
import PageObjectRepo.DeleteCustomerObj;

public class DeleteCustomer {
	
	
public static DeleteCustomerObj getObj() {
		
		return PageFactory.initElements(Driver.driver, DeleteCustomerObj.class);
		
	}


public static  void DeleteCust(String Sheet,int row) throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException {
	
	getObj().getcustomId().sendKeys(WebdriverCommonLib.getexdata(Sheet, row, 11));
	
	getObj().getsubmitbtn().click();
	
	//Driver.driver.switchTo().alert().accept();
	
	//Thread.sleep(1000);
	
	//Driver.driver.switchTo().alert().accept();
	
	
	
}


}
