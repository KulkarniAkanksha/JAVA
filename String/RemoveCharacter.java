import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

       
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

       
        String modifiedString = removeCharacter(originalString, charToRemove);

       
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

    public static String removeCharacter(String str, char ch) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
