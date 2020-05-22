package GenericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.Timestamp;
import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

//import atu.testrecorder.ATUTestRecorder;
//import atu.testrecorder.exceptions.ATUTestRecorderException;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class WebdriverCommonLib {
	
	//public static  ATUTestRecorder recorder ;
	
	public static void waitForPageToLoad() {
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void goForward() {
		Driver.driver.navigate().forward();
	}
	public static void goBack() {
		Driver.driver.navigate().back();
	}
	public static void refresh() {
		Driver.driver.navigate().refresh();
	}
	
	public static String getRandomString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                   
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
	
	
	public static void selectByVisibleText(String xpath , String Value) {
		
	Select sel = new Select(Driver.driver.findElement(By.xpath(xpath)));
	sel.selectByVisibleText(Value);
	sel=null;
	}
	
	
	public static void selectByVisibleText(WebElement element , String Value) {
		
		Select sel = new Select(element);
		sel.selectByVisibleText(Value);
		sel=null;
		}
	
	
public static String getexdata(String sheet,int row,int column) throws EncryptedDocumentException, IOException, InvalidFormatException {
		
		FileInputStream fis=new FileInputStream(GenericConstant.excelPath);
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sh=wb.getSheet(sheet);
		
		Row r1=sh.getRow(row);
		
		Cell c1=r1.getCell(column);
		
		String s1=c1.getStringCellValue();
		
		wb.close();
		
		return s1;
		
		
		
	}
	

public static void setexdata(String sheet,int row,int column,String data) throws EncryptedDocumentException, IOException, InvalidFormatException {
	
	FileInputStream fis=new FileInputStream(GenericConstant.excelPath);
	
	Workbook wb=WorkbookFactory.create(fis);
	
	Sheet sh=wb.getSheet(sheet);
	
	Row r1=sh.getRow(row);
	
	Cell c1=r1.getCell(column);
	
	System.out.println(sheet+" "+row+" "+column+" "+data);
	
	//System.out.println(data);
	
	c1.setCellValue(data);
	
	FileOutputStream fos=new FileOutputStream(GenericConstant.excelPath);
	
	wb.write(fos);
	wb.close();
	
	System.out.println("done");
	
	
	}


public static String getTextProp(WebElement e) {
	return (e.getText());
	
	}

public static java.sql.Timestamp Currenttimestamp() {
	
	
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	 
	
	 Date date = new Date(0);
	 
	 
	 
	 long time = date.getTime();
     System.out.println("Time in Milliseconds: " + time);
 
    
     java.sql.Timestamp ts=new java.sql.Timestamp(System.currentTimeMillis());
     
     System.out.println(ts);
     
     return ts;
	 
	
}


public static String CaptureScreenshot() throws IOException {
	//File src= ((TakesScreenshot)Driver.driver).getScreenshotAs(OutputType.FILE);
	//java.sql.Timestamp timestamp=Currenttimestamp();
	
	 java.util.Date today = Calendar.getInstance().getTime();

	    // (2) create a date "formatter" (the date format we want)
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");

	    // (3) create a new String using the date format we want
	    String timestamp = formatter.format(today);
	
	//Date d=new Date(0);
	
	//String Filename=d.toString().replace(":","_").replace(" ", " ")+".jpg";
	//String Filename=System.getProperty("user.dir")+"/Screenshots/snap"+d.toString().replace(":","_").replace(" ", " ")+".jpg";
	
	String Filename=System.getProperty("user.dir")+"/Screenshots/snap"+timestamp+".png";
	System.out.println(Filename);
	
	//Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(200)).takeScreenshot(Driver.driver); 
	
	
	//System.out.println(Filename);
	
	TakesScreenshot scrShot =((TakesScreenshot)Driver.driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile=new File(Filename);
	FileUtils.copyFile(SrcFile, DestFile);
	return(Filename);
	
	
//	try {
//		 // now copy the  screenshot to desired location using copyFile //method
//	//	FileUtils.copyFile(src, new File(Filename));
//		//ImageIO.write(screenshot.getImage(),"PNG",new File(Filename));
//		}
//		 
//		catch (IOException e)
//		 {
//		  System.out.println(e.getMessage());
//		 
//		 }
	
}

public static void dragAndDrop(WebElement fromWebElement,
	WebElement toWebElement) {
	Actions builder = new Actions(Driver.driver);
	builder.dragAndDrop(fromWebElement, toWebElement);
	}

  
public static void pressKeyDown(WebElement element) {
	element.sendKeys(Keys.DOWN);
	}
	
public void pressKeyEnter(WebElement element) {
	element.sendKeys(Keys.ENTER);
	}
	
public static void pressKeyUp(WebElement element) {
	element.sendKeys(Keys.UP);
	}

public static void clearTextField(WebElement element) {
	element.clear();

}

public static boolean checkAlert_Accept() {
	try {
	Alert a = (Driver.driver).switchTo().alert();
	String str = a.getText();
	System.out.println(str);
	
	a.accept();
	return true;
	
	} catch (Exception e) {
	
	System.out.println("no alert");
	return false;
	
	}
}

public static boolean checkAlert_Dismiss() {
	try {
	Alert a = (Driver.driver).switchTo().alert();
	String str = a.getText();
	System.out.println(str);
	
	a.dismiss();
	return true;
	
	} catch (Exception e) {
	
	System.out.println("no alert");
	return false;

}
}

public static String getBrowserName(String Sheet,int row,int column) throws EncryptedDocumentException, IOException, InvalidFormatException {
	
	System.out.println(Sheet+" "+row+" "+column);
	return getexdata(Sheet,row,column);
}


public static String getrandomName(){
    Faker faker = new Faker();
    return faker.name().firstName();
}


public static void invokelogConfig() {
	
	java.util.Date today = Calendar.getInstance().getTime();

    
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");

    String timestamp = formatter.format(today);

    System.setProperty("current.date", timestamp);
	
	PropertyConfigurator.configure("./src/resources/log4j.properties");
	
	//System.setProperty("log4j.configurationFile", "./src/resources/log4j2.properties");

}


/*public static void invoke_VideoRecording() throws ATUTestRecorderException {
	 
	
	
	java.util.Date today = Calendar.getInstance().getTime();
	 
	 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");

	String timestamp = formatter.format(today);

     
	 
	recorder = new ATUTestRecorder(System.getProperty("user.dir"),"//src//TestVideos//Script_Video_" + timestamp, false);

     //To start video recording.
     recorder.start();
	
}


public static void stop_recording() throws ATUTestRecorderException {
	
	recorder.stop();
	
}


/*@DataProvider(name="dp")
public Object[][] getData(Method m) {

	String sheetName = m.getName();
	int rows = excel.getRowCount(sheetName);
	int cols = excel.getColumnCount(sheetName);

	Object[][] data = new Object[rows - 1][1];
	
	Hashtable<String,String> table = null;

	for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2

		table = new Hashtable<String,String>();
		
		for (int colNum = 0; colNum < cols; colNum++) {

			// data[0][0]
			table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
			data[rowNum - 2][0] = table;
		}

	}

	return data;

}

*/




}
