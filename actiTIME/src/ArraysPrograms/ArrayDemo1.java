package ArraysPrograms;

import java.util.Scanner;

/*
 * WAP to sort content an array (bubble sort)
 * linear search
 * binary search
 * WAP to find duplicate occurance of an element present in class
 * write a program  to sort class type elements(comparable and comparator)
 * write a program To print unique characters in string
 * 
 * What is Array ?
 * Collection of multiple values of same type of fixed length in nature..we can store homogeous values 
 * Disadvantages of an array
 * 
 * 
 * why we cannot reinitialize length of an array
 * Array object consist of a non static final variable called length and we cannot reinitialize final variable hence array size is fixed
 *three types of final variable ---> static final, non static final, local final 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class ArrayDemo1 
{
	
	//Write a program to give dynamic input to array ?
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter The Size");
		int size = sc.nextInt();
		int array[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the value at"+ (i+1)+" ");
			array[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i]);
		}
	}
}
