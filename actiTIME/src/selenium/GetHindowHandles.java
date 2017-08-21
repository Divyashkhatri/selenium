package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program to close child browsers
public class GetHindowHandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
/* write a script to close parent browser	
		String wh=driver.getWindowHandle();//get current window handle
		Set<String> whs = driver.getWindowHandles();//get all window handle
	//-->// either use if or use remove() 
		whs.remove(wh);//remove parent window handle from set
		for(String text:whs)
		{
			
			//if(!text.equals(wh))
			driver.switchTo().window(text).close();
		}
		*/
		/*
//write a program to print tittle of all window
//write a script to close all window without using quit method
		Set<String> allwh=driver.getWindowHandles();
		for(String whl:allwh)
		{
			driver.switchTo().window(whl);
			System.out.println(driver.getTitle());
			driver.close();
		}
		*/
/*
//	Write a script to close specified browser (title name is given//amazon)
		Set<String> whs = driver.getWindowHandles();//get all window handle
		for(String wh :whs)
		{
			
			if(!driver.switchTo().window(wh).getTitle().equals("Amazon")){
				driver.close();
			}
		}
	*/
		
		
		
	}

}
