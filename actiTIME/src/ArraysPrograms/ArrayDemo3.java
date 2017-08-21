package ArraysPrograms;

public class ArrayDemo3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	// write a program to copy elements of one array to another array
		int array[]=new int[]{10,20,102,10,102,2992,2292};
		int array1[]=new  int [array.length];
		for(int i=0;i<array.length;i++)
		{
			array1[i]=array[i];
		}
		
		for(int k=0;k<array.length;k++)
		{
			System.out.println("after copy the new array is "+(k+1)+"-->"+array1[k]);
			
		}
		
	}

}
