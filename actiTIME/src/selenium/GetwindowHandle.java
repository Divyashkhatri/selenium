package selenium;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetwindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String wh = driver.getWindowHandle();//handle value of current window
		System.out.println(wh);
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.DAYS);
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();// count total number of browser window
		System.out.println(count);
		driver.quit();
	}

}
