package whatiswrongPractice;

public class WhatIsWrong {
/*	java.lang.NullPointerException due to autounboxing. The two expressions around “:” 
	must return the same type. This means Java 	tries to convert the expression d2 
			to primitive “double” value. This means the call “doubleValue()” on d2, which is 
			null will throw a “java.lang.NullPointerException”*/
	public static void main(String[] args) {
		boolean b=false;
		Double d1=0.45d;
		Double d2=null;
		Double result = b ?  d2 : d1.doubleValue();
		System.out.println(result);
	}
}
