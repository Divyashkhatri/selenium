package PitamberTest;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIDEDemo
{
	//selenium IDE generated script
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://localhost/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testLogin() throws Exception 
	{
		driver.get(baseUrl + "/login.do");
		assertEquals(driver.getTitle(), "actiTIME - Login");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).clear();
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton > div")).click();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { 
				if ("actiTIME - Enter Time-Track".equals(driver.getTitle())) 
				break; 
				} catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		driver.findElement(By.id("logoutLink")).click();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try {
				if ("actiTIME - Login".equals(driver.getTitle()))
					break; 
				} catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertEquals(driver.getTitle(), "actiTIME - Login");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception 
	{
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try 
		{
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try 
		{
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) 
		{
			return false;
		}
	}

	private String closeAlertAndGetItsText() 
	{
		try 
		{
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) 
			{
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
