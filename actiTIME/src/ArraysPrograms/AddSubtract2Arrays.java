package ArraysPrograms;

public class AddSubtract2Arrays {

	public static void main(String[] args) {
		int a[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		int b[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		//write a program to add two matrix or 2-d array
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=a[i][j]+b[i][j];
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println();	
	//write a program to subtract two matrix or 2-d array
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=a[i][j]-b[i][j];
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	}

}
