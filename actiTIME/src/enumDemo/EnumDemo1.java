package enumDemo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
/*
 * Enum is a type which has a fixed set of values or constants. It is a special 
 * class type. 
 * An reference vaiable of an enumeration type can hold only the values 
 * that are defined by the list
 * 
 * java implements enumerations as class type
 * 
 * We don't instantiate an enum using new keyword, it acts much like a 
 * class, i.e. you can give constructors, add instance variable and 
 * methods and even implement interface 
 * */
interface Cards{}
enum CARD implements Cards  //enum can implement interface
{
	creditcard,debitcard,platinuimcard;
	//these are Objects 
}

//TimeUnit is example for enum
enum Payment{
	CASH(1000),CHEQUE(3000),CARD(2000);
	private int minpayment;
	static int mini=2222;
	static String test()
	{
		System.out.print("Payment test ");
		return "Successfull";
	}
	Payment(int minpayment){
		this.minpayment=minpayment;
	}
	int getMinpayment()
	{
		return minpayment;
	}
}


public class EnumDemo1 {
	public static void main(String[] args) {

	Payment pmt;
	pmt=Payment.CHEQUE;
	System.out.println("value of pmt is "+pmt);
	System.out.println(pmt.compareTo(Payment.CASH));
	
	System.out.println("Printing all values ");
	Payment pmts[]=Payment.values();
	for(Payment p:pmts)
	{
		System.out.print(p+" ");
		System.out.println(p.getMinpayment()+" ");
		
	}
	System.out.println(Payment.CARD.getMinpayment());
	System.out.println(Payment.CASH.getMinpayment());
	System.out.println(Payment.CHEQUE.getMinpayment());
	System.out.println(Payment.CHEQUE.test());
	System.out.println(Payment.test());
	
	System.out.println(Payment.class.getName());
	System.out.println(Payment.mini);
	System.out.println(Payment.valueOf("CARD"));
	
	
	}

}
