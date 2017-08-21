package exceptionDemo;
import java.util.Scanner;
class Orange implements AutoCloseable{
	@Override
	public void close() throws Exception {
		
	}	
}
public class TryWithResourceBlock {
		public static void main(String[] args)  throws RuntimeException{
			
			try(Scanner sc=new Scanner(System.in)){
		//try with resources is equal to try-finally block
			// only try is not possible 	
			}
			
			
			
			try(Orange o=new Orange())
					{
				/*
				 * as we can see the try with resourses is possible
				 * and here resourses can be only that class which 
				 * implements Autoclosable and we know Autocloseable contain 
				 * one abstract method that is close() so it has to be
				 * implemented. if it is implemented then only we can 
				 * use in try resource block
				 * */ 
				System.out.println("try orange with resourse ");							
					}
					catch(Exception e){
						System.out.println("catch");
					}
		}
}
