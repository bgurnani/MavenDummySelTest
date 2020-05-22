package PageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeObj {
	
	
	
	//@FindBy(xpath="//a[text()='New Customer']")

	@FindBy(css="a[href='addcustomerpage.php']")
	private WebElement newCustomer;
	
	public WebElement getNewCustomer() {
		return newCustomer;
	}
	
	//@FindBy(xpath="//a[@href='EditCustomer.php']")
	@FindBy(css="a[href='EditCustomer.php']")
	
	//a:contains('Log Out')
	
	private WebElement editCustomer;
	
	public WebElement getEditCustomer() {
		return editCustomer;
	}

	
	//@FindBy(xpath="//a[@href='DeleteCustomerInput.php']")
	@FindBy(css="a[href='DeleteCustomerInput.php']")
	private WebElement deleteCustomer;
	
	public WebElement getDeleteCustomer() {
		return deleteCustomer;
	}
	
	
	//@FindBy(xpath="//a[@href='addAccount.php']")
	@FindBy(css="a[href='addAccount.php']")
	private WebElement addAccount;
	
	public WebElement getAddAccount() {
		return addAccount;
		
	}
	
	
	//@FindBy(xpath="//a[@href='editAccount.php']")
	@FindBy(css="a[href='editAccount.php']")
	private WebElement editAccount;
	
	public WebElement geteditAccount() {
		return editAccount;
		
	}
	
	//@FindBy(xpath="//a[@href='deleteAccountInput.php']")
	@FindBy(css="a[href='deleteAccountInput.php']")
	private WebElement deleteAccount;
	
	public WebElement getdeleteAccount() {
		return deleteAccount;
		
	}
	
	@FindBy(xpath="//a[@href='DepositInput.php']")
	//@FindBy(css="a[href='DepositInput.php']")
	private WebElement depositAccount;
	
	public WebElement getdepositAccount() {
		return depositAccount;
		
	}
	
	@FindBy(xpath="//a[@href='WithdrawalInput.php']")
	private WebElement withdrawalAccount;
	
	public WebElement getwithdrawalAccount() {
		return withdrawalAccount;
		
	}
	
	@FindBy(xpath="//a[@href='FundTransInput.php']")
	private WebElement fundTransfer;
	
	public WebElement getfundTransfer() {
		return fundTransfer;
		
	}
	
	
	@FindBy(xpath="//a[@href='PasswordInput.php']")
	private WebElement changePassword;
	
	public WebElement getchangePassword() {
		return changePassword;
		
	}
	
	@FindBy(xpath="//a[@href='BalEnqInput.php']")
	private WebElement balanceEnquiry;
	
	public WebElement getBalEnqInput() {
		return balanceEnquiry;
		
	}
	
	@FindBy(xpath="//a[@href='MiniStatementInput.php']")
	private WebElement miniStatement;
	
	public WebElement getminiStatement() {
		return miniStatement;
		
	}
	
	@FindBy(xpath="//a[@href='CustomisedStatementInput.php']")
	private WebElement customStatement;
	
	public WebElement getcustomStatement() {
		return customStatement;
		
	}
	
	
	
	
	//@FindBy(xpath="//a[@href=\"Logout.php\" and contains(text(),'Log out')]")
	//@FindBy(css="//a[href=\"Logout.php\"]")
	@FindBy(css="a[href='Logout.php']")

	private WebElement logOut;
	
	public WebElement getlogOut() {
		return logOut;
		
	}
	
	
	
	
	
	
}
