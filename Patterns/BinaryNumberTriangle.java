public class BinaryNumberTriangle
{
    public static void main(String[] args) 
    {
         
        int rows = 5; //Number of rows 
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
             
            System.out.println();
        }
         
    }
}