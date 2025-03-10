package strings;

public class ReverseSentence {

    public static String reverseSentence(String str) {

        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String is Empty");
        }

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String word = "Hello World";
        String word2 = "This is a sentence";
        String word3 = "";
        System.out.println(reverseSentence(word));
        System.out.println(reverseSentence(word2));
        System.out.println(reverseSentence(word3));
    }
}
