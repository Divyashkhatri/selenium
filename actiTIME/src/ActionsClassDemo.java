import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static void main(String[] args) 
	{
//		dragAndDrop();
//		testResizeable();
		testSlider();
	}

	
	static void dragAndDrop()
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement dragable = driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement dropable = driver.findElement(By.xpath(".//*[@id='droppable']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(dragable, dropable).perform();
	}

	static void testResizeable()
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		WebElement resize = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		
		Actions action= new Actions(driver);
		action.dragAndDropBy(resize, 400, 200).perform();
	}
	
	static void testSlider()
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		WebElement slider = driver.findElement(By.xpath(".//*[@id='slider']/span"));
		
		Actions action= new Actions(driver);
		action.dragAndDropBy(slider, 90,0).perform();
	}
	
	
	
}
