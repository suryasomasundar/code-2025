package strings;

import java.util.HashMap;

public class OccuranceOfCharacters {

    public static void charOccur(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        charOccur(str);
    }
}
