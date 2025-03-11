package arrays;

import java.util.Arrays;

public class ProductArratExceptSelf {

    public static int[] productSelf(int[] nums) {

        if (nums == null || nums.length < 1) return new int[0];

        int[] output = new int[nums.length];

        int leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productSelf(nums)));
    }
}
