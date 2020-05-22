package PageObjectRepo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObj {

	
	//@FindBy (name="uid")
	@FindBy(css="input[name='uid']")
	//@FindBy(css="input[name='emailid']")
	private WebElement username;
	
	
	//a:contains('Log Out')
	public WebElement getUsername() {
		return username;
	}
	
	@FindBy (name="password")
	private WebElement password;
	
	public WebElement getPassword() {	
		return password;
	}
	
	@FindBy (name="btnLogin")
	private WebElement loginBtn;
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	@FindBy (name="btnReset")
	private WebElement resetBtn;
	
	public WebElement getResetBtn() {
		return resetBtn;
	}
}
