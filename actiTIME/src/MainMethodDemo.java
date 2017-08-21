
class SuperMainDemo
{
	public static void main(String... args) 
	{
		System.out.println("SuperMainDemo");
	}
}

public class MainMethodDemo extends SuperMainDemo
{
	public static void main(String[] args) 
	{
		SuperMainDemo.main("hello");
		System.out.println("MainMethodDemo");
	}

}
