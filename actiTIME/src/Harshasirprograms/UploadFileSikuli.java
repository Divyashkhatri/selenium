package Harshasirprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFileSikuli {
//link to download sikuli
	//https://launchpad.net/sikuli/sikulix/1.1.1
	public static void main(String[] args) throws FindFailed 
	{
		//java -jar sikulixsetup...jar
		//Below Code is working
		Screen screen = new Screen();
		Pattern img1 = new Pattern("./sikuliImages/chooseFiles.JPG");
		Pattern img2 = new Pattern("./sikuliImages/enterPath.JPG");
		Pattern img3 = new Pattern("./sikuliImages/open.JPG");
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.zamzar.com/");
//		driver.findElement(By.id("inputFile")).click();
		screen.wait(img1,15);
		screen.click(img1);
		
		screen.wait(img2,5);
		screen.type(img2,"D:\\BCSM13\\actiTime\\sikuliImages\\enterPath.JPG");
	
		screen.click(img3);
		
		System.out.println("Finished");
		
		
	}

}
