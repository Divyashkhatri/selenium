package selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GmailAuto_1 {

	public static void main(String[] args) throws InterruptedException {
		String C_KEY = "webdriver.chrome.driver";
		String C_VALUE = "./driver/chromedriver.exe";
		System.setProperty(C_KEY, C_VALUE);

		WebDriver driver = new ChromeDriver();
		 WebDriverWait wait = new WebDriverWait(driver, 10);// Handling
			
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		driver.get("http://www.gmail.com");// Load the webpage

		driver.findElement(By.id("Email")).sendKeys("divyashk5" + Keys.ENTER);// email field

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));//wait for password field
		driver.findElement(By.id("Passwd")).sendKeys("PASSWORD_DAAl" + Keys.ENTER);// password field
		int i = 1; // This is count of mails
		
	//	List<WebElement> mailList = driver.findElements(By.xpath("//span[@class='zF' or @class='yP']"));
		
		List<WebElement> mailList = driver.findElements(By.xpath("//span[@class='bog']")); //get all the mail's address
		for (WebElement mail : mailList)  //get each mails address
			{		mail.click();					// open each mail
					Thread.sleep(1000);
					WebElement mailTitle = driver.findElement(By.className("hP"));		//get the title
					System.out.println(i++ + "  ---   Mail Subject is :   " + mailTitle.getText()); // print the title
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[@class='ar6 T-I-J3 J-J5-Ji']")).click();// Go back to inbox
			}
		driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();// for
																			// logout
		driver.findElement(By.linkText("Sign out")).click(); // clicking on
																// logout
		 driver.close();

	}

}
