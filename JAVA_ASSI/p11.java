import java.util.*;

class JagArr
{
	public static void main(String c[])
	{
		Scanner r = new Scanner(System.in);
		System.out.print("Enter size of Row :- ");
		int a = r.nextInt();
		System.out.println();
		System.out.print("Enter size of Column :- ");

		int arr[][] = new int[a][];

		for (int i=0;i<a ;i++ )
		{
			System.out.println("Enter size of column  " + (i+1)+ " row ");	
			arr[i] = new int [r.nextInt()];
		}

		for(int i =0 ; i<arr.length;i++)
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