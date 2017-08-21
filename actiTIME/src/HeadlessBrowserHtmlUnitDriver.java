import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessBrowserHtmlUnitDriver 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver = new HtmlUnitDriver(true);
		driver.get("https://www.google.co.in/");
		String str = driver.getTitle();
		System.out.println(str);			


//		driver = new PhantomJSDriver();
//		driver.get("https://www.google.co.in/");
//		System.out.println(driver.getTitle());
	}
}
