package arrayDemo;

/*
 * jagged Array--> it is an array where the size of each sub 
 * array can differ
 * 				OR
 * In Simple words, Each row can contain different number of columns.
 * 
 * */
public class Demo112 {
//Assigning and printing values of jagged array
	public static void main(String[] args) {
		int a[][]={{3,5,7,9},{4,2},{5,7,8,6},{6}};
		int a1[][]=new int[][]{{3,5,7,9},{4,2},{5,7,8,6},{6}};
		
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
		
		

	}

}
