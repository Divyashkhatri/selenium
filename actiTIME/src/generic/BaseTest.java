package generic;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements AutoConst {
	public WebDriver driver;

	@Parameters({"node","browser"})
	@BeforeMethod
	public void openApplication(String node, String browser) throws MalformedURLException
	{
  		URL rsURL=new URL(node);
		DesiredCapabilities d=new DesiredCapabilities();
		d.setBrowserName(browser);
		driver=new RemoteWebDriver(rsURL,d);
//		System.setProperty(CHROME_KEY,CHROME_VALUE);
//		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	// after method updated
	@AfterMethod
	public void closeApplication(ITestResult r)
	{	if(r.getStatus()==2)
	{
		Photo.getScreenShot(driver);
	}
		driver.quit();
	}
}
