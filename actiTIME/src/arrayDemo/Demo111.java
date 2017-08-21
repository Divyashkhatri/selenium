package arrayDemo;


public class Demo111 {

	public static void main(String[] args) {
		int a[][]=new int[4][2];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			System.out.print(" "+a[i][j]);
//if we print System.out.println(a[i]); then it will print address 
			//a[i] is representing an array
			System.out.println();
		}
		
		
	}

}
