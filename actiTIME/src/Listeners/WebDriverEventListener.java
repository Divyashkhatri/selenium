package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverEventListener extends AbstractWebDriverEventListener
{
	public void afterAlertAccept(WebDriver driver)
	{
		System.out.println("alert accepted");
	}
	public void afterChangeValueOf(WebElement element,WebDriver driver,CharSequence keysToSend)
	{
		System.out.println("value sent");
	}
	public void afterClickOn(WebElement element,WebDriver driver)
	{
		System.out.println("clicked");
	}
	public void afterFindBy(By by,WebElement element,WebDriver driver)
	{
		System.out.println("element searched");
	}
	public void afterNavigateTo(String url,WebDriver driver)
	{
		System.out.println("navigated");
	}
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		WebDriver webdriver = new FirefoxDriver();
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		WebDriverEventListener listener = new WebDriverEventListener();
		driver.register(listener);
		
		driver.get("http://www.facebook.com");
		driver.navigate().to("http://www.google.com");
		
		System.out.println("Finished");
	}
}