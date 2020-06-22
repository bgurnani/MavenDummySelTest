package GenericLib;

import org.openqa.selenium.firefox.FirefoxBinary.Channel;

public interface GenericConstant {
	
	String chromepath =System.getProperty("user.dir")+"//resources//Chrome//chromedriver";
	String firefoxpath =System.getProperty("user.dir")+"//resources//Firefox//geckodriver";

	
	String excelPath=System.getProperty("user.dir")+"//Excel//POIdemo.xlsx";
	String username="mngr267513";
	String password="jUsUmyr";
	String Url="http://demo.guru99.com/V4/";
	String Depositxt = "Transaction details of Deposit for Account";
	
	

}
