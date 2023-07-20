class Matrix
{
	public static void main(String a[])
	{
		int m = 1;
		int arr[][] = new int[3][3];
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = m;
				m++;
				System.out.print(arr[i][j] +" | ");
			}
			System.out.println();
		}
	}
}