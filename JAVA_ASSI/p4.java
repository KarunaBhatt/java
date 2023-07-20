class convert 
{

	// This function is for converting Decimal to Binary
	public static void D_To_B(int b)
	{
		System.out.println();
		int rem[] = new int[32];
		int i=0;
		int sum = 0;
		if(b==0)
		{
			System.out.println("The answer is 0");
		}
		else if(b==1)
		{
			System.out.println("The answer is 1");
		}
		else
		{	
			while(b>0)
			{
				rem[i] = b % 2;
				b = b/2;
				i++;
			}
			int k=i;
			for(int j=k-1; j>=0; j--)
			{
				System.out.print(rem[j]);
			}
		}
	}

	// This function is used for converting Decimal to Octal 

	public static void DecToOct(int o)
	{
	int rem[] = new int[32];
		int i=0;
		int sum = 0;
		if(o<=7)
		{
			System.out.println("The answer is " + o);
		}
		else
		{	
			System.out.println();
			while(o>0)
			{
				rem[i] = o % 8;
				o = o/8;
				i++;
			}
			int k=i;
			for(int j=k-1;j>=0;j--)
			{
				System.out.print(rem[j]);
			}
		}
	}

	// This function is used for converting Decimal to HexaDecimal

	public static void DecToHex(int h)
	{
		int rem[] = new int[32];
		int i=0;
		int sum = 0;

		if(h<=9)
		{
			System.out.println("The answer is " + h);
		}
		else
		{	
			System.out.println();
			while(h>0)
			{
				rem[i] = h % 16;
				h = h/16;
				i++;
			}
			int k=i;
			for(int j=k-1; j>=0; j--)
			{
				switch(rem[j])
				{
				case 10:
					System.out.print("A");
					break;
				case 11:
					System.out.print("B");
					break;
				case 12:
					System.out.print("C");
					break;
				case 13:
					System.out.print("D");
					break;
				case 14:
					System.out.print("E");
					break;
				case 15:
					System.out.print("F");
					break;
				default :
					System.out.print(rem[j]);
					break;
				}
			}
		}
	}
	public static void main(String c[])
	{
		System.out.println("The conversion are given below :-");
		int n = Integer.parseInt(c[0]);
		
		D_To_B(n);
		DecToOct(n);
		DecToHex(n);
		
	}
}