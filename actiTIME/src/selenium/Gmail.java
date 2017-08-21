package selenium;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.AutoConst;

public class Gmail 
{
	public static void main(String[] args) throws MalformedURLException 
	{
				System.setProperty(AutoConst.CHROME_KEY,AutoConst.CHROME_VALUE);
				WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
				driver.findElement(By.id("Email")).sendKeys("divyashk5"+Keys.ENTER);
		driver.findElement(By.id("Passwd")).sendKeys(AutoConst.GMAIL_PASSWORD+Keys.ENTER);
		String xp="(//span[@class='yP'])[position()mod 2=0]";
		List<WebElement> alllink = driver.findElements(By.xpath(xp));
		for(int i=0;i<alllink.size();i++)
		{

			System.out.println(alllink.get(i).getText());
		}
		driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
		driver.findElement(By.xpath("//a[contains(.,'Sign out')]")).click();
		driver.quit();
	}

}
