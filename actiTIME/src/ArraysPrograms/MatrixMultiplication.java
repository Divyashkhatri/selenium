package ArraysPrograms;

public class MatrixMultiplication {

	public static void main(String[] args) {
		//Write a program to multiply matrix
		int row1=3,col1=3,row2=3,col2=3;
		
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int[row1][col2],temp=0;
		if(col1==row2)
		{
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col2;j++)
				{
					for(int k=0;k<col1;k++)
					{
						temp=temp+a[i][k]*b[k][j];
					}

					c[i][j]=temp;
					temp=0;	
				}
			}
			
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col2;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("For Matrix Multiplication column of first matrix should be equal to row of second matrix");
		
	

	}

}
