package Harshasirprograms;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FireBugDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");

		File firebug = new File("./addons/firebug-2.0.19.xpi");
		File idm =new File("./addons/idmmzcc.xpi");
		FirefoxProfile profile=new FirefoxProfile();
	       profile.setEnableNativeEvents(true);
		profile.addExtension(firebug);
		profile.addExtension(idm);
 
		//	    profile.setPreference("extensions.firebug.currentVersion", "2.0.19");
		//		File fireBug=new File("");s
//				profile.setPreference("extension.","");
		
		//		String ext = "extensions.firebug.";
		//		String ext1 = "extensions.firepath.";

		//		profile.setPreference("extensions.firebug.currentVersion", "2.0.19");
//				profile.setPreference("extensions.firebug.allPagesActivation", "on");
		//		profile.setPreference(ext + "defaultPanelName", "net");
//		profile.setPreference("extensions.firebug.enableSites", true);
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("about:addons");
	}

}
