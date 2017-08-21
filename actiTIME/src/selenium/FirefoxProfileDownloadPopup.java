package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxProfileDownloadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		/*
		 * setpreference() takes two arguments property and mime types
		 * mime type are available at --> setpoint
		 * property we can get from firfox:config
		 * 
		 * */
//		FirefoxProfile profile=new FirefoxProfile();
		/*download location is desktop(0), downloads(1), other(2) 
		profile.setPreference("browser.download.folderList",0);*/
		
		//changing location to others(3) that is "d:" drive it will not throw exception
//		profile.setPreference("browser.download.folderList",2);
//		profile.setPreference("browser.download.dir","D:");
//		MIME types
		//if file is zip or jar don't display popup save it directly 
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		
//		FirefoxDriver driver= new FirefoxDriver(profile);
//		driver.get("http://www.seleniumhq.org/download/");
//		String xp="//td[text()='Java']/../td[4]/a";
//		driver.findElement(By.xpath(xp)).click();		

		FirefoxProfile profile=new FirefoxProfile();
//		profile.setPreference("geo.enabled",false);
//		profile.setPreference("browser.frames.enabled",false);
//		profile.setPreference("browser.popups.showPopupBlocker",true);
		profile.setPreference("dom.webnotifications.enabled",true);
		WebDriver driver= new FirefoxDriver(profile);
//		driver.get("https://www.naukri.com/");
//		driver.get("http://adunits.popmunch.com/test/max_count/test.html");//Enter the url (for frame setting)
		driver.get("https://www.cleartrip.com");
		
		//http://kb.mozillazine.org/Firefox_:_FAQs_:_About:config_Entries
	}
}
