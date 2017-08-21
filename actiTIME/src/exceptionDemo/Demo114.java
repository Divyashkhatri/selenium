package exceptionDemo;

public class Demo114 {

	public static void main(String[] args) {
			try
			{
				System.out.println("inside try block");
				int i=10;
				int j=i/0;
				System.out.println("exiting try block");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("inside catch block");
			}
	}
}
