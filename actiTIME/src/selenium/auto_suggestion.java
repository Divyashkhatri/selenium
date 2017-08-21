package selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_suggestion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		String xp="//div[@class='sbqs_c']";
		List<WebElement> allast=driver.findElements(By.xpath(xp));
		int count=allast.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{ 
			WebElement ele =allast.get(i);
			String text= ele.getText();
			System.out.println(text);
			allast.get(2).click();

		}
		driver.quit();
	}

}
