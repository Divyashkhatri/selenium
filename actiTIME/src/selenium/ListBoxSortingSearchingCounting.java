package selenium;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ListBoxSortingSearchingCounting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*
Q 1  .  Write a script to count number of option present in listbox and print all option present in that listbox?
Q 2. write a script to print content of listbox in reverse order ?
		driver.get("file:///D:/list.html");
		WebElement listbox = driver.findElement(By.id("slb"));

		Select select=new Select(listbox);
		List<WebElement> alloption = select.getOptions();

		int count = alloption.size();
		System.out.println(count);

		for(int i=count-1;i>=0;i--)
		{
			WebElement we = alloption.get(i);
			String text=we.getText();
			System.out.println(text);
		}
		 */
		/*
	//	write a script to print content in sorted order ?
		driver.get("file:///D:/list.html");
		WebElement listbox = driver.findElement(By.id("slb"));

		Select select=new Select(listbox);
		List<WebElement> alloption = select.getOptions();
		ArrayList<String> list=new ArrayList<String>();
		int count = alloption.size();

		for(int i=0;i<count;i++){
		WebElement we = alloption.get(i);
		String text = we.getText();
		list.add(text);
		}
		Collections.sort(list);
		for(int i=0;i<count;i++)
		System.out.println(list.get(i));
		 */

	}
}
