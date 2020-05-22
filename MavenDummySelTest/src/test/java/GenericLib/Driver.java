package GenericLib;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxBinary.Channel;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
	
	
	public static WebDriver driver;
	
	public static void openChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver",GenericConstant.chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void hitURL(String Url) {
		driver.get(Url);
	}
	
	public static void openBrowser(String Browsername) {
		
		   // Browsername=GenericConstant.browserName;
		    System.out.println(Browsername);
		    
		   
		    
		    switch (Browsername.toUpperCase()) {
		    
		   
			case "FIREFOX":
				
				System.out.println(GenericConstant.firefoxpath);
				System.setProperty("webdriver.gecko.driver",GenericConstant.firefoxpath);
				
			/*
			 * DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			 * capabilities.setCapability("marionette",false); driver = new
			 * FirefoxDriver(capabilities); driver.manage().window().maximize();
			 */
				
			  
				
				
				
				//FirefoxProfile firefoxProfile = new FirefoxProfile();
				//driver = new FirefoxDriver(firefoxBinary,firefoxProfile);
				//driver=(WebDriver)new FirefoxDriver(irefoxBinary,firefoxProfile);
				// driver=(WebDriver)new FirefoxDriver(service, options);
			   
			   
			/*
			 * File pathToBinary = new File(GenericConstant.firefoxpath); FirefoxBinary
			 * firefoxBinary = new FirefoxBinary(pathToBinary); DesiredCapabilities desired
			 * = DesiredCapabilities.firefox(); FirefoxOptions options = new
			 * FirefoxOptions(); options.setCapability("marionette", true);
			 * options.merge(desired); desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS,
			 * options.setBinary(firefoxBinary));
			 */
			   
			/*
			 * org.openqa.selenium.firefox.ProfilesIni profile= new
			 * org.openqa.selenium.firefox.ProfilesIni();
			 * 
			 * FirefoxProfile myproProfile=profile.getProfile("default");
			 * 
			 * DesiredCapabilities dc=DesiredCapabilities.firefox();
			 * 
			 * dc.setCapability(FirefoxDriver.PROFILE, myproProfile);
			 * 
			 * dc.setCapability("marionette", true);
			
				*/
			
			 
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
				
			case "CHROME":
				System.out.println(GenericConstant.chromepath);
				System.setProperty("webdriver.chrome.driver",GenericConstant.chromepath);
				
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
				
			
				
			case "IE":	
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
			    break;

			default:
				
				System.out.println("Invalid browser :" +Browsername);
			    System.exit(0);
			    break;
			    
				
			}
	}
			


}
