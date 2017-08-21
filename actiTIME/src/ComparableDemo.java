import java.util.Arrays;

/**
 * 
 */

/**
 * @author rex
 *In comparable interface compareTo method is available so if we want to  
 *compare our class should also be comparable so we should implement 
 *compareTo method of comparable interface. and where ever we call
 *Arrays.sort(array); then it will call sort method. sort method will 
 *call compareTo method internally to check condition of bigger and 
 *smaller 
 *
 *
 */
class Mango implements Comparable<Mango>
{
	int wt;
	Mango(int wt)
	{
		this.wt=wt;
	}
	 public String toString(){
		 return "wt="+wt;
	 }
	@Override
	public int compareTo(Mango o) 
	{		
		System.out.print(o.wt+" ");
		System.out.println(this.wt);
		return o.wt-this.wt;
	}
	
}
public class ComparableDemo 
{

	public static void main(String[] args) 
	{
		Mango m1=new Mango(30);
		Mango man[]=new Mango[]{new Mango(100),m1,new Mango(78)};
		System.out.println(Arrays.toString(man));
		Arrays.sort(man);
		System.out.println(Arrays.toString(man));
		
	}
}
