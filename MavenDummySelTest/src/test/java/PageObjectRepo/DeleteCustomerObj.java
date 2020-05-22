package PageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteCustomerObj {
	
	@FindBy(xpath="//input[@name='cusid']")
	private WebElement customId;
	
	public WebElement getcustomId() {
		return customId;
		
	}
	

	
	
	//input[@type="submit"]
	
	@FindBy(xpath="//input[@type=\"submit\"]")
    private WebElement submitbtn;
	
	public WebElement getsubmitbtn() {
		return submitbtn;
		
	}

	
	@FindBy(xpath="//input[@type=\"reset\"]")
    private WebElement resetbtn;
	
	public WebElement resetbtn() {
		return resetbtn;
		
	} 
	
	

}
