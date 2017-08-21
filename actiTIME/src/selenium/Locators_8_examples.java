package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_8_examples {
	// public static String key1="webdriver.chrome.driver";
	// public static String value1="D:/chromedriver.exe";
	static {
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
	}

	public static void main(String a[]) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https:www.flipkart.com");// file:///D:/demo.html
		// driver.findElement(By.tagName("a")).click();
		// driver.findElement(By.id("a")).click();
		// driver.findElement(By.name("n1")).click();
		// driver.findElement(By.className("gb_9a gbii")).click();
		// driver.findElement(By.className("gb_Ha gb_0e gb_7e gb_xb")).click();
		// driver.findElement(By.linkText("Google")).click();
		// driver.findElement(By.partialLinkText("oo")).click();
		// driver.findElement(By.cssSelector("a.c1")).click();
		// driver.findElement(By.xpath("/html/body/a")).click();
		// driver.findElement(By.xpath("//input[@type='email']")).click();
		/*
		 * download 34 files from ISTQB driver.get(
		 * "http://istqbexamcertification.com/istqb-dumps-download-mock-tests-and-sample-question-papers/"
		 * );
		 * Scanner sc= new Scanner(System.in);
		 * int n=sc.nextInt();
		 * for(int i=1;i<=n;i++){
		 * driver.findElement(By.
		 * xpath("//a[@target='_blank' and text()='ISTQB Dumps and Mock Tests for Foundation Level Paper-"
		 * +i+"']")).click(); Thread.sleep(10000);}
		 */
		 //driver.findElement(By.xpath("//li//a[text()='Sell on Flipkart']")).click();
	}
}