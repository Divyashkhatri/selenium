
public class CountSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=
"I LOVE JAVA and I LOLOVELOLOVEVE SELENIUM AND I LOVE LOVEVE   FORSD I LOVELOVE";
		StringBuffer str=new StringBuffer(s);
		int index=0,counter=0;
		while(str.indexOf("LOVE",index)!=-1)
		{
			index=str.indexOf("LOVE",index)+4;
			counter++;
		}		
		System.out.println(counter);
	
	}

}
