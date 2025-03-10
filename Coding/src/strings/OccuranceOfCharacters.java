package strings;

import java.util.HashMap;

public class OccuranceOfCharacters {

    public static void charOccur(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("The String is Empty");
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
    }

    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = "aabbccdd";
        String str3 = "";
        String str4 = "a";
        String str5 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbc";
        charOccur(str1);
        charOccur(str2);
        charOccur(str3);
        charOccur(str4);
        charOccur(str5);


    }
}
