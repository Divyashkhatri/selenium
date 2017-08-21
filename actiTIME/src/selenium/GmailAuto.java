package selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GmailAuto {
	@FindBy(xpath="(//span[@class='zF'])[position() mod 2=0]")
	List<WebElement> mailList;// this is 
	 GmailAuto(WebDriver driver){
		 PageFactory.initElements(driver,this);
	 }
	 public void print(WebDriver driver){
		 for(WebElement ele:mailList)
		 {
			 ele.click();
			 driver.navigate().back();
			 
		 }
	 }
	public static void main(String[] args) throws InterruptedException {
		
		
		String C_KEY = "webdriver.chrome.driver";
		String C_VALUE = "./driver/chromedriver.exe";
		System.setProperty(C_KEY, C_VALUE);

			WebDriver driver = new ChromeDriver();
			GmailAuto mail=new GmailAuto(driver);
		
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	 	 driver.get("http://www.gmail.com");
		 WebDriverWait wait = new WebDriverWait(driver, 10);// Handling the not visibility ofpasswd
		 driver.findElement(By.id("Email")).sendKeys("Chutia_mail_ID" + Keys.ENTER);// email	field
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));	
		 driver.findElement(By.id("Passwd")).sendKeys("Loda_Password" + Keys.ENTER);// password field

		 mail.print(driver);
	
		driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();// for logout
		driver.findElement(By.linkText("Sign out")).click(); // clicking on logout
		driver.quit();
	}
}