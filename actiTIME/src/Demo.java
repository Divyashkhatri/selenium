import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


class AAA
{
	void disp()
	{
		System.out.println("disp");
	}
}

public class Demo extends AAA{
	void disp()
	{
		System.out.println("child disp");
	}
	
	void print()
	{
		super.disp();
	}
	
	public static void main(String[] args) 
	{
		new AAA().disp();
		System.out.println("finished");
	}
	
//	public static void main(String[] args) 
//	{
//		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
//		driver.get("http://localhost/login.do");		
////		Dimension d=new Dimension(600,600);
////		driver.manage().window().setSize(d);
//		System.out.println(driver.manage().getCookies());
//		try
//		{
////			driver.manage().window().maximize();
////			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		}
//		catch(Exception e)
//		{
//			
//		}
//	}

}
