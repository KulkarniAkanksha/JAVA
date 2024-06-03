public class RightCharacterTriangle
{
    public static void main(String[] args)
    {
    int rows = 6; 
		int alphabet = 65;
		for (int i = 0 ; i < rows; i++ ) 
		{
			for (int j = 0 ; j <= i; j++ ) 	
			{
				System.out.print((char)(alphabet + j) + " ");
			}
			System.out.println();
		}
    }
}