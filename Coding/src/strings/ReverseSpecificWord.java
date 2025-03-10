package strings;

public class ReverseSpecificWord {

    public static String reverseSpecificWord(String str, String targetWord) {

        if (str == null || str.isEmpty()) return str;
        if (targetWord == null || targetWord.isEmpty())
            throw new IllegalArgumentException("Target Word is Empty");

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(targetWord)) {
                words[i] = reverseHelper(words[i]);
            }
        }

        for (String word : words) {
            result.append(word);
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static String reverseHelper(String str) {

        char[] strArray = str.toCharArray();

        int i = 0;
        int j = strArray.length - 1;

        while (i < j) {
            char temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;
            i++;
            j--;
        }
        return new String(strArray);
    }

    public static void main(String[] args) {
        String word = "THIS IS LOOK A TEST LOOK";
        String targetWord = "LOOK";
        String targetWord2 = "";
        String word2 = "";
        System.out.println(reverseSpecificWord(word, targetWord));
        System.out.println(reverseSpecificWord(word2, targetWord));
        System.out.println(reverseSpecificWord(word, targetWord2));

    }
}
