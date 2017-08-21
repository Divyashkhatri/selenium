package Harshasirprograms;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PhantomJsDemo 
{
	public static void main(String[] args) throws Exception 
	{

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, ".\\Driver\\phantomjs.exe");

		WebDriver driver = new PhantomJSDriver(caps);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);	

		driver.get("http://localhost/login.do");
		System.out.println("-----Navigating to the url--------");
		System.out.println(driver.getTitle());

		WebElement weuname=driver.findElement(By.xpath("//input[@name='username']"));
		weuname.sendKeys("admin");

		WebElement wepwd=driver.findElement(By.name("pwd"));
		wepwd.sendKeys("manager"+Keys.ENTER);

		Thread.sleep(3000l);
		System.out.println("-----Logged in--------");
		System.out.println(driver.getTitle());

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(".\\snapshot\\sample.jpeg"),true);  

		/*driver.close(); //current window
		driver.switchTo().window(second_window);*/

		driver.quit();

		System.out.println("Browser closed");
	}

}
