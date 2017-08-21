package selenium;

import java.util.HashMap;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeProfile 
{
	public static void main(String[] args) 
	{
		String downloadFilePath="C:\\Users\\rex\\Downloads\\";
		
		HashMap <String, Object> chromeprefs=new HashMap<String, Object>();
		chromeprefs.put("profile.default_content_setting.popups", 0);
		chromeprefs.put("download.default_directory", downloadFilePath);
		
		chromeprefs.put("profile.default_content_settings.popups", 0);
		chromeprefs.put("profile.default_content_setting_values.notifications", 2);
		chromeprefs.put("credentials_enable_service", false);
		chromeprefs.put("password_manager_enabled", false);
		
		//		FirefoxOptions option=new FirefoxOptions();
		/*firefoxoption() or chromeoptions() classses work for specific browser
		 *but DesiredCapabilities() work for all the browser
		 */

		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs",chromeprefs);
		option.addArguments("disable-infobars");
		option.addArguments("--disable-extensions");
		option.addArguments("--test-type");
		
		//		new ChromeDriver(option).get("https://www.axisbank.com");	
		
		DesiredCapabilities dcap=new DesiredCapabilities();
		dcap.setJavascriptEnabled(false);
		dcap.setAcceptInsecureCerts(false);
		dcap.setPlatform(Platform.WINDOWS);
		dcap.acceptInsecureCerts();
		dcap.setCapability("capbilitType.ACCEPT_ssl_CERTS", false);
		dcap.setCapability("ChromeOption.CAPABILITY", option);
		dcap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.out.println(dcap);
		WebDriver driver=new ChromeDriver(dcap);
		driver.navigate().to("https://www.axisbank.com");
		
		
				
		
		
	}
}
