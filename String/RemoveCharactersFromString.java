public class RemoveCharacters {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        String result = removeCharacters(str1, str2);

        System.out.println("Original String 1: " + str1);
        System.out.println("Original String 2: " + str2);
        System.out.println("After removing characters from String 1 which are present in String 2: " + result);
    }

    public static String removeCharacters(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) == -1) {
                
                result.append(ch);
            }
        }

        return result.toString();
    }
}
