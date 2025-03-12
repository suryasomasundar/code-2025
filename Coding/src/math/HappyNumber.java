package math;

import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappyNumber(int n) {

        HashSet<Integer> set = new HashSet<>();

        while(!set.contains(n) && n != 1){
            set.add(n);
            n = getSumOfSquares(n);
        }
        return n == 1;

    }

    public static int getSumOfSquares(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappyNumber(19));
    }
}
