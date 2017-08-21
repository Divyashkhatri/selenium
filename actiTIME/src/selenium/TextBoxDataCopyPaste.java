package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxDataCopyPaste 
{	
	public static final String GECKO_KEY="webdriver.chrome.driver";
	public static final String GECKO_VALUE="./driver/chromedriver.exe";
	public static void main(String []a) throws InterruptedException
	{	//open the browser
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/text.html");//Enter the url
		WebElement e1=driver.findElement(By.id("t1"));//find t1 textbox
		WebElement e2=driver.findElement(By.id("t2"));//find t2 textbox
		// write a program to copy  from one text field and paste to another text field

		//press ctrl+'A'
		//e1.sendKeys(Keys.CONTROL+"a");
		//press ctrl+'c'
		//e1.sendKeys(Keys.CONTROL+"c");
		e1.sendKeys(Keys.CONTROL+"ac");Thread.sleep(1000);
		// press ctrl+'v'
		e2.sendKeys(Keys.CONTROL+"v");Thread.sleep(1000);

		/*
	//press ctrl+'a'
	e1.sendKeys(Keys.CONTROL+"a");Thread.sleep(1000);
	//press delete
	e1.sendKeys(Keys.DELETE);Thread.sleep(1000);
	//press ctrl+'a' and delete
	//e1.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
	driver.close();
		 */
		/*e2.sendKeys(Keys.LEFT);
	Thread.sleep(1000);
	e2.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	e2.sendKeys(Keys.DELETE);
	e1.clear();
		 */
		/*	String v=e1.getAttribute("value");
	int l=v.length();
	String lenStr=Integer.toString(l);
	e1.sendKeys(lenStr);*/
		/*String v=e1.getAttribute("value");
	int l=v.length();
	System.out.println("number of char in textbox"+l);
	for(int i=0;i<l;i++)
		e1.sendKeys(Keys.BACK_SPACE);*/
	}
}
