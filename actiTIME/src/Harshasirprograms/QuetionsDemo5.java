package Harshasirprograms;

import static java.lang.System.out;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuetionsDemo5 
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
//		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/java-archive");
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/gem");
//		WebDriver driver=new FirefoxDriver(profile);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		
		
		
		out.println("45-->WAS to verify whether hidden division popup is displayed or not. if it displayed print its message and cancel the popup"
				+ "http://127.0.0.1/project/customers_projects.do "
				+ "create and try to delete you will get a hidden popup message");
		/*
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://127.0.0.1/project/customers_projects.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000l);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).sendKeys(Keys.ENTER);
		try
		{
			driver.findElement(By.xpath("//div[@class='attention']"));
			driver.findElement(By.xpath("//input[@class='confirmDialogCancelButton']")).sendKeys(Keys.ENTER);
		}
		catch(NoSuchElementException e)
		{
			System.out.println("hidden div is not displayed");
		}
		*/
		
		
		
		
		
		out.println("46-->write a script to select today's date in the calendar");
		/*System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://cleartrip.com");
		String date=new SimpleDateFormat("EEE, dd MMM, yyyy").format(new Date());
		driver.findElement(By.id("DepartDate")).sendKeys(date+Keys.ENTER);
	*/
		
		
		
		
		
		out.println("47-->write a script to select future (after 15 days) date in the calendar");
		/*System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.yatra.com/");
		Date todays_date=new Date();
		Calendar c=Calendar.getInstance();
		c.setTime(todays_date);
		int current_month=c.get(Calendar.MONTH);
		c.add(Calendar.DATE, 40);
		current_month=c.get(Calendar.MONTH)-(current_month-1);
		String str="(//ul[@class='month-list'])[1]/li/a[.='August ']";
		driver.findElement(By.xpath("//input[@id='BE_flight_return_date']")).click();
		driver.findElement(By.xpath("((//ul[@class='month-list'])[1]/li/a)["+current_month+"]")).click();
		driver.findElement(By.xpath("(//a/span[.='"+c.get(Calendar.DATE)+"'])["+current_month+"]")).click();
		*/
		
		
		
		
//		out.println("48-->write a script to upload a file in 2share.com");
				//Webdite not available 
		
		
		
		
		
		out.println("49-->write a script to login Naukri and print the values present under profile performance and also print the number of job alerts expand update profile option and print all the options present in it and logout");
/*		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
 		driver.navigate().to("https://www.facebook.com"); 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("divyashk4@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("95098728299414425894"+Keys.ENTER);
		Set<Cookie> cookies = driver.manage().getCookies();
		Thread.sleep(2000l);
		driver.close();
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		for(Cookie cookie:cookies)
		{

				driver1.manage().addCookie(cookie);	
		}
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com");
		
		*/
	
		
		
		out.println("50-->write a script to verify whether the given options is duplicate or not in the list");	
		/*System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='day']/option"));
		Set<WebElement> set=new HashSet<>(options);
		if(options.size()==set.size())
			System.out.println("duplicates not present");
		else
			System.out.println("duplicate is present");
		*/
		
		
		
		out.println("51-->write a script to perform following actions\n "
				+ "  print the country present in the listbox and select one of them \n"
				+ "  print a state present in the listbox and select one of them \n"
				+ "  print a city present in the listbox and select one of them");
		
		
		
		
		out.println("52-->write a script to download Ruby client binding  OS Selenium present in the download page of Selenium website");
		/*System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.navigate().to("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[.='Ruby']/../td[4]")).click();
		Thread.sleep(3000l);
		driver.findElement(By.xpath("//a[@id='download']")).click();
		*/
		
		
		
		out.println("53-->write a script to download Selenium standalone server jar file present in selenium website using autoit and without using autoit");
		/*System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.navigate().to("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//h3[.='Selenium Standalone Server']/../p[3]/a")).click();
		*/
		
		
		
		
		
		
		
		out.println("54-->how do you download a file onto "
				+ "1. desktop"
				+ "2. download folder"
				+ "3 different drive"
				+ "4. specified path "
				+ "using firfoxprofile and without using firefoxprofile");
		/*//firfoxprofile
		FirefoxProfile Profile = new FirefoxProfile();
		Profile.setPreference("browser.download.folderList",0);
		Profile.setPreference("browser.download.manager.showWhenStarting",false);
		Profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		Profile.setPreference("browser.download.dir","e:");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver(Profile);
		driver.get("http://www.seleniumhq.org/download/");
//		driver.findElement(By.xpath("(//h3[.='Selenium Standalone Server']/../p)[3]/a")).click();
		driver.findElement(By.xpath("//td[.='Java']//..//td/a[.='Download']")).click();*/
		
		
		out.println("55-->write a script to download a file and verify that a file is downloaded completely");
		//???????????????????????????????????
		
		
		
		out.println("56-->write a script to upload multiple files");
// Incomplete solution
		/*System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.navigate().to("https:www.dropbox.com/home");
		driver.findElement(By.xpath("//input[@name='login_email']")).sendKeys("bcsm15abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='login_password']")).sendKeys("selenium@321"+Keys.ENTER);
			Thread.sleep(3000l);
		driver.findElement(By.xpath("//button[.='Upload files']")).click();
		driver.findElement(By.xpath("//div/button[.='Choose files']")).click();
		Runtime.getRuntime().exec("D:\\BCSM13\\actiTime\\AutoIt\\Sendcontrol+AENTER.exe");*/
		
		out.println("57-->write a script to upload resume in naukri.com");		
/*		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.naukri.com");
		driver.findElement(By.xpath("(//div[.='Login'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='eLogin']")).sendKeys("divyashk5@gmail.com");
		driver.findElement(By.xpath("//input[@id='pLogin']")).sendKeys("Naukri_password"+Keys.ENTER);
		driver.navigate().to("https://my.naukri.com/Profile/view?id=");
		driver.findElement(By.partialLinkText("Upload New Resume")).click();
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("");
		driver.findElement(By.xpath("(//div/b[.='Save'])[1]")).click();
*/		
		
		out.println("58-->write a script to scroll to a particular element");
		/*System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://news.google.com/news/");
		boolean flag=true;
		int count=0;
		while(flag)
		{
			try
			{
				WebElement element=driver.findElement(By.xpath("(//a)[4000]"));
				flag = false;
				System.out.println("end");
			}
			catch(Exception e)
			{
				if(count==100)
				break;
//				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,100)");
			}
		}*/
		
		
		
		out.println("59-->write a script to handle page onload popup"
				+ "1. using autoit"
				+ "2. without using autoit");		
		/*By using AutoIt
		driver.navigate().to("file:///D:/BCSM13/actiTime/HTMLpages/onLoadpopup.html");
		Runtime.getRuntime().exec("./AutoIt/onloadpopup.exe");
	
		without using autoit
		driver.switchTo().alert().accept();
		*/
		
		
		
		out.println("60-->write a script to handle page onload popup using autoIt but the username and password from Selenium"
				+ "hint-->command line argument of autoit");		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	solution 1-->
//		driver.get("https://svn2.sliksvn.com/sejsoft_sejalbhayana");
//		Runtime.getRuntime().exec(".\\AutoIt\\onloadpopup1.exe");
		
		//solution 2-->
		//http://username:password@www.domain.com
		driver.get("https://sejal:pass@1234@svn2.sliksvn.com/sejsoft_sejalbhayana");
		//sejal:pass@1234
		
		
		
		
		
		
		out.println("61-->write a script to count the number of browsers opened by the Selenium");
//		System.out.println(driver.getWindowHandles().size());
		
	
	
	
	}

}
