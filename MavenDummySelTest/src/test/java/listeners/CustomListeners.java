package listeners;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
//import org.testng.log4testng.Logger;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import GenericLib.WebdriverCommonLib;
import resources.Log;

public class CustomListeners implements ITestListener {
	
	//public static Logger log = Logger.getLogger(CustomListeners.class.getName());
	
	//public static org.apache.log4j.Logger log=Logger.getLogger(CustomListeners.class.getName());
	
	//public static Logger log=Logger.getLogger(CustomListeners.class.getName());
	
	


	@Override
	public void onTestStart(ITestResult result) {
		
		java.util.Date today = Calendar.getInstance().getTime();

	    
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");

	   
	    String timestamp = formatter.format(today);
	
	
	    System.setProperty("current.date", timestamp);
		
		PropertyConfigurator.configure("./src/test/java/resources/log4j.properties");
		//WebdriverCommonLib.invokelogConfig();
		
		Log.info(result.getMethod().getMethodName() + " Started");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
       System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		try {
			WebdriverCommonLib.CaptureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Reporter.log("Capturing screenshot");
		
		Reporter.log("<br>");
		
		Reporter.log(result.getTestName());
		
		//log.info(result.getTestName()+"  :Test Case passed");
		
		//log.info(result.getMethod().getMethodName()+ "Test Case passed");;
		
		Log.info(result.getMethod().getMethodName()+ " Test Case passed");
		
		//Reporter.log("<a href=\"/Users/bharatgurnani/eclipse-workspace/Dummy_Test/Screenshots/snaperror.png\"><img src=\"/Users/bharatgurnani/eclipse-workspace/Dummy_Test/Screenshots/snaperror.png\" height=200 width=200></a>");
		
	
		
		
		
			try {
				Reporter.log("<a href="+WebdriverCommonLib.CaptureScreenshot()+"><img src="+WebdriverCommonLib.CaptureScreenshot()+" height=200 width=200></a>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
	
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		try {
			WebdriverCommonLib.CaptureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Reporter.log("Capturing screenshot");
		
		Reporter.log("<br>");
		
		Reporter.log(result.getName());
		
		Log.info(result.getMethod().getMethodName()+ "Test Case failed");
		
		//log.info(result.getTestName() +" : Test Case failed ");
		
		//Reporter.log("<a href=\"/Users/bharatgurnani/eclipse-workspace/Dummy_Test/Screenshots/snaperror.png\"><img src=\"/Users/bharatgurnani/eclipse-workspace/Dummy_Test/Screenshots/snaperror.png\" height=200 width=200></a>");
		
	
		
		
		
			try {
				Reporter.log("<a href="+WebdriverCommonLib.CaptureScreenshot()+"><img src="+WebdriverCommonLib.CaptureScreenshot()+" height=200 width=200></a>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//log.info(context.getName()+ ": Test Case started");
		Log.info(context.getName()+ ": Test Case started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		//log.info(context.getName()+ ": Test Case finished");
		
		Log.info(context.getName()+ ": Test Case finished");
		
	
		
	}

}
