import java.util.Scanner;
class RowCol
{
	public static void main(String n[])
	{
		Scanner sc = new Scanner(System.in);
		// This is the program of Console screen Rows and Column
		System.out.println("This fucntion is shows Col and Row of Console screen");
		System.out.print("Enter Row : ");
		int r = sc.nextInt();
		System.out.print("Enter Column : ");
		int c = sc.nextInt();
		System.out.print("Enter String : ");
		String s = sc.next();
		
		for (int i=1; i<=r; i++)
		{
			System.out.println(" ");
		}
		for(int j=1; j<=c; j++)
			{

				System.out.print(" ");
			}	
		System.out.print(s);
	}
}