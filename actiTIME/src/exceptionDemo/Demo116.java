package exceptionDemo;

public class Demo116 {
//using seperate try catch block
	public static void main(String[] args) {
		int i=30,j=0;
		try
		{
			System.out.println("Inside try block");
			j=i/j;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch");
		}

		try
		{
			i=Integer.parseInt("hello");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("NumberFormatException catch");
		}
	}

}
