package ArraysPrograms;


public class ArrayComparision {

	public static void main(String[] args) {
	   int a[]={1,2,3,4,5,6,7,8,9,0};
	   int b[]={1,2,3,4,5,6,7,8,9,0};
	   byte flag=0;
	   if(a.length==b.length)
	   {
		   for(int i=0;i<a.length;i++)
		   {
			   if(a[i]!=b[i])
			   {
				   flag=1;
				   System.out.println("Arrays are not equal");
				   break;
			   }
		   }
	   }
	   else
	   {	flag=1;
		   System.out.println("Array are not equal");
	   }
	   if(flag==0)
		   System.out.println("Array are equal");
	}

}
