import java.io.IOException;

public class StringBufferDemo {

	public static void main(String[] args){
		StringBuffer sb1=new StringBuffer();
		//sb1="Hello";
		sb1.append("Hello");
		System.out.println(sb1);
		StringBuffer sb2=new StringBuffer("Banglore");
		System.out.println(sb2);
		System.out.println(sb1+" "+sb2);
		System.out.println(sb1.reverse());
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		
		StringBuffer sb3=sb2.reverse();
		System.out.println(sb3);
		System.out.println(sb2==sb3);//true
		sb1.setLength(66);////deletes alphabet from end if we pass value less than length
		System.out.println("---->"+sb1);
		sb1.delete(0,2);//deletes alphabet between given position
		System.out.println("->"+sb1);
		sb1.deleteCharAt(0);
		System.out.println("--->"+sb1);
	
		StringBuffer sb4= new StringBuffer();
		System.out.println(sb4.length());
		System.out.println("----------------------");
		sb4.append("JavaDeveloper");
		System.out.println(sb4.insert(sb4.length(),"haha"));
		System.out.println(sb4.insert(4,"haha"));
		System.out.println(sb4.insert(1,"haha"));	
		System.out.println(sb4+"\0\0\0"+sb4);//space -->   \0
		System.out.println("----------------------");
		
		StringBuilder sb5=new StringBuilder("Selenium");
		StringBuilder sb51=new StringBuilder("Selenium");
		System.out.println(sb5.equals(sb51));//equals method is not overridden
		
		StringBuilder sbb;
		System.out.println(sbb=sb5.insert(4, "Haha"));
		System.out.println(sb5.delete(4, 8));
		
		System.out.println(sb5);
		System.out.println(sb5==sbb);//sbb and sb5 are refering to same object
		
		/*
		 * String str=sbb;	
		 * not possible Stingbuilder object cannot be assigned to string 
		 * because there is no IS A relationship in both of String and StingBuilder
		 * 
		 * */
		
		//Assigning String to StringBuffer
		StringBuffer sb6=new StringBuffer("Hello");
		//converting StringBuffer to String
		String str1=sb6.toString();
		
		
	}
}
