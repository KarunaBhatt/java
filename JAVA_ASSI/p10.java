import java.util.*;

class RecArr
{
	public static void main(String c[])
	{
		Scanner r = new Scanner(System.in);
		System.out.print("Enter size of Row :- ");
		int a = r.nextInt();
		System.out.println();
		System.out.print("Enter size of Column :- ");
		int b = r.nextInt();

		int arr[][] = new int[a][b];

		
		for(int i=0 ; i<arr.length;i++)
		{

			for(int j = 0; j<arr[i].length;j++)
			{
				System.out.print("Enter element :- ");
				arr[i][j] = r.nextInt();
			}
		}
		System.out.println("The array is ");
		for(int i =0 ; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
				System.out.print(" | " + arr[i][j]);
			}
			System.out.println();
		}
	}
}