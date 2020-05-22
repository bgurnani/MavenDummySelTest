package PageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerObj {
	
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement customName;
	
	public WebElement getcustomName() {
		return customName;
		
	}
	
	//@FindBy(xpath="//input[@name='dob']")
	@FindBy(css="input[name='dob']")
	private WebElement DateOfBirth;
	
	public WebElement getDateOfBirth() {
		return DateOfBirth;
		
	}
	
	@FindBy(xpath="//textarea[@name='addr']")
	private WebElement Address;
	
	public WebElement getAddress() {
		return Address;
		
	}
	
	
//	@FindBy(xpath="//input[@name='city']")
	@FindBy(css="input[name='city']")
	private WebElement City;
	
	public WebElement getCity() {
		return City;
		
	}
	
	//@FindBy(xpath="//input[@name='state']")
	@FindBy(css="input[name='state']")
	private WebElement State;
	
	public WebElement getState() {
		return State;
		
	}
	
	//@FindBy(xpath="//input[@name='pinno']")
	@FindBy(css="input[name='pinno']")
	private WebElement Pin;
	
	public WebElement getPin() {
		return Pin;
		
	}
	
	//@FindBy(xpath="//input[@name='telephoneno']")
	@FindBy(css="input[name='telephoneno']")
	private WebElement Telephoneno;
	
	public WebElement getTelephoneno() {
		return Telephoneno;
		
	}
	
	
	//@FindBy(xpath="//input[@name='emailid']")
	@FindBy(css="input[name='emailid']")
	private WebElement EmailId;
	
	public WebElement getEmailId() {
		return EmailId;
		
	}
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	
	public WebElement getpassword() {
		return Password;
		
	}
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement Submitbtn;
	
	public WebElement getSubmitbtn() {
		return Submitbtn;
		
	}
	
	
	@FindBy(xpath="//td[text()='Customer ID']/following-sibling::td")
	private WebElement Newcustid;
	
	public WebElement getNewcustid() {
		return Newcustid;
		
	}
	
	
	

}
