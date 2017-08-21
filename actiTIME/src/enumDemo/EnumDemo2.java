package enumDemo;
enum Payments{
	CASH(100){ public String test(){ System.out.println("hello india"); return "Cash paid";}},
	CHEQUE(110){String test(){return "cheque paid";}},
	CARD(200){String test(){return "Card paid";}};
	int minPayment;
	static
	{
		System.out.println("enum static block");
		
	}
		{
			System.out.println("enum IIB block");
		}
	Payments(int miniPayment)
	{
		System.out.println("enum constructor");
		this.minPayment=miniPayment;
	}
}
public class EnumDemo2 {
	static 
	{
		System.out.println("Static  block of class ");
	}
	// instance Initialization block
	{
		System.out.println("enum IIB block");
	}
	public static void main(String[] args) {

		System.out.println(Payments.CARD);



	}

}
