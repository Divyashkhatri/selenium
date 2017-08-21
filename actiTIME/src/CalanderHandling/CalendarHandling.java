package CalanderHandling;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling 
{
	
	
	static int targetDay=0, targetMonth=0,targetYear=0;
	static int currentDay=0, currentMonth=0,currentYear=0;
	static int jumpMonthBy=0;
	static boolean increment= true;
	public static void main(String[] args) 
	{
		String DateToSet = "04/07/2017";

		getCurrentDateDayAndyear();
	
		System.out.println(currentDay);
		System.out.println(currentMonth);
		System.out.println(currentYear);
	
		
		getTargetDateDayAndyear(DateToSet);
		
		System.out.println(targetDay);
		System.out.println(targetMonth);
		System.out.println(targetYear);
		
		calculateHowManyMonthsToJump();
		System.out.println(jumpMonthBy);
		System.out.println(increment);
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		new ChromeDriver().get("");
		driver.get("");
		for(int i=0;i<jumpMonthBy;i++)
		{
			if(increment)
			{
				driver.findElement(By.xpath(""));
			}
			else
			{
				driver.findElement(By.xpath(""));			
			}
		}
		
		
		driver.findElement(By.linkText(Integer.toString(targetDay)));
		
		
	}

	public static void getTargetDateDayAndyear(String dateString)
	{
		int firstIndex = dateString.indexOf("/");
		int lastIndex = dateString.lastIndexOf("/");
		
		String day = dateString.substring(0,firstIndex);
		targetDay= Integer.parseInt(day);
		
		String month = dateString.substring(firstIndex + 1,lastIndex);
		targetMonth= Integer.parseInt(month);

		String year = dateString.substring(1+lastIndex);
		targetYear= Integer.parseInt(year);
	}
	
	public static void getCurrentDateDayAndyear()
	{
		Calendar cal = Calendar.getInstance();
		 currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth = cal.get(Calendar.MONTH)+1;
		currentYear = cal.get(Calendar.YEAR);
	}
	
	public static void calculateHowManyMonthsToJump()
	{
		if((targetMonth-currentMonth)>0)
		{
			jumpMonthBy = targetMonth-currentMonth;
		}
		else
		{
			jumpMonthBy = currentMonth-targetMonth;
			increment = false;
		}
	}
	
}
