package PageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositObj {
	
	@FindBy(xpath="//input[@name='accountno']")
	private WebElement AcctNo;
	
	public WebElement getAcctNo() {
		return AcctNo;
		
	}
	
	
	
	@FindBy(xpath="//input[@name='ammount']")
	private WebElement Amount;
	
	public WebElement getAmount() {
		return Amount;
		
	}
	
	
	@FindBy(xpath="//input[@type='text' and @name='desc']")
	private WebElement Description;
	
	public WebElement getDescription() {
		return Description;
		
	}
	
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement Submitbtn;
	
	public WebElement getSubmitbtn() {
		return Submitbtn;
		
	}
	
	//p[contains(text(),"Transaction details of Deposit for Account")]
	
	//td[text()='Transaction ID']/following-sibling::td
	
	//*[@id="deposit"]/tbody/tr[6]/td[1]
	
	@FindBy(xpath="//td[text()='Transaction ID']//following-sibling::td")
	private WebElement TransactionId;
	
	public WebElement getTransactionId() {
		return TransactionId;
		
	}
	
	@FindBy(xpath="//p[contains(text(),\"Transaction details of Deposit for Account\")]")
	private WebElement TransactionText;
	
	public WebElement getTransactionText() {
		return TransactionText;
		
	}
	
	
	

}
