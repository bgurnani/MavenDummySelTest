package PageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountObj {

	@FindBy(xpath="//input[@name='cusid']")
	private WebElement customId;
	
	public WebElement getcustomId() {
		return customId;
		
	}
	
	@FindBy(xpath="//select[@name=\"selaccount\"]")
    private WebElement accountType;
	
	public WebElement getaccountType() {
		return accountType;
		
	}
	
	
	@FindBy(xpath="//input[@name=\"inideposit\"]")
    private WebElement initdeposit;
	
	public WebElement getinitdeposite() {
		return initdeposit;
		
	}
	
	
	//input[@type="submit"]
	
	@FindBy(xpath="//input[@type=\"submit\"]")
    private WebElement submitbtn;
	
	public WebElement getsubmitbtn() {
		return submitbtn;
		
	}
	
	@FindBy(xpath="//td[text()='Account ID']/following-sibling::td")
	private WebElement NewActid;
	
	public WebElement getNewActid() {
		return NewActid;
		
	}
	
	
}
