import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLink {

	public static void main(String[] args) throws IOException {
		/*File fil=new File("D:\\BCSM13\\actiTime\\fileHandleingData\\Qspiders Selenium.txt");
		FileReader fread=new FileReader(fil);
		BufferedReader bufread=new BufferedReader(fread);
		File file=new File("./fileHandleingData/Demo1.txt");
		System.out.println(fil.createNewFile());
		FileWriter fwriter=new FileWriter(file);
		BufferedWriter bufwriter=new BufferedWriter(fwriter);

		bufwriter.newLine();


		String s="";
		while((s=bufread.readLine())!=null)
		{
			if(s.length()>0)//to skip empty line
			{
				int initial=s.indexOf("<http")+1;

				if(initial>0)
				{
					int finals=s.indexOf('>');
					if(finals>=initial)
					{
						String data=s.substring(initial,finals);
						System.out.println(initial+" "+finals);
						bufwriter.write(data);
						bufwriter.newLine();	
					}
				}
			}
		}

		bufread.close();
		bufwriter.close();
*/
/*		File fil=new File("D:\\BCSM13\\actiTime\\fileHandleingData\\Demo2.txt");
		FileReader fread=new FileReader(fil);
		BufferedReader bufread=new BufferedReader(fread);
		File file=new File("./fileHandleingData/Demo3.txt");
		System.out.println(fil.createNewFile());
		FileWriter fwriter=new FileWriter(file);
		BufferedWriter bufwriter=new BufferedWriter(fwriter);
		Set<String> set=new TreeSet<String>();
		String s="";
		while((s=bufread.readLine())!=null)
		{
			if(s.length()>0)//to skip empty line
			{
				set.add(s);
			}
		}
			for(String s1:set)
			{
				bufwriter.write(s1);
				bufwriter.newLine();
			}
			bufread.close();
		bufwriter.close();
	*/
		//div[@class='_5pbx userContent']
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("divyashk4@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("95098728299414425894"+Keys.ENTER);
		File fil=new File("D:\\BCSM13\\actiTime\\fileHandleingData\\Demo3.txt");
		FileReader fread=new FileReader(fil);
		BufferedReader bufread=new BufferedReader(fread);
		File file=new File("./fileHandleingData/fbContent_2.txt");
		System.out.println(fil.createNewFile());
		FileWriter fwriter=new FileWriter(file);
		BufferedWriter bufwriter=new BufferedWriter(fwriter);
		String s="";
		while((s=bufread.readLine())!=null)
		{
			if(s.length()>0)//to skip empty line
			{
				
				try
				{
					driver.navigate().to(s);
					Thread.sleep(2000l);
					bufwriter.write(driver.findElement(By.xpath("//div[@class='_5pbx userContent']")).getText());
					bufwriter.write("-----------------------------------------------------------");
					bufwriter.newLine();
					
				}
				catch(Exception e)
				{
					System.out.println(s);
					
				}
			}
		}
		//		
	
		bufread.close();
		bufwriter.close();
	
	}

}
