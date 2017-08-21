import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSeleniumQspiders {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		File fil=new File("./fileHandleingData/fbcontent.txt");
		System.out.println(fil.createNewFile());
		FileWriter fwriter=new FileWriter(fil);
		BufferedWriter bufwriter=new BufferedWriter(fwriter);
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("divyashk4@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password"+Keys.ENTER);
		Thread.sleep(1000l);
		driver.navigate().to("https://www.facebook.com/groups/Qspiders.Selenium/");
		List<WebElement> wes = driver.findElements(By.xpath("//p"));
		String xp2="//a[@class='see_more_link']";
		String xp1="//div[@class='fbUserContent _5pcr']";
		String xp="//div[@class='fbUserContent _5pcr']//p";
		String newXP="(//div[@class='text_exposed_root']|//div[@class='text_exposed_show'])//p";
		String hiddenTextXp="//div[@class='text_exposed_root']|//div[@class='text_exposed_show']";
		while(wes.size()<=100)
		{
			wes = driver.findElements(By.xpath("//p"));			
			System.out.print(wes.size());
			Thread.sleep(300l);
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,4000)");
		}
		
		for(WebElement we:wes)
		{
			bufwriter.write(we.getText());
			bufwriter.write("\n");
		}
		bufwriter.close();
		System.out.println("<---------------End---------------------------->");
	}

}
