package Harshasirprograms;
	interface Car
	{
		Car speed();
		Car turnLeft();
		Car turnRight();
	}

public class AnonymousinnerclassDemo_1 {

	public static void main(String[] args) {	
		new Car(){

			@Override
			public Car speed() {
					System.out.println("speedBoost");
				return this;
			}

			@Override
			public Car turnLeft() {
				System.out.println("turnleft");
				return this;
			}

			@Override
			public Car turnRight() {
				System.out.println("turnRight");
				return this;
			}
			
		}.speed().turnLeft().turnRight();
		
	}

}
