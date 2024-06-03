import java.io.*;
public class RightPascalTriangle
{
  public static void main(String[] args)
  {
    int num= 6; 
    for (int i= 0; i<= num-1; i++)
    {
      for (int j=0; j<=i; j++)
      {
        System.out.print("*"+ " ");
      }
      System.out.println();
    }
    for (int i=num-1; i>=0; i--)
    {
    
      for(int j=0; j <= i-1;j++)
      {
        System.out.print("*"+ " ");
      }
      
      System.out.println();
    }
  }
}