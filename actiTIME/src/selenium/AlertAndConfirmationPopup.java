package selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
public class AlertAndConfirmationPopup 
{	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://actimind.com/contact.php");
		driver.findElement(By.xpath("//input[@value='Submit Request']")).click();
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(2000);
			//alert.dismiss();
			alert.accept();
		}
		catch(NoAlertPresentException e)
		{
			System.out.println("Alert Not present");
		}
	}
}