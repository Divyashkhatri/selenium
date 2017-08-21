package selenium;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoD {
	static{	System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");}
public static void main(String[] args) throws IOException, InterruptedException {
	//program to handle allow or block location track popup
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.cleartrip.com");
	Runtime r=Runtime.getRuntime();
	Thread.sleep(5000);
	r.exec("D:\\location.exe");
	
	}
}
