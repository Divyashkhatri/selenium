package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class DemoC {
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
		SoftAssert s=new SoftAssert();
		s.assertEquals(title,"Google");
		//s.assertAll(); if we put this statment 
		//then if above ant test fail it will not execute below written code of this method only
		String url = driver.getCurrentUrl();
		if(url.contains("google.co.in"))
		{
			Reporter.log("url contains google.co.in",true);
		}
		else
		{
			Reporter.log("url not contains google.co.in",true);
			s.fail();
		}
		s.assertAll();
	}
}