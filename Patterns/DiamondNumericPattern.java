public class DiamondNumericPattern
{
    public static void main(String[] args)
    {
      int row = 5; 
        for (int i = 1; i <= row; i++)
        {
            for (int j = row - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = row - 1; i >= 1; i--)
        {
            for (int j = row - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}