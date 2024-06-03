public class CharacterDiamondPatter
{
  public static void main(String[] args) {
    int rows = 6; 
    int ch = 65; 

    for (int i = 1; i <= rows; i++) {
      for (int j = rows; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 0; k < i * 2 - 1; k++) {
        System.out.print((char)(ch+k));
      }
      System.out.println();
    }

    for (int i = 1; i <= rows - 1; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (rows - i) * 2 - 1; k++) {
        System.out.print((char)(ch+k));
      }
      System.out.println();
    }
  }
}