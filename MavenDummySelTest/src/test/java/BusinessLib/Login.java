package BusinessLib;

import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import GenericLib.GenericConstant;
import GenericLib.WebdriverCommonLib;
import PageObjectRepo.HomeObj;
import PageObjectRepo.LoginObj;
import PageObjectRepo.NewAccountObj;

public class Login {
	
public static HomeObj getHomeObj() {
		
		return PageFactory.initElements(Driver.driver, HomeObj.class);
		
	}
	
	public static void login() {
		LoginObj lo = PageFactory.initElements(Driver.driver, LoginObj.class);
		lo.getUsername().sendKeys(GenericConstant.username);
		lo.getPassword().sendKeys(GenericConstant.password);
		lo.getLoginBtn().click();
		WebdriverCommonLib.waitForPageToLoad();
	}

	
	public static void logout() {
		//LoginObj lo = PageFactory.initElements(Driver.driver, LoginObj.class);
		System.out.println("Inside logout");
	    getHomeObj().getlogOut().click();;
		WebdriverCommonLib.waitForPageToLoad();
	}
	
}
