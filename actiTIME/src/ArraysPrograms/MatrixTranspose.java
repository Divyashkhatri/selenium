package ArraysPrograms;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of rows-->");
		int row=sc.nextInt();
		System.out.println("Enter Number of columns-->");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
				sc.nextLine();
			}
		}
	
	int temp=0;
		
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					
					System.out.print(a[j][i]);
				}
				System.out.println();
			}
	}
}
