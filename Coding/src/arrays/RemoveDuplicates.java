package arrays;

import java.util.HashSet;

public class RemoveDuplicates {

    public static void removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 3, 4, 4, 3, 2};
        removeDuplicates(nums);
    }
}
