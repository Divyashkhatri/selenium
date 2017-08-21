package Harshasirprograms;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Write a script to take screen shot of an element in the application
public class TakeScreenShotOfWebElement {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();

//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);

		driver.get("http://localhost/login.do");

		captureElementScreenshot(driver.findElement(By.xpath("//input[@name='username']/ancestor::table[@class='bordered']")));


	}


	public static  void captureElementScreenshot(WebElement element) throws IOException{

		//Capture entire page screenshot as buffer.
		//Used TakesScreenshot, OutputType Interface of selenium and File class of java to capture screenshot of entire page.
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		//Used selenium getSize() method to get height and width of element.
		//Retrieve width of element.
		int ImageWidth = element.getSize().getWidth();
		//Retrieve height of element.
		int ImageHeight = element.getSize().getHeight();  

		//Used selenium Point class to get x y coordinates of Image element.
		//get location(x y coordinates) of the element.
		Point point = element.getLocation();
		int xcord = point.getX();
		int ycord = point.getY();

		//Reading full image screenshot.
		BufferedImage img = ImageIO.read(screen);

		//cut Image using height, width and x y coordinates parameters.
		BufferedImage dest = img.getSubimage(xcord+100, ycord+90, ImageWidth+40, ImageHeight);
		ImageIO.write(dest, "png", screen);

		//Used FileUtils class of apache.commons.io.
		//save Image screenshot In D: drive.
		FileUtils.copyFile(screen, new File(".\\screenshot\\screenshot.png"));
	}
}