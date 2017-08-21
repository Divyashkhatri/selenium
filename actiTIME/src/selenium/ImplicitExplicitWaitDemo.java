package selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("http://localhost/login.do");
		driver.navigate().to("file:///D:/input.html");

		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				.withTimeout(10l,TimeUnit.SECONDS);
		wait.until(ExpectedConditions.titleContains("actitime"));

		WebDriverWait wait1=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("Actitime"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("")));
		wait.until(ExpectedConditions.titleIs(""));
		wait.until(ExpectedConditions.titleContains(""));
		wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(""),"Bad Boy"));
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
