class Orange{
}
public class PerfactNumber {
	//write a program to print perfact number form 1 to 1000
	//perfact number is number whose sum of factors 
	public static void main(String[] args) 
	{
		for(int j=0;j<=1000;j++)
		{
			int no=j,sum=0;
			for(int i=1;i<=no/2;i++)
			{
				if(no%i==0)
					sum=sum+i;
			}
			if(sum==no)
				System.out.println(no+" is perfact num");
			//			else
			//				System.out.println(no+" is not perfact number");
		}
		//		Orange oo1[]=new Orange[79999999+5999999];//this is max size of array
		//		int a[]=new int[79999999+5999999];
		//		boolean b[]=new boolean[299999999];
		//		char ch[]=new char[1_99_99_999];
		//		long lng[]=new long`[3_99_99_999];

	}
}
