package arrays;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

    public static int[] removeDuplicate(int[] nums) {

        if (nums == null || nums.length < 1) return new int[0];

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int[] nums2 = {};
        System.out.println(Arrays.toString(removeDuplicate(nums)));
        System.out.println(Arrays.toString(removeDuplicate(nums2)));
    }
}
