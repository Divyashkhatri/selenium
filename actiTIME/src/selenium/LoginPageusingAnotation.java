package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageusingAnotation {
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBT;
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwTB;
	public LoginPageusingAnotation(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	void clickLogin(String un,String pw){
		unTB.sendKeys(un);
		pwTB.sendKeys(pw);
		loginBT.click();
	}
}