import java.io.IOException;
/*
 *finalize() method is protected method or object class that run before object is deleted 
 *by the garbage collector 
 * 
 *
 *
 *
 */
public class GCDemo {
	protected void finalizk9e() throws Throwable 
	{

			super.finalize();

			System.out.println("Your Nonsense code");
	}
	public static void main(String[] args) {
		Runtime rt=Runtime.getRuntime();
		
		System.out.println(rt.freeMemory());
		rt.gc();
		try {
		//	rt.exec("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			//rt.exec("");//java.lang.IllegalArgumentException
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(rt.freeMemory());
		//final finally finalize()         //throw throws Throwable
	//	new GCDemo().finalize();
		
		
		
	}

}
