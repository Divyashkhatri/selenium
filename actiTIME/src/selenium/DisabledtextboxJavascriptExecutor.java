package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledtextboxJavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("file:///D:/jsdemo.html");//Enter the url
//		RemoteWebDriver r=(RemoteWebDriver) driver;
//		Thread.sleep(2000);
//		r.executeScript("document.getElementById('t2').value='qsp'");
//		Thread.sleep(2000);
//		r.executeScript("document.getElementById('t2').value=''");
		//typecasting
//		JavascriptExecutor j=(JavascriptExecutor) driver;
//		j.executeScript("document.getElementById('b1').click()");
		//gmail javascript for clicking is working		
		//j.executeScript("document.getElementById('next').click()");
		driver.get("https://news.google.co.in");//Enter the url
		JavascriptExecutor j=(JavascriptExecutor) driver;
		for(int i=0;i<10;i++)
			j.executeScript("window.scrollBy(0,200)");
		
		Thread.sleep(2000);	for(int i=0;i<10;i++)
		j.executeScript("window.scrollBy(0,-200)");
		
		
		
	}

}
