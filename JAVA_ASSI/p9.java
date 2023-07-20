import java.util.*;

class SinArr
{
	public static void main(String c[])
	{
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the size of array :-");
		int f = r.nextInt();
		int arr[] = new int [f];

		for(int i=0; i<f; i++)
		{
			System.out.print("Enter element :-");
			arr[i] = r.nextInt();
		}

		System.out.println("The array is ");

		for(int i=0 ; i<f;i++)
		{
			System.out.print(" " + arr[i]);
		}
			 
	}
}