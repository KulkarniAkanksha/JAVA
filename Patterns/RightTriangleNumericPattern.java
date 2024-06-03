import java.util.Scanner;
 
public class RightTriangleNumericPattern {
    public static void main(String[] arg) {
        int rows, i, j;
        rows = 6;
         
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}