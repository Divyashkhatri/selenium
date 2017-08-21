package selenium;

import java.awt.AWTException; 
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.actimind.com/");
		String xp="//span[text()='Home Page']";
		WebElement element=driver.findElement(By.xpath(xp));
		Actions actions=new Actions(driver);
		actions.contextClick(element).perform();
		//actions.sendKeys("t").perform();
	//	actions.sendKeys(Keys.SHIFT).click().perform(); //composite actions
		Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		//r.keyRelease(KeyEvent.VK_SHIFT);
	}

}
