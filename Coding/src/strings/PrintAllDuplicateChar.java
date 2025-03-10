package strings;

import java.util.HashMap;
import java.util.Map;

public class PrintAllDuplicateChar {

    public static void printDuplicates(String str) {

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
        String str = "aabbccd";
        printDuplicates(str);
    }
}
