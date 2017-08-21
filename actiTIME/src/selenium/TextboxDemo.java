package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*	html page -->	input.html
 * <input value='divyashk5@gmail.com'>
 * */
public class TextboxDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("http://localhost/login.do");
		driver.navigate().to("file:///D:/input.html");

		WebElement we = driver.findElement(By.tagName("input"));
		System.out.println(we.getAttribute("value"));
		System.out.println(" getText() is not working "+we.getText());


	}

}
