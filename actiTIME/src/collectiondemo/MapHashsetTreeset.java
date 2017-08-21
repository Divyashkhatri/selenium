package collectiondemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class MapHashsetTreeset {

	public static void main(String[] args) {

		HashMap hm=new HashMap<>();
		hm.put("ind","India");
		hm.put("hm","NewZealand");
		hm.put("uk","UnitedsKingdom");
		hm.put("uk","India");
		hm.put(null,"China");

		//print the size
		System.out.println(hm.size());
		//print all keys
		System.out.println(hm);
		
		if(hm.containsKey("ind"))
		{
			System.out.println(hm.get("ind"));
		}
		System.out.println(hm.containsValue("japan"));
		//print all keys
		System.out.println(hm.keySet());//keys return set interface 
		//print all the values
		System.out.println(hm.values());// values return collection interface
		
		String s="";
		//1st way
		Set keys=hm.keySet();
		Iterator itrkeys=keys.iterator();
		while(itrkeys.hasNext())
		{
			System.out.println(s=(String)itrkeys.next());
			
		}
		
		
		System.out.println("----------------");
		// alternate way
		System.out.println("<--printing value and keys-->");
		for(Object o:keys)
		{
			System.out.println(o);
			System.out.println("Value= "+hm.get(o));
		}
		for(Object o:hm.keySet())
		{//we can use hm.keyset() instead 
			System.out.println(o);
			System.out.println("Value= "+hm.get(o));
		}
		Collection values = hm.values();
		Iterator itr2=values.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	
	
		
		
	}

}
