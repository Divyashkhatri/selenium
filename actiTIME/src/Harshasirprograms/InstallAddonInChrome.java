package Harshasirprograms;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InstallAddonInChrome 
{
	public static void main(String[] args) 
	{
		String location="./addons/IDMGCExt.crx";
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addExtensions(new File(location));

		DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	    ChromeDriver driver = new ChromeDriver(capabilities);

	    driver.get("chrome://extensions"); 
	    driver.navigate().refresh();
	}
}