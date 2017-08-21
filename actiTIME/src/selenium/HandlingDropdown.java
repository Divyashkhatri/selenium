package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.get("http://www.istqb.in");
		WebElement menu = driver.findElement(By.xpath("//span[.='FOUNDATION']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		
		WebElement subMenu = driver.findElement(By.xpath("(//span[.='ENROLLMENT'])[1]"));
		Thread.sleep(1000);
		actions.moveToElement(subMenu).perform();
		WebElement sm1 = driver.findElement(By.xpath("//span[.='CORPORATE ENROLLMENT']"));
		Thread.sleep(1000);
		actions.moveToElement(sm1).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='ONLINE ENROLLMENT']")));
		Thread.sleep(1000);
		WebElement sm2 = driver.findElement(By.xpath("//span[.='ONLINE ENROLLMENT']"));
		sm2.click();
	}

}
