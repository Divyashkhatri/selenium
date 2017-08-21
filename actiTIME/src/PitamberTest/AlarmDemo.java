package PitamberTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlarmDemo {
	
		WebDriver driver;	
		@BeforeMethod
		public void testlogin() throws InterruptedException
		{
			System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10l,TimeUnit.SECONDS);
			driver.navigate().to("http://dmscc.vtstest.com.au:8080/CCTPortal/#/login");
			WebElement wen=driver.findElement(By.xpath("//input[@name='userName']"));
			wen.sendKeys("Superuser");
			WebElement wenpwd=driver.findElement(By.xpath("//input[@name='userPwd']"));
			wenpwd.sendKeys("keane*12",Keys.ENTER);
			Thread.sleep(3000l);
			
		}
	
		@Test
		public void TestAlarmMessange()
		{
			driver.findElement(By.linkText(""));
	/*		.//*[@id='ng-app']/div[2]/div[2]/div[1]/div/div/div/span/span
			//span[contains(.,'generated successfully')]
	*/		
		}

	

}
