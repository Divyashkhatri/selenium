package Harshasirprograms;

import org.openqa.selenium.By;

abstract class AAA
{
		static class BBB extends AAA
		{
			public void print()
			{
				System.out.println(By.xpath("").getClass());
			}			
		}
		
	static AAA getAAA()
	{
		System.out.println(By.xpath("").getClass());
		return new AAA.BBB();
	}
	abstract void  print();		
}



public class ByClassXpathConcept {

}
