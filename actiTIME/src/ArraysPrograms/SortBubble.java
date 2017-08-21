package ArraysPrograms;

import java.util.Arrays;

public class SortBubble {

	public static void main(String[] args) {
		int array[]=new int[]{1,10,4,3,5,2,63,7,54,45};
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					array[j]=array[j]+array[j+1];
					array[j+1]=array[j]-array[j+1];
					array[j]=array[j]-array[j+1];
				}
			}
		}
System.out.println(Arrays.toString(array));		

	}

}
