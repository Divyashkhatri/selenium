package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameInsideFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("file:///D:/mainpage.html");//Enter the url
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("divyash");
		driver.switchTo().frame("f1");
		WebElement e=driver.findElement(By.name("n1"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("t1")).sendKeys("ABS");
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t3")).sendKeys("ABGHJ");
		*/

		driver.get("http://adunits.popmunch.com/test/max_count/test.html");//Enter the url
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='zohoiam']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.id("lid")).sendKeys("hello");
		driver.findElement(By.id("rem")).sendKeys("hello");
		driver.findElement(By.id("submit_but")).click();
		WebElement e = driver.findElement(By.id("rem"));
		e.click();	
	}
}