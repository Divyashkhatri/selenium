
public class FinalKewordDemo {
//In array reference cannot be changed but we can change the value of data
	public static void main(String[] args) {
		final int[] i=new int[7];
		int[] ii=new int[7];
		ii=new int[7];
		for(int i1=0;i1<7;i1++)
		{
			i[i1]=i1;
			System.out.println(i[i1]);
			i[i1]=10;
			System.out.println(i[i1]);
		}

		for(int i1=0;i1<7;i1++)
		{
			i[i1]=i1;
			System.out.println(i[i1]);
			i[i1]=10;
			System.out.println(i[i1]);
		}


	}

}
