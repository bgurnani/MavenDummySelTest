package GenericLib;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	
	private static ExtentReports extent;
	
	
	public static ExtentReports getInstance(){
		
		java.util.Date today = Calendar.getInstance().getTime();
		 
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");

		String timestamp = formatter.format(today);
		
		if(extent==null){
			
			
			extent = new ExtentReports(System.getProperty("user.dir")+"//target//surefire-reports//html//extent"+timestamp+".html",true,DisplayOrder.OLDEST_FIRST);
			
			
			extent.loadConfig(new File(System.getProperty("user.dir")+"//resources//extentconfig//ReportsConfig.xml"));
			
		}
		
		return extent;
		
	}

}
