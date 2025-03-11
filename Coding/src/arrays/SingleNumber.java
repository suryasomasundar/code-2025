package arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int returnSingleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};
        System.out.println(returnSingleNumber(nums));
        System.out.println(returnSingleNumber(nums2));
        System.out.println(returnSingleNumber(nums3));

    }
}
