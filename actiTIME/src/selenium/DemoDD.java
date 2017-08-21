package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class DemoDD {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	@Test
	public void testC()
	{
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Google");
		String url = driver.getCurrentUrl();
		if(url.contains("google.co.in"))
		{
			Reporter.log("url contains google.co.in",true);
		}
		else
		{
			Reporter.log("url not contains google.co.in",true);
			Assert.fail();
		}
}}
