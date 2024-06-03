import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string to convert to an integer: ");
        String str = scanner.nextLine();

        try {
          
            int intValue = Integer.parseInt(str);
            System.out.println("Converted integer value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("The input string is not a valid integer.");
           
        }

        scanner.close();
    }
}
