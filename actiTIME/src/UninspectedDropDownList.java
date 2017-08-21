import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UninspectedDropDownList 
{
	@FindBy(xpath="//span[@class='pac-matched']")
	List<WebElement> suggetions;
	public static void main(String[] args) 
	{
		//write a script to select 3rd option in the search by locality or brand dropdown list "https://www.nobroker.in"
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nobroker.in");
		System.out.println(driver.getTitle().equals("Residential Properties for Rent/Sell/Buy in India"));
		driver.findElement(By.id("locationGoogle")).sendKeys("ex-en");
		UninspectedDropDownList d=new UninspectedDropDownList ();
		PageFactory.initElements(driver,d);
		for(int i=0;i<d.suggetions.size();i++)
		{
			System.out.println(d.suggetions.get(i).getText());
		}
		d.suggetions.get(2).click();
	}
}
