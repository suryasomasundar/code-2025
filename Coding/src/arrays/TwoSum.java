package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSumClassic(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[i];
                if (nums[j] == complement) {
                    return new int[]{nums[i], nums[j], i, j};
                }
            }
        }
        throw new IllegalArgumentException("No Match Found");
    }

    public static int[] twoSumHashMap(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i, complement, nums[i]};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7, 0};
        int[] nums2 = {2, 9, 3, 4, 6, 1};
        int target = 12;
        int[] output = twoSumClassic(nums1, target);
        System.out.println("Returning Numbers and their Index --> " + Arrays.toString(output));
        int[] output2 = twoSumHashMap(nums2, target);
        System.out.println("Returning Index and the Matching Numbers --> " + Arrays.toString(output2));

    }
}
