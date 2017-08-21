package Harshasirprograms;
import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
public class QuetionsDemo4 
{
	@FindBy(id="countrySelect")
	WebElement ele;
	QuetionsDemo4(WebDriver driver)
	{
	}
	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//write ascript to print color of text
		driver.get("https://www.gmail.com");
		try
		{
			driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
			System.out.println(driver.findElement(By.xpath("(//div[.='Enter an email or phone number'])[2]")).getCssValue("color"));
			System.out.println(driver.findElement(By.xpath("(//div[.='Enter an email or phone number'])[2]")).getAttribute("color"));
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//*[@id='next']")).click();
			System.out.println(driver.findElement(By.xpath("//*[.='Enter an email or phone number. ']")).getCssValue("color"));
			System.out.println(driver.findElement(By.xpath("//*[.='Enter an email or phone number. ']")).getAttribute("color"));
		}
		
		System.out.println("-->31  write a script to move the mouse on the main menu then move on the one of the submenu and then select its submenu");
		/*		try{
		MouseHoverExample.main();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 */
		System.out.println("-->32  write a script to move the mouse on menu without using actions class");
/*		driver.navigate().to("http://www.istqb.in/");
		WebElement foundation_link=driver.findElement(By.xpath("//span[.='FOUNDATION']"));
		WebElement enrollment_link = driver.findElement(By.xpath("//span[.='ENROLLMENT']"));
		WebElement corporate_enrollment=driver.findElement(By.xpath("//span[.='CORPORATE ENROLLMENT']"));
		WebElement online_enrollment = driver.findElement(By.xpath("//a[.='ONLINE ENROLLMENT']"));
				System.out.println(foundation_link.getLocation().getX()+" "+foundation_link.getLocation().getX());
				Robot r = new Robot();
				r.mouseMove(foundation_link.getLocation().getX()+50,foundation_link.getLocation().getY()+100);	
				Thread.sleep(1000l);
				r.mouseMove(enrollment_link.getLocation().getX()+50,enrollment_link.getLocation().getY()+100);
				Thread.sleep(1000l);
				r.mouseMove(corporate_enrollment.getLocation().getX()+50, corporate_enrollment.getLocation().getY()+100);
				Thread.sleep(1000l);
				if(online_enrollment.isDisplayed())
					online_enrollment.sendKeys(Keys.ENTER);
*/				
		System.out.println("-->33  write a script to drag and drop the element");
		/*driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		String xp="//h1[.='Block 1']";
		WebElement b1=driver.findElement(By.xpath(xp));
		String xp1="//h1[.='Block 3']";
		WebElement b3=driver.findElement(By.xpath(xp1));
		Actions actions=new Actions(driver);
		Thread.sleep(2000);
		actions.dragAndDropBy(b1,700,100).perform();
		Thread.sleep(2000);
		actions.dragAndDrop(b1,b3).perform();
		*/
		
		System.out.println("-->34  write a script to right click on a link and select 'open in new window' option");
		/*	driver.navigate().to("http://localhost/login.do");
		WebElement actiTIME_Inc_link = driver.findElement(By.partialLinkText("actiTIME Inc."));
		Actions action=new Actions(driver);
		action.contextClick(actiTIME_Inc_link).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		 */
		System.out.println("-->35  write a script to double click on the element");
		/*driver.navigate().to("file:///C:/");
		Thread.sleep(1000l);
		WebElement we = driver.findElement(By.xpath("(//a)[7]"));
		Actions action=new Actions(driver);
		action.doubleClick(we).perform();
		Thread.sleep(1000l);
		WebElement we1 = driver.findElement(By.linkText("[parent directory]"));
		action.doubleClick(we1).perform();
		 */
		System.out.println("-->36  write a script to scroll the page using without using javascript (use robot class,scroll,keys,mouse move )");
		/*driver.navigate().to("https://www.youtube.com");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		for(int i=0;i<200;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(100l);	
		}*/
		System.out.println("-->37  write a script to select all the options present in the country list box of fatcow.com one by one");
		/*		driver.navigate().to("http://www.fatcow.com");		
		Demo4 d4=new Demo4(driver);
		PageFactory.initElements(driver, d4);
		Select select=new Select(d4.ele);
		List<WebElement> options = select.getOptions();

		for(int i=0;i<options.size();i++)
		{
			select=new Select(d4.ele);
			options = select.getOptions();
			select.selectByIndex(i);
		}
		 */
		System.out.println("-->38  write a method to verify whether the given listbox is dropdown or multi select box");
		//		driver.navigate().to("file:///D:/BCSM13/actiTime/HTMLpages/dropdownlist.html");


		System.out.println("-->39  write a script to verify that login page is loaded within 3 seconds");
		/*driver.navigate().to("http://localhost/login.do");
		String date = new SimpleDateFormat("ss").format(new Date());	
		String logintitle="actiTIME - Login";
		boolean flag=true;
		while(flag)
		{
			if(logintitle.equals(driver.getTitle()))
			{
				String date1 = new SimpleDateFormat("ss").format(new Date());
				int i=Integer.parseInt(date1)-Integer.parseInt(date);
				if(i>3)
				{	
					flag=false;
					System.out.println("page is not opened within 3 seconds");
				}
				else if(i<4)
				{
					System.out.println("page is opened within 3 seconds");
					flag=false;
				}
			}
			else if(driver.getTitle().equals("localhost"))
			{
				System.out.println("notloaded");
				flag=false;
			}
		}*/
		System.out.println("-->40  write a script to login and logout from the application and the script has to be synchronized without using implicitly wait or thread.sleep");
		/*WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id='loginButton']"));
		username.sendKeys("admin");
		password.sendKeys("manager");
		loginbutton.click();
		String entertimetracktitle="actiTIME - Enter Time-Track";
		while(true)
		{
			if(driver.getTitle().equals(entertimetracktitle))
			{
				break;
			}
		}
		WebElement logoutbutton = driver.findElement(By.id("logoutLink"));
		logoutbutton.click();
		while(true)
		{
			if(driver.getTitle().equals(logintitle))
			{
				break;
			}
		}*/
		System.out.println("-->41  write a script to login and logout from the application and the script has to be synchronized without using Explicit wait also");
		/*WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id='loginButton']"));
		username.sendKeys("admin");
		password.sendKeys("manager");
		loginbutton.click();
		String entertimetracktitle="actiTIME - Enter Time-Track";
		while(true)
		{
			if(driver.getTitle().equals(entertimetracktitle))
			{
				break;
			}
		}
		WebElement logoutbutton = driver.findElement(By.id("logoutLink"));
		logoutbutton.click();
		while(true)
		{
			if(driver.getTitle().equals(logintitle))
			{
				break;
			}
		}*/
		System.out.println("-->42  write a script to verify whether alert popup is displayed or not http://actimind.com/contact.php");
		/*	driver.navigate().to("http://www.actimind.com/contact.php");
		driver.findElement(By.xpath("(//input)[last()]")).click();
		try
		{
			driver.switchTo().alert();
			System.out.println("Alert found");
			driver.switchTo().alert().accept();
		}
		catch(NoAlertPresentException e)
		{
			System.out.println("Alert is not present");
		}*/
		System.out.println("-->43  write a script to  display a message on confirmation popup and click on cancel button");
		/*((JavascriptExecutor)driver).executeScript("confirm('please close the browser');");	
		Thread.sleep(1000l);
		driver.switchTo().alert().dismiss();*/
	}
}