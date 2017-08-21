/*
	System.out.println("13.<---Write a script to screenshot of login button--->");
 */		

package Harshasirprograms;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class QuetionsDemo2 
{
	public static void main(String[] args) throws AWTException, InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		//		driver.manage().timeouts().implicitlyWait(10l,TimeUnit.SECONDS);
		driver.navigate().to("http://localhost/login.do");

		System.out.println("1.<---Write different ways of entering text in the  textbox");
		driver.navigate().to("http://localhost/login.do");
		//		((JavascriptExecutor)driver).executeScript("document.getElementById('username').value='admin'");

		//		driver.findElement(By.id("username")).sendKeys("admin");

/*		Robot r =new Robot();
		//		r.keyPress(KeyEvent.VK_TAB);
		//		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);

		driver.navigate().to("file:///D:/input.html");
		Actions actions=new Actions(driver); 	
		WebElement we = driver.findElement(By.id("usename"));
		we.sendKeys("admin");
		actions.sendKeys(we, "hello").perform();
*/
		System.out.println("2.<---Write a script to click on button--->");
		/*((JavascriptExecutor)driver).executeScript("document.getElementById('loginButton').click()");
		 */

		System.out.println("3<---Write a script to select an option using java script");
		/*		driver.navigate().to("http://www.facebook.com");
		((JavascriptExecutor)driver).executeScript("document.getElementById('day').value='20'");
		((JavascriptExecutor)driver).executeScript("document.getElementById('month').value=12");
		((JavascriptExecutor)driver).executeScript("document.getElementById('year').value='2000'");
		 */
		Thread.sleep(4000l);
		System.out.println("4<---write a script to get text present in the textbox using javascript");
		/*		driver.findElement(By.id("username")).sendKeys("admin");
		try{
		((JavascriptExecutor)driver).executeScript("var val=document.getElementById('username').value; alert (val)");
		}catch(Exception e){}
		System.out.println(driver.switchTo().alert().getText());
		 */
		System.out.println("5<---Write a script to scroll the webpage using javascript");
		/*	((JavascriptExecutor)driver).executeScript("window.scrollby(0,1000)");
		 */
		System.out.println("6<---Write a script to count number of links present in the page using javascript");
		/*	driver.navigate().to("http://localhost/login.do");
		((JavascriptExecutor)driver).executeScript("var paragraphCount = document.evaluate( 'count(//a)', document, null, XPathResult.ANY_TYPE, null );alert( 'This document contains ' + paragraphCount.numberValue + ' link present' ) ");
		 */

		System.out.println("7.<----Write a Script to enter text into the textbox using xpath in javascript--->");
		/*		((JavascriptExecutor)driver).executeScript("document.getElementById('username').value='admin'");*/
		System.out.println("8.<----Write a Script minimize the browser------>");
		//		  driver.findElement(By.tagName("html")).sendKeys(Keys.ALT,Keys.SPACE+"n");
		/*	Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_ALT);*/

		System.out.println("9.<----Write a Script reSize of the browser---->");
		/*Dimension d=new Dimension(100,200);
		driver.manage().window().setSize(d);*/


		System.out.println("10.<---Write a Script to print page source ");
		/*driver.navigate().to("http://www.facebook.com");
		System.out.println(driver.getPageSource());
		 */

		System.out.println("11.<---Write a script to open the firefox browser without using firefox class-->");
		/*		Run("C:\Program Files (x86)\Mozilla Firefox\firefox.exe")
		WinWaitActive("Mozilla Firefox Start Page")
		Send("https://localhost/login.do")
		send("{ENTER}")

		Runtime r=Runtime.getRuntime();
		r.exec("d:/open.exe");
		 */		
		System.out.println("12.<---Write a script to take screenshot of the page");
		/*
		driver.navigate().to("http://www.facebook.com");
		System.out.println("<---Write a script to screenshot of page--->");
		TakesScreenshot t = ((TakesScreenshot)driver);
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		String date = new SimpleDateFormat("YYYY-MM-d-hh-mm-ss").format(new Date());
		File destFile=new File("./screenshot/"+date+".png");
		try 
		{
			FileUtils.copyFile(srcFile, destFile);
		}
		catch (IOException e) { }
		 */


		System.out.println("14.<---Write a script to refresh browser without using refresh() method--->");
		/*		Robot r=new Robot();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		 */

		System.out.println("15.<---Write a script to verify whether the element is present or not using findElement Method");

		/*
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		try
		{
			Thread.sleep(2000);
				driver.findElement(By.xpath("//span[contains(.,'Username or Password is invalid. Please try again.')]"));
			System.out.println("Element is present");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element is not available");
		}*/


		System.out.println("16.<---Write a script to verify whether the element is present or not using findElements Method");
		/*driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			List<WebElement> wes = driver.findElements(By.xpath("//span[contains(.,'Username or Password is invalid. Please try again.')]"));
			if(wes.size()>0)
			System.out.println("Element is present");
			else
				System.out.println("Element is not present");
		 */

		System.out.println("17.<---Write a script to verify whether the checkbox is selected or not");
		/*		WebElement keepLoggedInCheckBox = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		keepLoggedInCheckBox.click();
		if(keepLoggedInCheckBox.isSelected())
		{
			System.out.println("Checkbox is selected");
		}
		else
			System.out.println("Checkbox is not selected");
		 */
		System.out.println("18.<---Write a script to verify whether the radio button is selected or not");
		/*		html code for radio button
		 * <input type="radio" name="gender" value="male" checked> Male<br>
		  <input type="radio" name="gender" value="female"> Female<br>
		  <input type="radio" name="gender" value="other"> Other 
		driver.navigate().to("file:///D:/input.html");
		if(driver.findElement(By.id("male")).isSelected())
			System.out.println("Male radio button is selected");
		else
			System.out.println("Male radio button is not selected");
		 */		


		System.out.println("Movie finished");
	}
}