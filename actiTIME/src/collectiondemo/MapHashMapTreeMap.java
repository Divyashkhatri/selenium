package collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class MapHashMapTreeMap {
	public static void main(String[] args) {
	//find occurance of each character in the string
		String str="passses";//"Hello India \n \"\"   \\ \\ // @ #$%^&*()!|}?><:\"";
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<str.length();i++)
		{
			String v=str.substring(i,i+1);
			if(map.containsKey(v)){
				Integer count	= map.get(v)+1;
				map.put(v,count);
			}
			else
			{
				map.put(v, 1);
			}
		}

	
		LinkedList lst=new LinkedList();
		lst.add("d0ng");	
		lst.offer("ding");
		lst.offerFirst("offerFirst");
		lst.offerLast("offerLast");
		lst.add("din");
		System.out.println(lst);
		
	
		
		
		for(String s:map.keySet())
		{
			Integer count =	map.get(s);
//			duplicate character
//			if(count>1)
//			System.out.println(s);
		
//			non duplicate character
			if(count==1)
			System.out.println(s);
			
		}
		
		
			
	
		
		
	}
}
