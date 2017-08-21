import java.io.Serializable;
import java.util.HashMap;
public class GetCanonicalName {
	public static void main(String[] args) 
	{
		System.out.println("//primitive");
		System.out.println(int.class.getName());
		System.out.println(int.class.getCanonicalName());
		System.out.println(int.class.getSimpleName());
		
		System.out.println();

		System.out.println("//class");
		System.out.println(String.class.getName());
		System.out.println(String.class.getCanonicalName());
		System.out.println(String.class.getSimpleName());

		System.out.println();

		System.out.println("//inner class");
		System.out.println(HashMap.SimpleEntry.class.getName());
		System.out.println(HashMap.SimpleEntry.class.getCanonicalName());
		System.out.println(HashMap.SimpleEntry.class.getSimpleName());        

		System.out.println();

		System.out.println("//anonymous inner class");
		System.out.println("1"+new Serializable(){}.getClass().getName());
		System.out.println("2"+new Serializable(){}.getClass().getCanonicalName());
		System.out.println("3"+new Serializable(){}.getClass().getSimpleName());
	}
}
