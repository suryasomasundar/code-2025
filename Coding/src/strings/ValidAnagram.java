package strings;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean isValidAnagram(String s1, String s2) {

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);

    }

    public static boolean isValidAnagramTraditional(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        int[] counter = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            counter[s1.charAt(i) - 'a']++;
            counter[s2.charAt(i) - 'a']--;
        }

        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "ball";
        String str2 = "labl";
        System.out.println(isValidAnagram(str1, str2));
        System.out.println(isValidAnagramTraditional(str1, str2));
        System.out.println(isValidAnagramTraditional("abb", "abc"));
        System.out.println(isValidAnagramTraditional("ab", "abb"));


    }
}
