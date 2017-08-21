package arrayDemo;


public class Demo113 {

	public static void main(String[] args) {
		//creating a jagged array
		int a[][]=new int[4][];
		a[0]=new int[4];
		a[1]=new int[2];
		a[2]=new int[4];
		a[3]=new int[1];
		
		//printing a Jagged array using for loop
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
		//printing jagged array using for each loop
		for(int aa[]:a)
		{
			for(int i:aa)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}
		
		//Another way to create Jagged array
		int a1[][]=new int[4][];
		a1[0]=new int[]{3,5,7,9};
		a1[1]=new int[]{4,2};
		a1[2]=new int[]{5,7,8,6};
		a1[3]=new int[]{6};
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a1[i][j]);
			}
			System.out.println();
		}
		
		
		for(int aa[]:a1)
		{
			for(int i:aa)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
