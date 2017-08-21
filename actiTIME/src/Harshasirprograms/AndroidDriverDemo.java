
package Harshasirprograms;

import java.net.MalformedURLException;

import org.openqa.selenium.*;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidDriverDemo 
{
	public static void main(String[] args) throws Exception 
	{

		// working
		WebDriver driver = new AndroidDriver("http://192.168.43.176:8080/wd/hub");
		Thread.sleep(1000l);
		driver.get("http://www.facebook.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(((JavascriptExecutor)driver).executeScript("return navigator.userAgent"));
		/*output of javascript is kept in mozilla --> about:config
		*general.useragent.override  
		*/
		driver.findElement(By.name("email")).sendKeys("divyashk5@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("divya");
		Thread.sleep(2000);
		driver.findElement(By.linkText("SHOW")).click();
		driver.findElement(By.name("login")).click();

		driver.navigate().to("http://www.google.com");
//		WebElement ele;
//		System.out.println((ele=driver.findElement(By.partialLinkText("Sign up for an account."))).isDisplayed());
//		ele.click();
//		System.out.println("Finished");
	}
}
