package Harshasirprograms;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SaucelabsIntegration {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("firefox");

		WebDriver driver = new RemoteWebDriver(new URL("https://divyash:f2b6296f-a890-41f1-b57f-00af2ca42e87@ondemand.saucelabs.com:443/wd/hub"), cap);
		driver.get("https://www.gmail.com");
		System.out.println("finished");

	}

}
