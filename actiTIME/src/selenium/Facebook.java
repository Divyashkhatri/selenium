package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook 
{
	public static void main(String[] args) 
	{
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("dom.webnotifications.enabled",true);
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.DAYS);
		driver.get("http://facebook.com");driver.findElement(By.xpath("//input[@type='email']")).sendKeys("divyashk4@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("!divyashkhatri007"+Keys.ENTER);
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']")).click();
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.titleContains("Facebook"));
//		String title=driver.getTitle();
//		System.out.println(title);
//		//driver.findElement(By.xpath("//a[@id='pageLoginAnchor']")).click();
//		driver.findElement(By.id("pageLoginAnchor")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();

		WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
		
	
	}

}

