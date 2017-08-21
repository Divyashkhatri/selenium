package Harshasirprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QuetionsDemo6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//write a script to  list Names in a Drop down list and print only the names which ends with letter "A","E","I","O","U" only
		/*System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://application.axisbank.com/webforms/NRI_Online_Form/NRILogIn.aspx?cta=homepage-open-an-account-tab");
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='CPHBody_ddlOCountry']/option"));
		for(WebElement option:options)
		{
			String text=option.getText();
			String ch=""+text.charAt(text.length()-1);
			if(ch.matches("[aeiouAEIOU]"))
				System.out.println(text);
		}
		 */
		WebElement we;
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://adunits.popmunch.com/test/max_count/test.html");
		//		driver.navigate().to("https://www.facebook.com");
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000l);
		//		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		//		driver.switchTo().frame(1);		
		//		System.out.println();
		Actions actions=new Actions(driver);

		//		System.out.println(frames.size());

		//			try
		//			{
		//				driver.switchTo().frame(1);
		//				actions.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[1]"))).perform();
		//				actions.click().perform();
		//				driver.switchTo().defaultContent();
		//			}
		//			catch(Exception  e)
		//			{
		//				System.out.println(e);
		//			}
		//			we=driver.findElement(By.xpath("(//iframe[@class='dwCls'])[1]"));
		//			driver.switchTo().frame(0);
		//			Thread.sleep(1000l);
		//			actions.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[1]"))).perform();
		//			actions.click().perform();

		//		List<WebElement> frames = driver.findElements(By.xpath("//iframe"));
		//		for(WebElement frame:frames)
		//		{	
		//			try{
		//				driver.switchTo().frame(frame);
		//				
		//				WebElement fwe = frame.findElement(By.xpath("/html/body/div[1]/div[1]"));
		//				System.out.println(fwe.getAttribute("onclick"));
		//				((JavascriptExecutor)driver).executeScript(fwe.getAttribute("onclick"));
		//			}
		//			catch(Exception e){
		//				e.printStackTrace();
		//			}
		//		}

		String str=driver.getPageSource();
		int index1=str.indexOf("onclick");
		int index2=str.indexOf("onclick",index1+20);
		System.out.println(str);
	}
}


