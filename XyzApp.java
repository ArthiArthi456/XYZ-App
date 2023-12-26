import java.util.*;
class xyz 
{
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) 
	{
		boolean repeat1=true;
		do
		{
			System.out.println("\t\t\tWelcoem to xyz App");
			System.out.println("\t\t\tSelect the Input");
			System.out.println("1.ABC\n2.DEF\n3.Exit");
			System.out.println("Enter your Choice");
			int input1=sc.nextInt();
			switch(input1)
			{
				case 1:{
				boolean repeat2=true;
				do
				{
					System.out.println("\t\t\tWelcoem to xyz App");
					System.out.println("\t\t\tSelect the Input");
					System.out.println("1.abc\n2.def\n3.Exit");
					System.out.println("Enter your Choice");
					int input2=sc.nextInt();
					switch(input2)
					{
							case 1:{
								System.out.println("JAVA");
								break;}
							case 2:{
								System.out.println("Sql");
								break;}
							case 3:{
								repeat2=false;
								break;}
					}
				}
				while (repeat2);
				break;}
				case 2:{
					boolean repeat3=true;
					do
					{
						System.out.println("\t\t\tWelcoem to xyz App");
						System.out.println("\t\t\tSelect the Input");
						System.out.println("1.abc\n2.def\n3.Exit");
						System.out.println("Enter your Choice");
						int input3=sc.nextInt();
						switch(input3)
						{
						case 1:{
								System.out.println("HTML");
								break;}
							case 2:{
								System.out.println("CSS");
								break;}
							case 3:{
								repeat3=false;
								break;}	
						}
					}
					while (repeat3);
					break;}
				case 3:{
					repeat1=false;
					break;}
		}
		}
		while (repeat1);
	}
}

