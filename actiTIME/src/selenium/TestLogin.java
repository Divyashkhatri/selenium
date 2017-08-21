package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("http://localhost/login.do");
		LoginPageusingAnotation l=new LoginPageusingAnotation(driver);
		l.clickLogin("admin","manager");
		*/
		driver.get("http://www.flipkart.com");
		POMclassFindElements fes=new  POMclassFindElements(driver);
		fes.getAllLinks();
	}
}