package Harshasirprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class StaleElementReferenceDemo
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("http://www.localhost/login.do");
	}
}