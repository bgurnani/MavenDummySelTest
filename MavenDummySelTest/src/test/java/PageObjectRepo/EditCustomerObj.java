package PageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomerObj {
	
	@FindBy(xpath="//input[@name='cusid']")
	private WebElement customId;
	
	public WebElement getcustomId() {
		return customId;
		
	}
	

}
