package arrays;

public class MaxSubArrayProduct {

    public static int maxSubArray(int[] nums) {

        if (nums == null || nums.length < 1) return 0;

        int[] table = new int[nums.length];
        int max = nums[0];
        table[0] = max;

        for (int i = 1; i < nums.length; i++) {
            table[i] = Math.max(nums[i], nums[i] * table[i - 1]);
            max = Math.max(max, table[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int[] nums2 = {-2, 0, -1};
        int[] nums3 = {1};
        int[] nums4 = {};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
        System.out.println(maxSubArray(nums4));

    }
}
