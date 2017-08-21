package selenium;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowserDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//open the browser
		WebDriver driver=new ChromeDriver();
		//delete cookies
		//	driver.manage().deleteAllCookies();
		
		//enter the url & wait till it loads
		driver.get("http://www.facebook.com");
		
		//maximize the browser -no minimize method
		driver.manage().window().maximize();
		
		//resize the browser
		Dimension d=new Dimension(200,300);
		driver.manage().window().setSize(d);
		
		//move the browser
		Point p=new Point(300,100);
		driver.manage().window().setPosition(p);
//		close the browser
		driver.quit();
	}

}
