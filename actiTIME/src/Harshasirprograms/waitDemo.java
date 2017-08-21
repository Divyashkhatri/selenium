package Harshasirprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

class Halwa implements ExpectedCondition<WebElement>
{
	
	public WebElement apply(WebDriver driver)
	{		
		return driver.findElement(By.id("email"));
	}
}
public class waitDemo
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//1st Way
		WebElement we=new WebDriverWait(driver, 10).until(new Halwa());
		we.sendKeys("divyashk4@gmail.com");		

		//2nd way
		new WebDriverWait(driver,10).until(new ExpectedCondition<WebElement>() {
		@Override
		public WebElement apply(WebDriver driver)
		{
			return driver.findElement(By.id("username"));
		}});
		
		// google search using webdriverwait
		 new WebDriverWait(driver,10).until(new ExpectedCondition<Boolean>(){
			@Override
			public Boolean apply(WebDriver driver)
			{
				return driver.findElement(By.id("resultStats"))!=null;
			}});
		 //wait for element's attribute to be updated
		 new WebDriverWait(driver,10).until(new ExpectedCondition<Boolean>(){
			 	public Boolean apply(WebDriver driver)
			 	{
			 		return driver.findElement(By.name("Save")).getAttribute("value").contains("Saved");
			 	}});
		 
		 
		 //wait for element's visibility
		 new WebDriverWait(driver,10).until(new ExpectedCondition<Boolean>() 
		 {
		public Boolean apply(WebDriver driver){
			return driver.findElement(By.xpath("//input[@type=input]")).isDisplayed();
		}});
	}
	
	WebDriver driver;
	public boolean isElementPresent(By by)
	{
		try{
			driver.findElement(((by)));
			return true;
		}catch(NoSuchElementException e)
		{
			return false;
		}
	}
}