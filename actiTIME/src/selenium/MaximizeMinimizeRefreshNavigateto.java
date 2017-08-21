package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMinimizeRefreshNavigateto {

	public static void main(String []a) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/demo.html");
		
		driver.manage().window().maximize();
		driver.navigate().to("file:///D:/demoD.html");
		Thread.sleep(2000);
		// this meathod is not working with chrome
		// driver.manage().window().fullscreen();
		String str =driver.getCurrentUrl();// what is the link of current page
		System.out.println(str);
		System.out.println(driver.getTitle());// printing the title of webpage
		System.out.println(driver.getPageSource()); //printing the source code of webpage
	   driver.navigate().back();// click on back button 
	   Thread.sleep(2000);
	   driver.navigate().forward(); //forward meathod
	   Thread.sleep(2000);
	   driver.navigate().refresh();//refresh your browser
	   Thread.sleep(2000);
	   driver.quit();
	
	}
	
}
