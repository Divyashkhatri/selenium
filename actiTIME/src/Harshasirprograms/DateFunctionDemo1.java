package Harshasirprograms;

import java.util.Calendar;
import java.util.Date;

public class DateFunctionDemo1 
{
	public static void main(String[] args)
	{
		Date d1=new Date();
//		System.out.println(d1.toString());
		Calendar c=Calendar.getInstance();
		c.setTime(d1);
		System.out.println(c.getTime());
//		System.out.println(c.getFirstDayOfWeek()==Calendar.SUNDAY);
//		System.out.println(c.getTimeZone());
		c.add(Calendar.DATE,40000);	
		System.out.println(c.getWeeksInWeekYear());
		
//		c.add(Calendar.YEAR,4);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.getTime().getDate());
		System.out.println(c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));

		
		
		
	}

}
