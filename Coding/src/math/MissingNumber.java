package math;

public class MissingNumber {

    public static int findMissingNumber(int[] nums) {

        if (nums == null || nums.length == 0) throw new IllegalArgumentException("Array is Empty");

        int n = nums.length;

        int expectedSum = (n * (n + 1)) / 2;

        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        int missingNumber = expectedSum - actualSum;
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 3, 4};
        int[] num2 = {};
        System.out.println(findMissingNumber(nums1));
        System.out.println(findMissingNumber(num2));
    }
}
