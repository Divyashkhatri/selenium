package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class MounseMovement
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		WebDriverEventListener listener = new WebDriverEventListener();
		driver.register(listener);

		driver.get("http://www.google.co.in");
		EventFiringMouse mouse = new EventFiringMouse(driver, listener);
		Locatable hoveritem = (Locatable)driver.findElement(By.linkText("Gmail"));
		Coordinates cord = hoveritem.getCoordinates();

		try
		{
//			mouse.contextClick(cord);
//			mouse.click(cord);
			mouse.mouseMove(cord);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}