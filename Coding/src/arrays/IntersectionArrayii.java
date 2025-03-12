package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionArrayii {

    /*
    Given two integer arrays nums1 and nums2,
    return an array of their intersection.
    Each element in the result must appear as many times as it shows in both arrays
    and you may return the result in any order.
     */

    public static int[] findIntersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.getOrDefault(num, 0) - 1);
            }
        }

        int[] output = new int[result.size()];
        for (int i = 0; i < output.length; i++) {
            output[i] = result.get(i);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(findIntersection(nums1, nums2)));

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(findIntersection(nums3, nums4)));
    }
}
