package PitamberTest;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
public class LoginDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10l,TimeUnit.SECONDS);
		driver.navigate().to("http://dmscc.vtstest.com.au:8080/CCTPortal/#/login");
		WebElement wen=driver.findElement(By.xpath("//input[@name='userName']"));
		wen.sendKeys("Superuser");
		WebElement wenpwd=driver.findElement(By.xpath("//input[@name='userPwd']"));
		wenpwd.sendKeys("keane*12",Keys.ENTER);
		Thread.sleep(3000l);
		//driver.findElement(By.xpath("//a[@class='ng-scope' and @href='#/transactor/terminalActivity']")).click();

		/*  List<WebElement> we4= driver.findElements(By.xpath("//a"));
			   System.out.println(we4);*/

		driver.findElement(By.linkText("Terminal Activity")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-blue btn-blue-hover']")).click();
		driver.findElement(By.xpath("//input[@class='form-control form-textbox-search mrg-right-15 pull-left  ng-pristine ng-valid']")).sendKeys("90700312",Keys.ENTER);

		driver.findElement(By.xpath("//a[contains(text(),'90700312')]")).click();
		driver.findElement(By.xpath("//li[@class='menu-li ng-scope selected-bg']")).click();
		driver.findElement(By.xpath("//li[@class='menu-li ng-scope selected-bg']")).click();





		WebElement element = driver.findElement(By.xpath("//nav/div/div[2]/ul/li/a"));
		Actions builder = new Actions(driver);
		builder.doubleClick(element).perform();

		driver.findElement(By.xpath("//button[@class='btn btn-default btn-blue btn-blue-hover mrg-top-20']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//driver.findElement(By.xpath("//img[@src='images/icon-import.jpg']")).click();

		driver.findElement(By.xpath("//a[@id='start_date_btn']")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();


		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for(WebElement ele:allDates)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase("1"))
			{
				ele.click();
				break;
			}

		}

		driver.findElement(By.xpath("//button[@ng-click='search()']")).click();
		driver.findElement(By.xpath("//a[@href='#/transactor/20170619_075629623_oprlog7_90700312.zip/90700312/viewZipFileDetails']")).click();




		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for (int second = 0;; second++) {
			if(second >=60){
				break;
			}
			jse.executeScript("window.scrollBy(0,800)", ""); //y value '800' can be altered

		}

		/*Thread.sleep(2000l);

				WebElement wes=driver.findElement(By.xpath("//div[.='ShiftClose']/../../../td)[3]"));
				System.out.println(wes.getAttribute("title"));*/


		/* List<WebElement> wes = driver.findElements(By.xpath("((//div[.='ShiftClose']/../../../td)[3]"));
				    for(WebElement we:wes)
			        {
			                String streport=we.getAttribute("title");
			                System.out.println(streport);

			        }*/

		WebElement we1=driver.findElement(By.xpath("(//div[.='ShiftClose']/../../../td)[6]"));

		System.out.println(we1.getText());

		WebElement we2= driver.findElement(By.xpath("(//div[.='ShiftClose']/../../../td)[3]"));
		// we2.getAttribute("title");
		System.out.println(we2.getAttribute("title"));




	}




}


