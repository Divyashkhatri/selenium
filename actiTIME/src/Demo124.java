import java.io.IOException;
import java.util.Scanner;
/*
 * If we want to create our own exception class put it under any class 
 * RuntimeException or Exception
 * if we extend Exception class then it is known as checked exception
 * if we extend RuntimeException class then it is known as unchecked exception
 * checked exception:- an Exception where the compiler can check at the time of compilation. 
 * It should be handled in order to compile the program successfully 
 * checked exception can be handles by using 
 * try-catch block 
 * using throws declaration statement.
 * 
 * 
 * unchecked Exception :- Exception which are not been able to be identified by the compiler 
 * at time of compilation. throws keyword is not mandatory to use
 */
class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg)  {
	System.out.println(msg);
	}
}

public class Demo124 {

	public static void main(String[] args)  {
		System.out.println("Enter Valid age:--");
		int age =new Scanner(System.in).nextInt(); //java.util.InputMismatchException
		try{
		if(age>=60 || age<=0)
		throw new InvalidAgeException("Enter valid age");
		}
		catch(InvalidAgeException iae)
		{
			iae.printStackTrace();
		}
		System.out.println(age);
	}
}
