package arrays;

import java.util.Arrays;

public class RunningSumArray {

    public static int[] runningSum(int[] nums) {

        if (nums == null || nums.length <= 1) return nums;

        int[] output = new int[nums.length];
        output[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            output[i] = nums[i] + output[i - 1];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nullNums = {};
        int[] oneNum = {1};
        System.out.println(Arrays.toString(runningSum(nums)));
        System.out.println(Arrays.toString(runningSum(nullNums)));
        System.out.println(Arrays.toString(runningSum(oneNum)));
    }
}
