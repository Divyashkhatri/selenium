package arrayDemo;

import java.util.Scanner;


public class ArrayDemo1 implements Cloneable{

	public static void main(String[] args) {
		
		String str1[]={"Hello"};
		System.out.println(str1);//prints address
		System.out.println(str1[0]);// prints value at zero index
		add1(2,3,4,5);
		add(1,2);
		int a[]={1,2,3,5,3,2,2};
		add(a);
		add1(a);
		int a11[][][][]={{{{1,2},{2,3}}}};
		int a1[][][][]=a11.clone();
		System.out.println(a11==a1);
		int i=a11.length;
		i=a11[0].length;
		i=a11[0][0].length;
		
		String str=""+a11;
		System.out.println(str.substring(str.indexOf('@'), str.length()));
	}


	static int add(int n1,int n2)
	{
		System.out.println("n1,n2 method");
		return n1+n2;
	}
	static int add(int n1[])
	{
		System.out.println("array method");
		int sum=0;
		for(int i=0;i<n1.length;i++)
		{
			
			sum=sum+n1[i];
		}
		return sum;
	}
	static int add1(int...n1)
	{		System.out.println("n1... method");
		int sum=0;
		for(int i=0;i<n1.length;i++)
		{
			
			sum=sum+n1[i];
		}
		return sum;
	}
}
