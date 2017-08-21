
public class PrintlnMethod {

	public static void main(String[] args) {
//		System.out.println("null");
//		String s1=null+"";
//		String s2=null+"";
//		System.out.println(s2.equals(s1));
//		s1=null;s2=null;
//		System.out.println(s1==s2);
//		System.out.println('A'+'A');//addition
//		
//		System.out.println('A'+"A");
//		System.out.println("A"+100);
//		System.out.println('A'+100);
//		
//		//System.out.println(i);//error: variable i might not have been initialized
//		//System.out.println(null);// error:reference to println is ambiguous
//		System.out.println(true);
//		System.out.println(false);
//		System.out.println(100);

		test(0,10);
	}

	static void test(int initialValue,int finalValue)
	{
		if(initialValue >finalValue)
		{
			System.out.print(initialValue+" ");
			if(initialValue==finalValue)
				return;
			initialValue--;
			test(initialValue,finalValue);
			
		}
		else
		{
			System.out.print(initialValue+" ");
			if(initialValue==finalValue)
				return;
			initialValue++;
			test(initialValue,finalValue);

		}
		
	}
}
