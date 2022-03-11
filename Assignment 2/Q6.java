import java.util.Scanner;
class Q6
{
	public static void main(String args [])
	{
			float n1, n2, ans; 
			int opt;
		do
		{
			Scanner obj = new Scanner(System.in);
			System.out.println("");
			System.out.println("Select Operation ");
			System.out.println("");
			System.out.println("1. Addition  2. Substraction	3. Multiplication  4. Division  5. Modulus  6. Percentage Increament  7. Square Finder  8. Cube Finder  9. Exit");
			opt = obj.nextInt();
			switch(opt)
			{
				case 1:
				{
					System.out.println("");
					System.out.println("	Addition Selected		");
					System.out.println("");
					System.out.print("Enter 1st Number = ");
					n1 = obj.nextFloat();
					System.out.println("");
					System.out.print("Enter 2nd Number = ");
					n2 = obj.nextFloat();
					ans = n1 + n2;
					System.out.println("");
					System.out.println("Addition of given numbers is "+ans);
				}
				break;
				
				case 2:
				{
					System.out.println("");
					System.out.println("	Substraction Selected		");
					System.out.println("");
					System.out.print("Enter 1st Number = ");
					n1 = obj.nextFloat();
					System.out.println("");
					System.out.print("Enter 2nd Number = ");
					n2 = obj.nextFloat();
					ans = n1 - n2;
					System.out.println("");
					System.out.println("Subsrtaction of given numbers is "+ans);
				}
				break;
				
				case 3:
				{
					System.out.println("");
					System.out.println("	Multiplication Selected		");
					System.out.println("");
					System.out.print("Enter 1st Number = ");
					n1 = obj.nextFloat();
					System.out.println("");
					System.out.print("ENter 2nd Number = ");
					n2 = obj.nextFloat();
					ans = n1 * n2;
					System.out.println("");
					System.out.println("Multiplication of given numbers is "+ans);
				}
				break;
				
				case 4:
				{
					System.out.println("");
					System.out.println("	Division Selected	");
					System.out.println("");
					System.out.print("Enter 1st Number = ");
					n1 = obj.nextFloat();
					System.out.println("");
					System.out.print("Enter 2nd Number = ");
					n2 = obj.nextFloat();
					ans = n1/n2;
					System.out.println("");
					System.out.println("Division of given numbers is "+ans);
				}
				break;
				
				case 5:
				{
					System.out.println("");
					System.out.println("	Modulus Selected	");
					System.out.println("");
					System.out.print("Enter 1st Number = ");
					n1 = obj.nextFloat();
					System.out.println("");
					System.out.print("Enter 2nd number = ");
					n2 = obj.nextFloat();
					ans = n1%n2;
					System.out.println("");
					System.out.println("Modulus of given numbers is "+ans);
				}
				break;
				
				case 6:
				{
					System.out.println("");
					System.out.println("	Percentage Increament Selected	");
					System.out.println("");
					System.out.print("Enter Number = ");
					n1 = obj.nextFloat();
					System.out.println("");
					System.out.print("Enter Percentage to increase = ");
					n2 = obj.nextFloat();
					float pr;
					ans = (n1/100)*n2;
					pr = n1+ans;
					System.out.println("");
					System.out.println("Increased Value is "+pr);
				}
				break;
				
				case 7:
				{
					System.out.println("");
					System.out.println("	Square Finder	");
					System.out.println("");
					System.out.println("Enter number to find Square of = ");
					System.out.println("");
					System.out.print("Enter Number = ");
					n1 = obj.nextFloat();
					ans = n1*n1;
					System.out.println("");
					System.out.println("Square is "+ans);
				}
				break;
				
				case 8:
				{
					System.out.println("");
					System.out.println("	Cube Finder		");
					System.out.println("");
					System.out.print("Enter Number = ");
					n1 = obj.nextFloat();
					ans = n1*n1*n1;
					System.out.println("");
					System.out.println("Cube is "+ans);
					System.out.println("");
				}
				
				default:
				{
					if(opt>9 || opt==0)
					{
						System.out.println("");
						System.out.println("		Wrong Option Entered		");
						System.out.println("Please Select Correct Option as shown below");
					}
					else
						if(opt==9)
						{
							System.out.println("");
							System.out.println("Thank you for using !!!");
							System.out.println("");
							System.out.println("Program Existed");
						}
				}
			}
		}while(opt != 9);
	}
}