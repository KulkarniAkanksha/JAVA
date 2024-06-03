import java.io.*;
public class sandglass
{
  public static void main(String[] args)
  {
  
    int num = 5; 

    for (int i= 0; i<= num-1 ; i++)
    {
      
      for (int j=0; j<i; j++)
      {
        System.out.print(" ");
      }
      for (int k=i; k<=num-1; k++)
      {
        System.out.print("*" + " ");
      }
     
      System.out.println();
    }
    for (int i= num-1; i>= 0; i--)
    {
  
      for (int j=0; j<i; j++)
      {
        System.out.print(" ");
      }
  
      for (int k=i; k<=num-1; k++)
      {
        System.out.print("*" + " ");
      }

      System.out.println();
    }
  }
}  