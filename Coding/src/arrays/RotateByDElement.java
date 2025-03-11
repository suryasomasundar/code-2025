package arrays;

import java.util.Arrays;

public class RotateByDElement {

    public static int[] rotateArray(int[] nums, int k) {

        if (nums == null || nums.length <= 1 || k == 0) return nums;

        k = k % nums.length; // Handling Overflow if K > nums.length

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        return nums;

    }

    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(rotateArray(nums, k)));
    }
}
