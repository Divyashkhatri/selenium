
class OldMethodOverloading
{
	static void disp(int i)
	{
		System.out.println("static method OldMethodOverloading "+i);
	}
	void disp(String name)
	{
		System.out.println("OldMethodOverloading");
	}

	
}

public class MethodOverloading extends OldMethodOverloading
{	
	static void disp(int i)
	{
		System.out.println("static method MethodOverloading "+i);
	}
	void disp(String name)
	{
		System.out.println("MethodOverloading");
	}
	public static void main(String[] args) {
		OldMethodOverloading a1=new MethodOverloading();
		a1.disp(100);
		a1.disp("");
	}

}
