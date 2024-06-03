import java.io.*;
public class simpleNumberProgram
{
	public static void triangle(int n)
	{
		int i, j;
		
		for(i=0; i<n; i++)
		{
			for(j=0; j<=i; j++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
}
	
	public static void main(String args[])
	{
    int n = 5;  
	right_triangle(n);
	}
}