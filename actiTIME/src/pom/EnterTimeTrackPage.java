package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import generic.BasePage;
public class EnterTimeTrackPage extends BasePage{
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[last()]")
	private WebElement Help;
	@FindBy(linkText="About actiTIME")
	private WebElement aboutActiTime;
	@FindBy(xpath="//img[@title='Close']")
	private WebElement closeBtn;
	@FindBy(xpath="//span[contains(.,'actiTIME')]")
	private WebElement productVersion;
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
	}
	public void clickLogout(){
		logoutLink.click();
	}
	public void clickHelp(){
		Help.click();
	}
	public void clickAboutActiTime(){
		aboutActiTime.click();
	}
	public void clickCloseButton(){
		closeBtn.click();
	}
	public void verifyProductVersion(String eVersion){
		String aVersion=productVersion.getText();
		Assert.assertEquals(aVersion,eVersion);
		
	}
}
