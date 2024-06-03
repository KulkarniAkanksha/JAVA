import java.util.*;

class diamond
{
	static void Diamondprint(int n)
	{
		int sp = n - 1;
	
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < sp; j++)
				System.out.print(" ");
	
			for (int j = 0; j <= i; j++)
				System.out.print("* ");
	
			System.out.print("\n");
			sp--;
		}
	
		sp = 0;
	
		for (int i = n; i > 0; i--)
		{
			for (int j = 0; j < sp; j++)
				System.out.print(" ");

			for (int j = 0; j < i; j++)
				System.out.print("* ");
	
			System.out.print("\n");
			sp++;
		}
	}

	public static void main(String[] args)
	{
	  int num=5; 
	  Diamondprint(num);
	}
}