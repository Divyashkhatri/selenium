package ArraysPrograms;

import java.util.Arrays;

public class ReversingArray {

	public static void main(String[] args) {
//write a program to reverse first half and second half of an array.
		int a[]=new int[]{-2,-1,0,1,2,3,4,5,6,7,8,9},temp=0;
		System.out.println("Array before reversing and after reversing");
		System.out.println(Arrays.toString(a));
		for(int i=0,j=(a.length/2)-1;i<a.length/2/2;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}	
		for(int i=a.length/2,j=a.length-1;i<(a.length*3)/4;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
