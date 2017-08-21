package collectiondemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List lst=new ArrayList();
		lst.add("Hello");
		lst.add(10);
		lst.add(20.2);
		Iterator itr =   lst.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		List lst4=new ArrayList();
		lst4.add(10);
		lst4.add("Java");
		lst4.add(1,true);
		lst4.add("");
		System.out.println(lst4);
		Collections.sort(lst);
	}

}
