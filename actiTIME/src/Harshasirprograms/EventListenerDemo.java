package Harshasirprograms;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;

class MyListener  extends AbstractWebDriverEventListener
{
	public void afterClickOn(WebElement element, WebDriver driver)
	{
		System.out.println( " is clicked");	
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, java.lang.CharSequence[] keysToSend)
	{
		System.out.println( "value entered");
	}
}
public class EventListenerDemo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		WebDriver wdriver = new FirefoxDriver();
		//		wdriver.manage().timeouts().implicitlyWait(10l,TimeUnit.SECONDS);

		EventFiringWebDriver driver = new EventFiringWebDriver(wdriver);
		MyListener ml=new MyListener();
		driver.register(ml);

		driver.get("http://localhost/login.do");
		WebElement weuname=driver.findElement(By.xpath("//input[@name='username']"));
		weuname.sendKeys("admin");

		WebElement wepwd=driver.findElement(By.name("pwd"));
		wepwd.sendKeys("manager"+Keys.ENTER);
	}
}