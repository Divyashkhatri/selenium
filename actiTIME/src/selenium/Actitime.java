package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {
	public static void verifyTitle(WebDriver driver,String eTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
	try{
		wait.until(ExpectedConditions.titleIs("eTitle"));
		System.out.println("PASS: Title is matching");
	}
	catch(TimeoutException e){
			System.out.println("FAIL:Title is not matching");
		}
	System.out.println("Expected title:"+eTitle);
	String aTitle=driver.getTitle();
	System.out.println("Expected title:"+aTitle);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.DAYS);
		driver.get("https://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		verifyTitle(driver,"actiTIME - Enter Time-Track");
		driver.findElement(By.id("logoutLink"));
		verifyTitle(driver,"actiTIME - Login");
	}

}
