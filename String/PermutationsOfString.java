public class PermutationsOfString {
    public static void main(String[] args) {
        String str = "ABC";
        generatePermutations(str, "");
    }

    public static void generatePermutations(String str, String prefix) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                
              String remaining = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(remaining, prefix + str.charAt(i));
            }
        }
    }
}
