package exceptionDemo;

import java.io.Serializable;
import java.util.HashMap;

public class Demo117 {

	public static void main(String[] args) {
		try
		{
			int i=10,j;
			System.out.println("Inside try block");
			try
			{
				System.out.println("Inside Inner try");
				j=i/0;
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae.getClass().getCanonicalName());
				
				
			}
			
			
		}
		catch(NumberFormatException exp)
		{
			
		}

	}

}
