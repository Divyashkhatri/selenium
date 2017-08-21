package enumDemo;

public class EnumDemo3 {
	public static void main(String[] args) {
	
		Payment pmt;
		pmt=Payment.CHEQUE;
		System.out.println("value of pmt is "+pmt);
		System.out.println(pmt.compareTo(Payment.CASH));
		
		switch(pmt)
		{
			case CASH: System.out.println("You psaid by cash");
			break;
			case CARD : System.out.println("You Paid By card");
			break;
			case CHEQUE : System.out.println("You paid by cheque");
			break;
		}
		


	}

}
