public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x=10,y=20;
	//    1. --->
		System.out.println(x+" "+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x+" "+y);


//		2. --->
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+" "+y);

		
//		3. --->
		int temp=x;
		x=y;
		y=temp;
		System.out.println(x+" "+y);

		
		
	}

}
