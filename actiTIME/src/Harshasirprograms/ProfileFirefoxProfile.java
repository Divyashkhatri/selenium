package Harshasirprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ProfileFirefoxProfile 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		// working  		
		//firefox.exe -profilemanager
		ProfilesIni profile=new ProfilesIni();
		//C:\Users\rex\AppData\Roaming\Mozilla\Firefox\profiles.ini   --> default-1501914219405  this profilename is taken from profiles.ini
		FirefoxProfile pro= profile.getProfile("default-1501914219405");
		//default-1501914219405

		WebDriver driver = new FirefoxDriver(pro);
		driver.get("http://www.facebook.com");
		System.out.println("Finished");
	}
}