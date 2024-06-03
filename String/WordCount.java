public class WordCount {
    public static void main(String[] args) {
        String str = "Hello, My name is Akanksha Kulkarni.";
        int wordCount = countWords(str);
        System.out.println("The number of words in the string is: " + wordCount);
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

       
        String[] words = str.trim().split("\\s+");

        
        return words.length;
    }
}
