package Harshasirprograms;

interface Fruit1
{
	void getAroma();
}
abstract class Fruit
{
	abstract void getAroma();
}
public class AnonymousinnerclassDemo 
{
	public static void main(String[] args) 
	{
		Fruit f=new Fruit(){
			
			void getAroma()
			{
				System.out.println("Fruit Aroma");
			}
		};
		f.getAroma();
		
		
		Fruit1 f1=new Fruit1()
		{
			public void getAroma()
			{
				System.out.println("Fruit 1 Aroma");
			}
		};
		f1.getAroma();
		
		new Fruit1(){
			public void getAroma()
			{
				System.out.println("hiya huya");
			}
		}.getAroma();
		
	}

}
