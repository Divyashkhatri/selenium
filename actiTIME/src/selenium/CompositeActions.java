package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeActions {
	//Action class is used for 
	//composite actions 
	//context click
	//context menu
	//drag and drop...-
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.DAYS);
		driver.get("http://localhost/login.do");
		WebElement link= driver.findElement(By.linkText("actiTIME Inc."));
		Actions actions=new Actions(driver);
	String s1="javasdeveloper";
	s1.replace('e', 'E');
	s1.replace("java","");
	
	actions.sendKeys(Keys.CONTROL).click(link).perform();
	}

}
