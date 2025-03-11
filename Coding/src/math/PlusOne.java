package math;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] nums) {

//        nums[nums.length - 1] = nums[nums.length - 1] + 1;
//        return nums;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        nums = new int[nums.length + 1];
        nums[0] = 1;
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 8};
        int[] nums1 = {9, 9, 9};
        int[] nums2 = {2, 9, 9};
        System.out.println(Arrays.toString(plusOne(nums)));
        System.out.println(Arrays.toString(plusOne(nums1)));
        System.out.println(Arrays.toString(plusOne(nums2)));
    }
}


// Solution - https://leetcode.com/problems/plus-one/solutions/2706861/java-fastest-0ms-runtime-easy-and-elegant-solution/

// starting from extreme right--> if array[i] is less than 9 means can be added with 1
// i.e. [ 5,8 ]-->[ 5,9 ] or
//      [ 9,4 ]-->[ 9,5 ] or
//      [ 6,0 ]-->[ 6,1 ]
// and will directly return array

// nums[i] = 0;
// if array[i] is not less than 9, means it has to be 9 only then digit is changed to 0,
// and we again revolve around loop to check for number if less than 9 or not
// i.e. [ 5,9 ]-->[ 5,0 ]-loop->[ 6,0 ] or
//      [ 1,9,9 ]-->[ 1,9,0 ]-loop->[ 1,0,0 ]-loop->[ 2,0,0 ]
// and will directly return array

// if all number inside array are 9
// i.e. [ 9,9,9,9 ] than according to above loop it will become [ 0,0,0,0 ]
// but we have to make it like this [ 9,9,9,9 ]-->[ 1,0,0,0,0 ]