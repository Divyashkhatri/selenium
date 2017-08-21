public class tryCatchDemo122 {
	public static void main(String[] args) {
		tryCatchDemo122 r=new tryCatchDemo122();
		r.test1();
	}	
	void test1(){
		test2();
	}
	void test2()
	{
		test3();
	}
	void test3()
	{
		test4();
	}
	void test4()
	{
		int i=10/0;//stack unwinding and quit
	}
}