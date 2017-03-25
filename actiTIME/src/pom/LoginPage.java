package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import generic.BasePage;

public class LoginPage extends BasePage{
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwTB;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginnBtn;
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errMsg;
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void setUsername(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickLogin(){
		loginnBtn.click();
	}
	public void verifyErrMsgIsPresent(){
		verifyElementIsPresent(errMsg);
	}
	
}
