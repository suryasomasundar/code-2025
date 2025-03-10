package strings;

import java.util.HashMap;
import java.util.Map;

public class PrintAllDuplicateChar {

    public static void printDuplicates(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("The String is Empty");
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Count for the Character --> " + entry.getKey() + " is -->  " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = "aabbccdd";
        String str3 = "";
        String str4 = "a";
        String str5 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbc";
        printDuplicates(str1);
        printDuplicates(str2);
        printDuplicates(str3);
        printDuplicates(str4);
        printDuplicates(str5);
    }
}
