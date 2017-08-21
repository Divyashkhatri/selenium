package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	// Initialization
	private WebElement unTB,pwdTB,loginBT;
	
	public LoginPage(WebDriver driver){
		//declartion
		unTB=driver.findElement(By.id("username"));
		pwdTB=driver.findElement(By.name("pwd"));
		loginBT=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	// Utilization
	public void clickLogin(String un,String pw)
	{
		unTB.sendKeys(un);
		pwdTB.sendKeys(pw);
		loginBT.click();
	}

}
