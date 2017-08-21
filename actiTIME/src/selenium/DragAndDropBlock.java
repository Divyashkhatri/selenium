package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDropBlock {
	//Action class used in 
	//drag and drop
	//Mouse hover
	//context Click
	//composite actions
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		String xp="//h1[.='Block 1']";
		WebElement b1=driver.findElement(By.xpath(xp));
		String xp1="//h1[.='Block 3']";
		WebElement b3=driver.findElement(By.xpath(xp1));
		Actions actions=new Actions(driver);
		Thread.sleep(2000);
		actions.dragAndDropBy(b1,2000,100).perform();
		Thread.sleep(2000);
		actions.dragAndDrop(b1,b3).perform();
	}

}
