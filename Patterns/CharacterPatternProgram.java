public class CharacterPatternProgram
{
    public static void main(String[] args)
    {
    int size = 6; 
    int ch = 65; 

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < size - i; j++) {
        System.out.print((char)(ch+j));
      }
      System.out.println();
    
		}
    }
}