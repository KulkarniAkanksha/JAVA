import java.io.*;

public class RightDownTriangle
{
  public static void main(String args[])
  {
    
    int num=6; 
    for (int i=num; i>=1; i--)
    {
      for (int j=num; j>i;j--)
      {
        System.out.print(" ");
      }
      for (int k=1;k<=i;k++)
      {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}