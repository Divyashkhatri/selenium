package selenium;
	interface Fruit1
	{
		void getAroma();
	}
	abstract class Fruit
	{
		abstract void getAroma();
	}
public class ImplicitWaitExplicitWaitDemo1 
{
	public static void main(String[] args) 
	{
		Fruit1 f1=new Fruit1(){
			public void getAroma(){
				System.out.println("Aroma");
			}};
			f1.getAroma();
			//		System.out.println(f1.getClass().getName());


			Fruit f=new Fruit(){
				void getAroma(){
					System.out.println("Fruit Aroma");
				}
			};
			f.getAroma();

			//creating object of interface and implmenting method of 
			(new Fruit()
			{
				void getAroma()
				{
					System.out.println("Aaaaa");
				}
			}).getAroma();
	}
}
