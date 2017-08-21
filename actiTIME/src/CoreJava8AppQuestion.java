import java.util.function.*;

public class CoreJava8AppQuestion 
{
	int marks;

	public static void main(String[] args) {
		CoreJava8AppQuestion s1= new CoreJava8AppQuestion();
		s1.marks=100;
		check(s1,p -> p.marks<35);

	}

	private  static void check(CoreJava8AppQuestion ss, Predicate<CoreJava8AppQuestion> pred)
	{
		String result=pred.test(ss)? "match" :"unmatch";
		System.out.println(result);
	}

}
