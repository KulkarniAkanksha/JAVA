import java.io.*;
public class LeftPascalTriangle
{
  public static void main(String[] args)
  {
    int num= 6; 

  
    for (int i= 1; i<=num; i++)
    {
     
      for (int j=i; j<num; j++)
      {
        System.out.print(" ");
      }
      for (int k=1; k<=i;k++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i=num; i>=1; i--)
    {
      
      for(int j=i; j <=num;j++)
      {
        System.out.print(" ");
      }
      
      for(int k=1; k<i ;k++)
      {
        System.out.print("*");
      }
    
      System.out.println();
    }
  }
}