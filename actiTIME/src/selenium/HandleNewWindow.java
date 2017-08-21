package selenium;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleNewWindow {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
driver.get("http://localhost/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allwhs = driver.getWindowHandles();
		for(String wh:allwhs)
		{
			driver.switchTo().window(wh);
		}
		
		WebElement link=driver.findElement(By.linkText("Try Free"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(link));
		link.click();	
	}
}
