//what is the difference between primitive and wrapper classes

public class CompaisionPrimitiveAndWrapperClass {
	public static void main(String[] args) {			
/*		System.out.println(new Integer(5) == new Integer(5));
        System.out.println(new Integer(500) == new Integer(500));
-->3 System.out.println(Integer.valueOf(5) == Integer.valueOf(5));
-->4 System.out.println(Integer.valueOf(500) == Integer.valueOf(500));
/*
 * Why does (3) return true and (4) return false?
 * Because they are two different objects. The 256 integers closest to 
 * zero [-128; 127] are cached by the JVM, so they return the same object 
 * for those. Beyond that range, though, they aren't cached, so a new 
 * object is created. To make things more complicated, the JLS demands 
 * that at least 256 flyweights be cached. JVM implementers may add more 
 * if they desire, meaning this could run on a system where the nearest 
 * 1024 are cached and all of them return true... #awkward
*/
		
		

/*
	// NullPointerException at runtime
	Integer in=null;
	int i=in;
*/		


/*
		 * //fully object oriented and it takes more time
			Long sum = 0L; // uses Long, not long 
		   System.out.println("started");
		    for(Long i = (long) 0; i <= Integer.MAX_VALUE; i++) {
		        sum += i;
		    }
		    System.out.println(sum);
		    System.out.println("ended");
		    
		    System.out.println("started");
		    // fully primitive types and it takes less time
		    long sum1=0l;
		    for(long i = 0l; i <= Integer.MAX_VALUE; i++) {
		        sum += i;
		    }
		    System.out.println(sum);
*/		}
}
