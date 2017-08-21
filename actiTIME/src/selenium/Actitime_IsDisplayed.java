package selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime_IsDisplayed {
	public static void main(String[] args) {
		System.out.println("Enter the id of element(t1/t2/t3:)");
		Scanner sc=new Scanner(System.in);
		String v=sc.nextLine();
		sc.close();
		
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/demo.html");
		/*try{
			WebElement ele=driver.findElement(By.id(v));
			System.out.println("Present in src");
			if(ele.isDisplayed())
			{
				System.out.println("Pass: element is displayed");
			}
			else{
				System.out.println("Fail: element is not displayed");
			}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Fail: element is not present in srs");
		}*/
		WebDriverWait wait=new WebDriverWait(driver,10);		
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(v)));
			System.out.println("Pass:element is visible");
		}
		catch (TimeoutException e){
			System.out.println("Fail :element is not visible");
		}
	}
}
