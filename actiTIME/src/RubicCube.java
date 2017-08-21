import java.util.Scanner;

public class RubicCube {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch='l';
		switch(ch)
		{
			case 'l':System.out.println("l");
			break;
			
			default:System.out.println("Enter valid Action");
			break;
		};
		
		
		
		

		
	}

	
	static char top[][]={ 
			{'T','T','T'},
			{'T','T','T'},
			{'T','T','T'}				
	};
	static 	char bottom[][]={ 
			{'b','b','b'},
			{'b','b','b'},
			{'b','b','b'}				
	};
	static char front[][]={ 
			{'F','F','F'},
			{'F','F','F'},
			{'F','F','F'}				
	};
	static 	char back[][]={ 
			{'B','B','B'},
			{'B','B','B'},
			{'B','B','B'}				
	};
	static char left[][]={ 
			{'L','L','L'},
			{'L','L','L'},
			{'L','L','L'}				
	};
	static char right[][]={ 
			{'R','R','R'},
			{'R','R','R'},
			{'R','R','R'}				
	};
	
	
	static void rightClockWise()
	{
		
	}
	static void rightAntiClockWise()
	{
		
	}	
	static void leftClockWise()
	{
		
	}	
	static void leftAntiClockWise()
	{
		
	}
	static void middleVericalClockWise()
	{
		
	}
	static void middleVerticalAntiClockWise()
	{
		
	}
	static void topClockWise()
	{
		
	}
	static void topAntiClockWise()
	{
		
	}
	static void bottomClockWise()
	{
		
	}	
	static void bottomAntiClockWise()
	{
		
	}	
	static void middlehorizontalClockWise()
	{
		
	}
	static void middlehorizontalAntiClockWise()
	{
		
	}
	static void display()
	{
		
		
		for(int i=0;i<3;i++)
		{
			System.out.print(" ");
			for(int j=0;j<3;j++)
			{
				System.out.print("  ");
			}
			
		
			for(int j=0;j<3;j++)
			{
				System.out.print(back[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(left[i][j]+" ");
			}
			System.out.print(" ");
			for(int j=0;j<3;j++)
			{
				System.out.print(top[i][j]+" ");
			}
			System.out.print(" ");
			for(int j=0;j<3;j++)
			{
				System.out.print(right[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<3;i++)
		{
			System.out.print(" ");
			for(int j=0;j<3;j++)
			{
				System.out.print("  ");
			}
			
		
			for(int j=0;j<3;j++)
			{
				System.out.print(bottom[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
}
