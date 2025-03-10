package strings;

public class ReverseEachCharInSentence {

    public static String reverseEachChar(String str) {

        if (str == null || str.isEmpty()) throw new IllegalArgumentException("String is Empty");

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String reversedString = reverseHelper(words[i]);
            words[i] = reversedString;
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
        String str = "Hello World";
        String strNull = "";
        System.out.println(reverseEachChar(str));
        System.out.println(reverseEachChar(strNull));
    }
}
