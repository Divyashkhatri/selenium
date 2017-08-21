package RegularExpression;
/*'.'
 * '+'
 * '?'
 * '[]'
 * '*'
 * '{0,1}'
 * 
 * ''
 * */
public class RegExDemo1 
{
	public static void main(String[] args) 
	{
		String s1= "08:22:44 AM";
		System.out.println(s1.matches("(0[1-9]|1[0-2]):([0-5][0-9]):([0-5][0-9]) ([AP]M)"));
		
//		Derive the Regular Expression for gmail.com
		s1= "feiruh@gmailacom";
		System.out.println(s1.matches("[A-Za-z0-9][A-Za-z0-9]*@gmail.com"));//Incorrect
		s1= "dgfrdiufihughfigdfduh@gmail.com";
		System.out.println(s1.matches("[A-Za-z0-9][A-Za-z0-9]*@gmail\\.com"));//correct
		System.out.println(s1.matches("[A-Za-z0-9]+@gmail\\.com"));//correct

		
		s1= "@gmail.com";
		System.out.println(s1.matches("[A-Za-z0-9]*@gmail.com"));//Incorrect here dot represents one character
//		s1= "fhughfigdduh@gmail.com";
//		System.out.println(s1.matches("[a-z]{4,14}@gmail\\.com"));//correct
		
		
		//write regular  expression for id@gmail.com --> 
		//id can have letter and digit
		//id should start with letter 
		//id length can be 4-12
//		System.out.println(s1.matches("[a-zA-Z][A-Za-z0-9]{3,11}@gmail\\.com"));//correct

//		write regular expression for Inbox link of gmail
//		s1="Inbox";
//		System.out.println(s1.matches("Inbox|Inbox\\([1-9][0-9]*\\)"));
		
//		write a regular expression for ip address
		//correct
		s1="234:42:34:4";
		System.out.println(s1.matches("([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]):([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]):([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]):([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"));
		
			
			
	}
}
