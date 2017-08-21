//	System.out.println(By.tagName("").getClass().getName());
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditorProblem 
{
	public static void main(String[] args) throws AWTException, Exception 
	{		
		System.out.println("Start");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://editgenie.novatechset.com/correcttool/TandF?file_id=TandF267136833&journalId=CWSE&articleId=CWSE1307956_100_140&company_name=TandF");
		try
		{
			driver.switchTo().alert().dismiss();
		}
		catch(Exception e)
		{
			System.out.println("No alert present");
		}
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_ALT);
//		r.keyPress(KeyEvent.VK_SPACE);
//		r.keyPress(KeyEvent.VK_X);
//		
//		r.keyRelease(KeyEvent.VK_SPACE);
//		r.keyRelease(KeyEvent.VK_X);
//		r.keyRelease(KeyEvent.VK_ALT);
		
		WebElement para = driver.findElement(By.xpath("(//para[contains(.,'A discrete-time survival model is built by including ')]/italic)[1]"));
		para.click();
		
//				WebElement we = driver.findElement(By.xpath("//para"));
//				Point p = we.getLocation();
//				r.mouseMove(p.getX()+10, p.getY()+500);
				
				
				
			
		
		
		
		

	}

}
