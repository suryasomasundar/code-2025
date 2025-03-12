package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
Given two integer arrays nums1 and nums2,
return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.
 */

public class IntersectionArray {

    public static int[] findIntersection(int[] nums1, int[] nums2) {

        if (nums1 == null || nums2 == null || nums1.length < 1 || nums2.length < 1) return new int[0];

        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num);
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
        System.out.println(Arrays.toString(findIntersection(nums1, nums2))); // Expected Output: [2]

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(findIntersection(nums3, nums4))); // Expected Output: [4, 9]
    }
}
