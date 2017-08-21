package Harshasirprograms;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuetionsDemo1 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException 
	{
		//		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		//		WebDriver driver=new FirefoxDriver();
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//		driver.manage().window().maximize();
		//		String parenthandle=driver.getWindowHandle();
		//		driver.get("http://localhost/login.do");

		System.out.print(" write a program to count number of browsers opened by selenium--> ");
		/*Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		 */

		System.out.println(" write a program to print window handles of all the browsersss ");
		/*System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.naukri.com");
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		for(String handle:handles)
		{
			System.out.println(handle+"--->");
		}*/

		System.out.println(" <--write a program to print window handles of all the browsersss using iterator");
		/*	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.naukri.com");
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		 */
		System.out.println("<------write a program to print title of all window ------> ");
		/*		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.naukri.com");
		Set<String> handles = driver.getWindowHandles();

		for(String handle:handles)
		{
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
		}

		 */		System.out.println("<---Write a program to close all the browser using close and quit method--->");
		 //driver.quit(); 

/*		 System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("http://www.naukri.com");
		 Set<String> handles = driver.getWindowHandles();

		 for(String handle:handles)
		 {
			 driver.switchTo().window(handle);
			 Thread.sleep(1000);
			 driver.close();
		 }
*/
		 System.out.println("<---Write a program to close parent browser-->");
/*		 System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 String parent=driver.getWindowHandle();
		 driver.get("http://www.naukri.com");
		 Set<String> handles = driver.getWindowHandles();


		for(String handle:handles)
		{
			driver.switchTo().window(handle);
			if(handle.equals(parent))
				driver.close();
		}
*/
		 System.out.println("<---Write a program to close child browsersss-->");
/*		 System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 String parent=driver.getWindowHandle();
		 driver.get("http://www.naukri.com");
		 Set<String> handles = driver.getWindowHandles();


		for(String handle:handles)
		{
			driver.switchTo().window(handle);
			if(!handle.equals(parent))
				driver.close();
		}
*/
		 System.out.println("<---Write a program to close specific window-->");
		 /*	
		String child="Amazon";
		for(String handle:handles)
		{
			driver.switchTo().window(handle);
			if(driver.getTitle().equals(child))
				driver.close();
		}	
		  */
		 System.out.println("<---Write a program to close child browser then parent--->");
		/* System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 String parenthandle=driver.getWindowHandle();
		 driver.get("http://www.naukri.com");
		 Set<String> handles = driver.getWindowHandles();		
		 for(String handle:handles)
		{
			if(!handle.equals(parenthandle))
			{
				driver.switchTo().window(handle);
				driver.close();
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(parenthandle);
		driver.close();

*/
		 System.out.println("Write a program to close all browser without using quit and close");
		 /*	WebElement we=	driver.findElement(By.xpath("//a"));
		Actions actions =new Actions(driver);
		actions.sendKeys(Keys.ALT).sendKeys(Keys.F4).perform();
		actions.click().perform();
		actions.sendKeys(Keys.ALT,Keys.F4).perform();

		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_F4);
		  */
		 System.out.println("Write a program to close the browser in reverse order-->");
		 System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Set<String> handles = driver.getWindowHandles();		
		 String[] obj=(String[]) handles.toArray();
		for(int i=obj.length-1;i>=0;i--)
		{
			Thread.sleep(1000);
			driver.switchTo().window(obj[i]);
			driver.close();
		}
		System.out.println("Movie Finished");
	}
}