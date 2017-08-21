package ArraysPrograms;

public class ArrayDemo2 {

	public static void main(String[] args) {
//	write a program to find sum of elements of array ?
//	write a program to find sum of even content of array ?
//		write a program to find sum of odd content of array ?
	int array[]=new int[]{10,20,30,40,50};	
		int sum=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0) //if(array[i]%2==1)
			sum=sum+array[i];
			
		}
		
		System.out.println(sum);
		
		
	

	
	
	}
}
