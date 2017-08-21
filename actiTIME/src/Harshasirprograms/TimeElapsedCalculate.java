package Harshasirprograms;
public class TimeElapsedCalculate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		long starttime = System.currentTimeMillis();
		call();
		long endtime=System.currentTimeMillis();
		System.out.println(endtime-starttime);
	}
		static void call() throws InterruptedException
		{
			Thread.sleep(1000l);
		}
}