package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {
	public static void main(String... args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.istqb.in/");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//span[.='FOUNDATION']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000l);
		
		element=driver.findElement(By.xpath("//span[.='ENROLLMENT']"));
		action.moveToElement(element).perform();
		Thread.sleep(1000l);
		
		element=driver.findElement(By.xpath("//span[.='CORPORATE ENROLLMENT']"));
		action.moveToElement(element).perform();
		Thread.sleep(1000l);
		driver.findElement(By.xpath("//span[.='ONLINE ENROLLMENT']")).click();
		
		
		System.out.println("finished");
		
	}

}
