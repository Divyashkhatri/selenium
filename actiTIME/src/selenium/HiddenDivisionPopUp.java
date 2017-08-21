package selenium;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.win32.OaIdl.DATE;

public class HiddenDivisionPopUp {

	public static void main(String[] args) {
/*
		 String xp = "//div[@class='spritimg dob-sprit-img']";
		String xp1 = "(//li//a[@class='dtcolor' and text()='2'])[1]";
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://retail.starhealth.in/renewal");
		driver.findElement(By.xpath(xp)).click();
		driver.findElement(By.xpath(xp1)).click();
*/
//		 String xp ="//input[@id='DepartDate']";
//		 //String xp1 = " (//a[.='22'])[2]";
		 System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.cleartrip.com/");
			//driver.findElement(By.xpath(xp)).sendKeys("Fri, 26 May, 2017");
			//driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER);
//			driver.findElement(By.xpath(xp1)).click();
//			driver.findElement(By.id(xp)).sendKeys(Keys.ENTER);
/*			
 	// write a script to select todays date in calander
			SimpleDateFormat f=new SimpleDateFormat("EEE, d MMM, YYYY");
			Date d=new Date();
			String dd = f.format(d);
			System.out.println(dd);
			driver.findElement(By.xpath(xp)).sendKeys(dd);
	*/
	}

}
