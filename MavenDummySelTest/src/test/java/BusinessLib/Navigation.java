package BusinessLib;

import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import GenericLib.WebdriverCommonLib;
import PageObjectRepo.HomeObj;
import PageObjectRepo.NewCustomerObj;

public class Navigation {
	
	public static boolean NavigateToNewCustomer() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getNewCustomer().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
		//boolean navigatetoNewcustsuccess=NewCustomer.getObj().getcustomName().isDisplayed();
		return NewCustomer.getObj().getcustomName().isDisplayed();
		
	}
	
   public static boolean navigateToEditCustomer() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getEditCustomer().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
		return EditCustomer.getEditObj().getcustomId().isDisplayed();
	    
	}

   public static boolean navigateToDeleteCustomer() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getDeleteCustomer().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
		return DeleteCustomer.getObj().getcustomId().isDisplayed();
	}
   
   public static boolean navigateToNewAccount() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getAddAccount().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
		//boolean navigatetoNewacctsuccess=;
		return NewAccount.getObj().getcustomId().isDisplayed();
	}
  
   
   public static void navigateToEditAccount() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.geteditAccount().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
	}
   
   public static void navigateToDeleteAccount() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getdeleteAccount().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
	}
   
   public static  boolean NavigateToDepositAccount() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getdepositAccount().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
		//boolean navigatetoNewDepositAccountsuccess=;
		return Deposit.getObj().getAcctNo().isDisplayed();
		
	}
   
   public static void navigateToWithdrawal() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getwithdrawalAccount().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
	}
   
   
   public static void navigateToFundTransfer() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getfundTransfer().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
	}
   
   public static void navigateToChangePassword() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getchangePassword().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
	}
   
   public static void navigateToBalanceEnquiry() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getBalEnqInput().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
	}
   
   
   public static void navigateToMiniStatement() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getminiStatement().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
	}
   
   
   public static void navigateToCustomStatement() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getcustomStatement().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
	}
   
   public static void navigateToLogOut() {
		
		HomeObj ho = PageFactory.initElements(Driver.driver, HomeObj.class);
		ho.getlogOut().click();
		WebdriverCommonLib.waitForPageToLoad();
		ho=null;
	}
   
   
   
}
