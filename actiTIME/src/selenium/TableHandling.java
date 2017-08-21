package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Table.html");
	/*	//Q Script to print the table in table format
		WebElement table=driver.findElement(By.id("t1"));// findElement of WebDriver
		// to get all data from table
		List<WebElement> allTD = table.findElements(By.tagName("td"));	 //findelements of WebElement
		int sum=0;
		// to count number of rows
		List<WebElement> allTR = table.findElements(By.tagName("tr"));	
		int countTR=allTR.size();
		int countTD = (allTD.size())/countTR;
	 	int i=0;		
		for(int j=0;j<countTD;j++){
		 	for(int k=0;k<countTR;k++){
		 		String text=allTD.get(i).getText();
		 		System.out.print(text+" ");
		 		i++;
		 		}
		 		System.out.println("");
		 	} driver.quit();*/
		
		//script to print content of table column wise		
		List<WebElement> table=driver.findElements(By.xpath("//table[2]//td[3]"));
		int count=table.size();
		for(WebElement table1:table)
		{
			System.out.println(table1.getText());
		}
		
		
		
		
		
		
	}

}
