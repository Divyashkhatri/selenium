package whatiswrongPractice;

import java.util.HashMap;
import java.util.Map;
 
public class WhatIsWrong_1 {
/*	1) map.put(new Integer(1), “Hello World”); // auto boxed
	2) map.get(new Byt(1)); // null
	Integer(1) != Byte(1).*/

	static Map<Integer,String> map = new HashMap<Integer, String>();
    public static void main(String args[]) {
        byte b = 1;
        map.put(1, "Hello World");
        String s = map.get(b);
        System.out.println("The result is: " + s);
    }
}