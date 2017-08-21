import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_SeeMore_Link
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("divyashk4@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password"+Keys.ENTER);
		Thread.sleep(1000l);
		driver.navigate().to("https://www.facebook.com/groups/Qspiders.Selenium/");
		Thread.sleep(2000l);
		driver.findElement(By.xpath(".//*[@id='id_595c3f20cf2237123872911']/span/span/a/span")).click();
//		List<WebElement> seemorelinks = driver.findElements(By.xpath("//a[@class='see_more_link']"));
//		for(WebElement seemorelink:seemorelinks)
//		{
//			seemorelink.click();
//		}
	}
}
