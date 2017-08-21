package exceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo115 {

	public static void main(String[] args) {
		int i=10;
		int j;
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("enter value");
			i=sc.nextInt();
			j=i/0;
		}
		catch(InputMismatchException ime)
		{
			System.out.println("InputMismatchException");
		}
		catch(NumberFormatException nfe)
		{
			//nfe.printStackTrace();
			System.out.println("NumberFormatException catch");
		}
		catch(ArithmeticException ae)
		{
			//ae.printStackTrace();
			System.out.println("ArithmeticException catch");
		}
			System.out.println("outside");
		
	}

}
