package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws IOException {
		/*System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://actimind.com/contact.php");
		driver.findElement(By.id("upload-window")).sendKeys("D:\\peronal\\New folder\\1.jpg");*/
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://uploadfiles.io/");
		driver.findElement(By.id("upload-window")).click();
		Runtime r=Runtime.getRuntime();
		r.exec("D:\\upload.exe");
	}

}
