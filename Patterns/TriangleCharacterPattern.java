public class TriangleCharacterPattern {
  public static void main(String[] args) {
    int rows = 6; 
    int ch = 65; 

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < rows-i-1; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print((char)(ch+k));
      }
      System.out.println();
    }
  }
}