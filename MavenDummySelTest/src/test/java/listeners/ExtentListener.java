package listeners;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.PropertyConfigurator;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//import com.w2a.utilities.TestUtil;


import GenericLib.ExtentManager;
import GenericLib.WebdriverCommonLib;
import resources.Log;



public class ExtentListener implements ITestListener,ISuiteListener{
	
	
	//private static ExtentReports extent;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	
	
	
	public 	String messageBody;
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
java.util.Date today = Calendar.getInstance().getTime();

	    
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");

	   
	    String timestamp = formatter.format(today);
	
	
	    System.setProperty("current.date", timestamp);
		
		PropertyConfigurator.configure("./src/test/java/resources/log4j.properties");

		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		
		
    System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		/*try {
			WebdriverCommonLib.CaptureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//Reporter.log("Capturing screenshot");
		
		Reporter.log("<br>");
		
		//Reporter.log(result.getTestName());
		
		Reporter.log(arg0.getTestName());
		
		//log.info(result.getTestName()+"  :Test Case passed");
		
		//log.info(result.getMethod().getMethodName()+ "Test Case passed");;
		
		Log.info(arg0.getMethod().getMethodName()+ " Test Case failed");
		
		//Reporter.log("<a href=\"/Users/bharatgurnani/eclipse-workspace/Dummy_Test/Screenshots/snaperror.png\"><img src=\"/Users/bharatgurnani/eclipse-workspace/Dummy_Test/Screenshots/snaperror.png\" height=200 width=200></a>");
		
	
			Reporter.log("Click to see Screenshot");
			try {
				Reporter.log("<a target=\"_blank\" href="+WebdriverCommonLib.CaptureScreenshot()+">Screenshot</a>");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Reporter.log("<br>");
			Reporter.log("<br>");
		
		
			try {
				Reporter.log("<a target=\\\"_blank\\\" href="+WebdriverCommonLib.CaptureScreenshot()+"><img src="+WebdriverCommonLib.CaptureScreenshot()+" height=200 width=200></img></a>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+"><img src="+TestUtil.screenshotName+" height=200 width=200></img></a>");		
	


		test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+" Failed with exception : "+arg0.getThrowable());
			//test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));
		rep.endTest(test);
		rep.flush();


		
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestSkipped(ITestResult arg0) {


		test.log(LogStatus.SKIP, arg0.getName().toUpperCase()+" Skipped the test as the Run mode is NO");
		rep.endTest(test);
		rep.flush();
		
	}


	public void onTestStart(ITestResult arg0) {

		test = rep.startTest(arg0.getName().toUpperCase());
	
	}

	public void onTestSuccess(ITestResult arg0) {

		
		
     System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		/*try {
			WebdriverCommonLib.CaptureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	
		
		Reporter.log("<br>");
		
		//Reporter.log(result.getTestName());
		
		Reporter.log(arg0.getTestName());
		
		//test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+" Failed with exception : "+arg0.getThrowable());
		test.log(LogStatus.PASS, arg0.getName().toUpperCase()+" PASS");
		try {
			test.log(LogStatus.PASS, test.addScreenCapture(WebdriverCommonLib.CaptureScreenshot()));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		
		Log.info(arg0.getMethod().getMethodName()+ " Test Case passed");
		
		//Reporter.log("<a href=\"/Users/bharatgurnani/eclipse-workspace/Dummy_Test/Screenshots/snaperror.png\"><img src=\"/Users/bharatgurnani/eclipse-workspace/Dummy_Test/Screenshots/snaperror.png\" height=200 width=200></a>");
		
	
		Reporter.log("Click to see Screenshot");
		try {
			Reporter.log("<a target=\"_blank\" href="+WebdriverCommonLib.CaptureScreenshot()+">Screenshot</a>");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Reporter.log("<br>");
		Reporter.log("<br>");
	
	
		/*try {
			Reporter.log("<a target=\\\"_blank\\\" href="+WebdriverCommonLib.CaptureScreenshot()+"><img src="+WebdriverCommonLib.CaptureScreenshot()+" height=200 width=200></img></a>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	
		
		
			try {
				Reporter.log("<a href="+WebdriverCommonLib.CaptureScreenshot()+"><img src="+WebdriverCommonLib.CaptureScreenshot()+" height=200 width=200></a>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
	


		
		rep.endTest(test);
		rep.flush();
		
	}

	public void onFinish(ISuite arg0) {
		
		
		
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
